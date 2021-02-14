package io.bigtotoro;

import java.util.*;

/**
 * <a href="https://leetcode.com/problems/is-graph-bipartite/">785. Is Graph Bipartite</a>
 */

public class _785 {

    public static class Solution1 {

        public enum Color {
            WHITE, RED, BLACK
        }

        /**
         * List of the nodes and their colors
         */
        private Map<Integer, Color> colorMap = new HashMap<>();

        /**
         * Adjacency list
         */
        Map<Integer, List<Integer>> adjacencyMap = new HashMap<>();

        public boolean isBipartite(int[][] graph) {
            if (graph.length == 0) {
                return false;
            }

            for (int node = 0; node < graph.length; ++node) {
                List<Integer> adjacencyNodes = adjacencyMap.getOrDefault(node, new ArrayList<>());
                for (int j = 0; j < graph[node].length; ++j) {
                    adjacencyNodes.add(graph[node][j]);
                }
                adjacencyMap.put(node, adjacencyNodes);
            }

            /**
             * Initialize the colors list with White color (not visited)
             */
            for (int node = 0; node < graph.length; ++node) {
                colorMap.put(node, Color.WHITE);
            }

            /**
             * Go through all not visited (WHITE) nodes and deep into their adjacency
             */
            Queue<Integer> queue = new LinkedList<>();
            queue.offer(0);
            while (!queue.isEmpty()) {
                Integer node = queue.poll();

                // If the node is not marked with the color then mark it
                if (colorMap.get(node) == Color.WHITE) {
                    colorMap.put(node, Color.RED);
                }

                // Loop through all adjacency nodes, assign the color and check if the assigned color
                // is the same for the both adjacency nodes
                for (Integer adjacency : adjacencyMap.getOrDefault(node, new ArrayList<>())) {
                    if (colorMap.get(adjacency) == Color.WHITE) {
                        // Invert the color of the adjacency node regarding to the node from the queue
                        Color color = (colorMap.get(node) == Color.RED) ? Color.BLACK : Color.RED;
                        colorMap.put(adjacency, color);
                        queue.offer(adjacency);
                    } else if (colorMap.get(node) == colorMap.get(adjacency)) {
                        return false;
                    }
                }
            }

            return true;
        }
    }
}
