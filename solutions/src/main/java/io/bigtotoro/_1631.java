package io.bigtotoro;

import java.util.PriorityQueue;

/**
 * <a href="https://leetcode.com/problems/path-with-minimum-effort/">1631. Path With Minimum Effort</a>
 */

public class _1631 {

    public static class Solution1 {

        private int pathWithMinEfforts = Integer.MAX_VALUE;

        public int minimumEffortPath(int[][] heights) {
            if (heights.length == 0 || heights[0].length == 0) {
                return 0;
            }

            int result = dfs(heights, 0, 0, heights.length - 1, heights[0].length - 1, 0);

            return result;
        }

        private int dfs(int[][] heights, int row, int col, int endRow, int endCol, int maxDifference) {
            if (row == endRow && col == endCol) {
                pathWithMinEfforts = Math.min(pathWithMinEfforts, maxDifference);

                return maxDifference;
            }

            int currentHeight = heights[row][col];
            heights[row][col] = 0;

            int minEffort = Integer.MAX_VALUE;
            if (col - 1 >= 0 && heights[row][col - 1] != 0) {
                int currentDifference = Math.abs(currentHeight - heights[row][col - 1]);
                int maxCurrentDifference = Math.max(maxDifference, currentDifference);
                if (maxCurrentDifference < pathWithMinEfforts) {
                    int result = dfs(heights, row, col - 1, endRow, endCol, maxCurrentDifference);
                    minEffort = Math.min(minEffort, result);
                }
            }
            if (row - 1 >= 0 && heights[row - 1][col] != 0) {
                int currentDifference = Math.abs(currentHeight - heights[row - 1][col]);
                int maxCurrentDifference = Math.max(maxDifference, currentDifference);
                if (maxCurrentDifference < pathWithMinEfforts) {
                    int result = dfs(heights, row - 1, col, endRow, endCol, maxCurrentDifference);
                    minEffort = Math.min(minEffort, result);
                }
            }
            if (col + 1 <= endCol && heights[row][col + 1] != 0) {
                int currentDifference = Math.abs(currentHeight - heights[row][col + 1]);
                int maxCurrentDifference = Math.max(maxDifference, currentDifference);
                if (maxCurrentDifference < pathWithMinEfforts) {
                    int result = dfs(heights, row, col + 1, endRow, endCol, maxCurrentDifference);
                    minEffort = Math.min(minEffort, result);
                }
            }
            if (row + 1 <= endRow && heights[row + 1][col] != 0) {
                int currentDifference = Math.abs(currentHeight - heights[row + 1][col]);
                int maxCurrentDifference = Math.max(maxDifference, currentDifference);
                if (maxCurrentDifference < pathWithMinEfforts) {
                    int result = dfs(heights, row + 1, col, endRow, endCol, maxCurrentDifference);
                    minEffort = Math.min(minEffort, result);
                }
            }
            heights[row][col] = currentHeight;

            return minEffort;
        }
    }

    public static class Solution2 {
        public static class Node {
            private int x;
            private int y;
            private int difference;

            public static Node valueOf(int x, int y, int difference) {
                Node node = new Node();
                node.x = x;
                node.y = y;
                node.difference = difference;

                return node;
            }
        }

        public int minimumEffortPath(int[][] heights) {
            if (heights.length == 0 || heights[0].length == 0) {
                return 0;
            }

            int[][] directions = new int[][] {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
            int endX = heights.length - 1;
            int endY = heights[0].length - 1;

            /**
             * Initialize the difference matrix
             */
            int[][] differenceMatrix = new int[heights.length][heights[0].length];
            for (int r = 0; r < heights.length; ++r) {
                for (int c = 0; c < heights[0].length; ++c) {
                    differenceMatrix[r][c] = Integer.MAX_VALUE;
                }
            }

            // Initialize the visited matrix
            boolean[][] visitedMatrix = new boolean[heights.length][heights[0].length];

            // Initialize the first/start element
            differenceMatrix[0][0] = 0;

            PriorityQueue<Node> priorityQueue = new PriorityQueue<>((u, v) -> u.difference - v.difference);
            priorityQueue.offer(Node.valueOf(0, 0, 0));
            while (!priorityQueue.isEmpty()) {
                Node top = priorityQueue.poll();

                if (top.x == endX && top.y == endY) {
                    return top.difference;
                }
                visitedMatrix[top.x][top.y] = true;

                // Loop through the four directions and check if we have available ones
                for (int[] direction : directions) {
                    // Calculate the adjacency node coordinates
                    int adjacencyX = top.x + direction[0];
                    int adjacencyY = top.y + direction[1];

                    // Check if the adjacency node is in the matrix constraints and we have not visited it yet
                    if (isValid(heights, adjacencyX, adjacencyY) && !visitedMatrix[adjacencyX][adjacencyY]) {
                        // Calculate the difference between the current node and the adjacency node
                        int currentDifference = Math.abs(heights[top.x][top.y] - heights[adjacencyX][adjacencyY]);

                        // Get the maximum difference between the calculated value in the different matrix and
                        // new value
                        int maxDifference = Math.max(currentDifference, differenceMatrix[top.x][top.y]);

                        // If we get the new maximum value then update the difference matrix and push the node to
                        // the priority queue as a candidate for the further investigation
                        if (maxDifference < differenceMatrix[adjacencyX][adjacencyY]) {
                            differenceMatrix[adjacencyX][adjacencyY] = maxDifference;
                            priorityQueue.offer(Node.valueOf(adjacencyX, adjacencyY, maxDifference));
                        }
                    }
                }
            }

            return differenceMatrix[endX][endY];
        }

        private boolean isValid(int[][] heights, int x, int y) {
            return x >= 0 && y >= 0 && x <= heights.length - 1 && y <= heights[0].length - 1;
        }
    }
}
