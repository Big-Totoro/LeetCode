package io.bigtotoro;

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
        public int minimumEffortPath(int[][] heights) {
            if (heights.length == 0 || heights[0].length == 0) {
                return 0;
            }



            return 0;
        }
    }
}
