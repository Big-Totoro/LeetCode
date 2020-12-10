package io.bigtotoro;

import java.util.*;

/**
 * <a href="https://leetcode.com/problems/course-schedule-ii/">210. Course Schedule II</a>
 */

public class _210 {

    public static class Solution1 {

        private boolean cycle = false;

        public enum Color {
            WHITE, GRAY, BLACK
        }

        private Map<Integer, List<Integer>> adjacencyMap = new HashMap<>();
        private Map<Integer, Color> colorMap = new HashMap<>();
        private LinkedList<Integer> result = new LinkedList<>();

        public int[] findOrder(int numCourses, int[][] prerequisites) {
            if (numCourses == 0) {
                return new int[0];
            }

            /**
             * Initialize vertices colors
             */
            for (int i = 0; i < numCourses; ++i) {
                colorMap.put(i, Color.WHITE);
            }

            /**
             * Create Adjacency list bases on prerequisites list
             */
            for (int i = 0; i < prerequisites.length; ++i) {
                int dst = prerequisites[i][0];
                int src = prerequisites[i][1];

                List<Integer> dstList = adjacencyMap.getOrDefault(src, new ArrayList<>());
                dstList.add(dst);
                adjacencyMap.put(src, dstList);
            }

            for (int i = 0; i < numCourses; ++i) {
                if (colorMap.get(i) == Color.WHITE) {
                    dfs(i);
                }
            }

            /**
             * Return the empty array if we detected the cycle.
             */
            if (cycle == true) {
                return new int[0];
            }

            /**
             * Copy the result topologically sorted list to the array
             */
            int[] temp = new int[result.size()];
            for (int i = 0; i < result.size(); ++i) {
               temp[i] = result.get(i);
            }

            return temp;
        }

        private void dfs(int node) {
            /**
             * Check for the cycle and stop if the cycle was detected.
             */
            if (cycle == true) {
                return;
            }

            colorMap.put(node, Color.GRAY);

            List<Integer> adjacencyNodes = adjacencyMap.getOrDefault(node, new ArrayList<>());
            for (Integer adjacencyNode : adjacencyNodes) {
                /**
                 * If the node has not been visited then go with it
                 */
                if (colorMap.get(adjacencyNode) == Color.WHITE) {
                    dfs(adjacencyNode);
                } else if (colorMap.get(adjacencyNode) == Color.GRAY) {
                    /**
                     * If we marked the node as GRAY (in process) and visit the node again then we have the cycle.
                     * It means we will not be abel to topologically sort the graph.
                     */
                    cycle = true;
                }
            }
            /**
             * Mark the node as visited
             */
            colorMap.put(node, Color.BLACK);

            /**
             * Add node to the list in the proper topologically sorted order
             */
            result.addFirst(node);
        }
    }
}
