package io.bigtotoro;

import java.util.*;

/**
 * <a href="https://leetcode.com/problems/minimum-height-trees/">310. Minimum Height Trees</a>
 */

public class _310 {

    public static class Solution1 {

        private Map<Integer, List<Integer>> adjacencyMap = new HashMap<>();
        private boolean[] visitedArray;
        private int minHeight = Integer.MAX_VALUE;

        public List<Integer> findMinHeightTrees(int n, int[][] edges) {
            if (n == 0) {
                return List.of();
            }

            for (int i = 0; i < edges.length; i++) {
                int src = edges[i][0];
                int dst = edges[i][1];

                List<Integer> adjacencyList = adjacencyMap.getOrDefault(src, new ArrayList<>());
                adjacencyList.add(dst);
                adjacencyMap.put(src, adjacencyList);
            }

            int[] heights = new int[n];
            for (int node = 0; node < n; ++node) {
                visitedArray = new boolean[n];
                int height = bfs(node);
                heights[node] = height;
                minHeight = Math.min(minHeight, height);
            }

            List<Integer> result = new ArrayList<>();
            for (int node = 0; node < n; ++node) {
                if (heights[node] == minHeight) {
                    result.add(node);
                }
            }

            return result;
        }

        private int bfs(int node) {
            int height = 0;
            Queue<Integer> queue = new LinkedList<>();

            visitedArray[node] = true;
            queue.offer(node);
            while (!queue.isEmpty()) {
                int top = queue.poll();
                ++height;
                for (Integer adjacency : adjacencyMap.getOrDefault(top, new ArrayList<>())) {
                    if (!visitedArray[adjacency]) {
                        visitedArray[adjacency] = true;
                        queue.offer(adjacency);
                    }
                }
            }

            return height;
        }
    }
}
