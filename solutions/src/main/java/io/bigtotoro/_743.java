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
            boolean[] visited = new boolean[N + 1];
            int[] distance = new int[N + 1];

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

                if (!visited[currentNode]) {
                    visited[currentNode] = true;

                    // Iterate through the neighbors of the current node
                    for (int nextNode : graph.getOrDefault(currentNode, new HashMap<>()).keySet()) {
                        if (!visited[nextNode]) {
                            int nextNodeWeight = graph.get(currentNode).get(nextNode);
                            if (currentNodeWight + nextNodeWeight < distance[nextNode]) {
                                distance[nextNode] = currentNodeWight + nextNodeWeight;
                                queue.offer(nextNode);
                            }
                        }
                    }
                }
            }

            int maxTime = Integer.MIN_VALUE;
            for (int i = 1; i <= N; ++i) {
                if (distance[i] == Integer.MAX_VALUE) {
                    return -1;
                }

                maxTime = Math.max(maxTime, distance[i]);
            }

            return maxTime;
        }
    }
}
