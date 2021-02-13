package io.bigtotoro;

import java.util.PriorityQueue;

/**
 * <a href="https://leetcode.com/problems/shortest-path-in-binary-matrix/">1091. Shortest Path in Binary Matrix</a>
 */

public class _1091 {

    public static class Node {
        private int row;
        private int col;
        private int distance;

        public static Node valueOf(int row, int col, int distance) {
            Node node = new Node();
            node.row = row;
            node.col = col;
            node.distance = distance;
            return node;
        }

        @Override
        public String toString() {
            return "[" + row + ", " + col + " : " + distance + "]";
        }
    }

    public static class Solution1 {

        private final int[][] DIRECTIONS = {
                {0, -1}, // Left
                {-1, -1}, // Up, Left
                {-1, 0}, // Up
                {-1, 1}, // Up, Right
                {0, 1}, // Right
                {1, 1}, // Down, Right
                {1, 0}, // Down
                {1, -1} // Down, Left
        };

        public int shortestPathBinaryMatrix(int[][] grid) {
            if (grid[0][0] == 1 || grid[grid.length - 1][grid[0].length - 1] == 1) {
                return -1;
            }

            int[][] distances = new int[grid.length][grid[0].length];
            boolean[][] visited = new boolean[grid.length][grid[0].length];
            PriorityQueue<Node> queue = new PriorityQueue<>((u, v) -> u.distance - v.distance);

            for (int r = 0; r < distances.length; ++r) {
                for (int c = 0; c < distances[0].length; ++c) {
                    distances[r][c] = Integer.MAX_VALUE;
                }
            }

            distances[0][0] = 1;
            queue.offer(Node.valueOf(0, 0, 1));
            while (!queue.isEmpty()) {
                Node currentNode = queue.poll();
                int currentNodeDistance = currentNode.distance;

                if (currentNode.row == grid.length - 1 &&
                    currentNode.col == grid[0].length - 1) {
                    return currentNode.distance;
                }

                visited[currentNode.row][currentNode.col] = true;

                for (int[] direction: DIRECTIONS) {
                    int row = currentNode.row + direction[0];
                    int col = currentNode.col + direction[1];

                    if (isValid(grid, row, col) && grid[row][col] == 0) {
                        int newDistance = currentNodeDistance + 1;
                        if (newDistance < distances[row][col]) {
                            distances[row][col] = newDistance;
                            queue.offer(Node.valueOf(row, col, newDistance));
                        }
                    }
                }
            }

            if (distances[grid.length - 1][grid[0].length - 1] == Integer.MAX_VALUE) {
                return -1;
            }

            return distances[grid.length - 1][grid[0].length - 1];
        }

        private boolean isValid(int[][] grid, int row, int col) {
            return row >= 0 && col >= 0 && row < grid.length && col < grid[0].length;
        }
    }
}
