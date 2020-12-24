package io.bigtotoro;

import java.util.*;

/**
 * <a href="https://leetcode.com/problems/network-delay-time/">743. Network Delay Time</a>
 */

public class _743 {

    public static class Solution1 {

        public int networkDelayTime(int[][] times, int N, int K) {
            if (times.length == 0 || N == 0) {
                return 0;
            }

            /**
             * Initialize graph
             */
            Map<Integer, Map<Integer, Integer>> graph = new HashMap<>();
            for (int[] time : times) {
                int source = time[0];
                int destination = time[1];
                int weight = time[2];

                Map<Integer, Integer> adjacency = graph.getOrDefault(source, new HashMap<>());
                adjacency.put(destination, weight);
                graph.put(source, adjacency);
            }

            /**
             * Initialize distance array, visited array and source node
             */
            boolean[] visited = new boolean[N];
            int[] distance = new int[N];

            // All nodes (except the source node) have infinite distance from the source node
            Arrays.fill(distance, Integer.MAX_VALUE);

            // The source node has distance equals to 0
            distance[K] = 0;

            // Initialize the queue and push the source node as first element of the queue
            Queue<Integer> queue = new LinkedList<>();
            queue.offer(K);

            while (!queue.isEmpty()) {
                int currentNode = queue.poll();
                int currentNodeWight = distance[currentNode];

                // Iterate through the neighbors of the current node
                for (int nextNode : graph.get(currentNode).keySet()) {
                    int nextNodeWeight = graph.get(currentNode).get(nextNode);
                    if (currentNodeWight + nextNodeWeight < currentNodeWight) {

                    }
                }
            }

            return 1;
        }
    }
}
