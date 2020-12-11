package io.bigtotoro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/course-schedule/">207. Course Schedule</a>
 */

public class _207 {

    public static class Solution1 {

        public enum Color {
            WHITE, GRAY, BLACK
        }

        /**
         * The Cycle in the graph flag
         */
        private boolean cycle;

        /**
         * List of the nodes and their colors
         */
        private Map<Integer, Color> colorMap = new HashMap<>();

        /**
         * Adjacency list
         */
        private Map<Integer, List<Integer>> adjacencyList = new HashMap<>();

        public boolean canFinish(int numCourses, int[][] prerequisites) {
            if (numCourses <= 0) {
                return false;
            }

            /**
             * Initialize the colors list with White color (not visited)
             */
            for (int i = 0; i < numCourses; ++i) {
                colorMap.put(i, Color.WHITE);
            }

            /**
             * Initialize graph's adjacency.
             */
            for (int i = 0; i < prerequisites.length; ++i) {
                int dst = prerequisites[i][0];
                int src = prerequisites[i][1];

                List<Integer> dstList = adjacencyList.getOrDefault(src, new ArrayList<>());
                dstList.add(dst);
                adjacencyList.put(src, dstList);
            }

            /**
             * Go through all not visited (WHITE) nodes and deep into their adjacency
             */
            for (int i = 0; i < numCourses; ++i) {
                if (colorMap.get(i) == Color.WHITE) {
                    dfs(i);
                }
            }

            return !cycle;
        }

        private void dfs(int node) {
            if (colorMap.get(node) != Color.WHITE) {
                return;
            }

            colorMap.put(node, Color.GRAY);

            for (Integer adjacency : adjacencyList.getOrDefault(node, new ArrayList<>())) {
                if (colorMap.get(adjacency) == Color.WHITE) {
                    dfs(adjacency);
                } else if (colorMap.get(adjacency) == Color.GRAY) {
                    cycle = true;
                }
            }

            colorMap.put(node, Color.BLACK);
        }
    }
}
