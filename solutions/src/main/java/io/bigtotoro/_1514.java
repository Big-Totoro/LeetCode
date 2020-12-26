package io.bigtotoro;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * <a href="https://leetcode.com/problems/path-with-maximum-probability/">1514. Path with Maximum Probability</a>
 */

public class _1514 {

    public static class Solution1 {
        public double maxProbability(int n, int[][] edges, double[] succProb, int start, int end) {
            /**
             * Initialize the graph
             */
            Map<Integer, Map<Integer, Double>> graph = new HashMap<>();
            for (int i= 0; i < edges.length; ++i) {
                int source = edges[i][0];
                int destination = edges[i][1];
                double probability = succProb[i];
                /**
                 * For the undirected graph we will add both vertices v -> u and u -> v
                 */
                Map<Integer, Double> adjacency = graph.getOrDefault(source, new HashMap<>());
                adjacency.put(destination, probability);
                graph.put(source, adjacency);

                adjacency = graph.getOrDefault(destination, new HashMap<>());
                adjacency.put(source, probability);
                graph.put(destination, adjacency);
            }

            /**
             * Initialize "distance" and the queue
             */
            double[] distance = new double[n];
            Queue<Integer> queue = new PriorityQueue<>();
            queue.offer(start);
            distance[start] = 1.0;

            /**
             * Looking the path with Dijkstra algorithm
             */
            while (!queue.isEmpty()) {
                int currentNode = queue.poll();
                double currentNodeWeight = distance[currentNode];

                for (Integer nextNode : graph.getOrDefault(currentNode, new HashMap<>()).keySet()) {
                    double nextNodeWeight = graph.get(currentNode).get(nextNode);
                    if (distance[nextNode] < currentNodeWeight * nextNodeWeight) {
                        distance[nextNode] = currentNodeWeight * nextNodeWeight;
                        queue.offer(nextNode);
                    }
                }
            }

            return distance[end];
        }
    }
}
