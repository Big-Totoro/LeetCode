package io.bigtotoro;

/**
 * <a href="https://leetcode.com/problems/number-of-corner-rectangles/">750. Number Of Corner Rectangles</a>
 */

public class _750 {

    public static class Solution1 {
        public int countCornerRectangles(int[][] grid) {
            if (grid.length <= 1 || grid[0].length <= 1) {
                return 0;
            }

            int counter = 0;
            for (int r = 0; r < grid.length; ++r) {
                for (int c = 0; c < grid[0].length; ++c) {
                    if (grid[r][c] == 1) {
                        counter += investigate(grid, r, c);
                    }
                }
            }

            return counter;
        }

        private int investigate(int[][] grid, int row, int col) {
            int counter = 0;
            for (int c = col + 1; c < grid[0].length; ++c) {
                for (int r = row + 1; r < grid.length; ++r) {
                    if (grid[row][c] == 1 &&
                        grid[r][col] == 1 && grid[r][c] == 1) {
                        ++counter;
                    }
                }
            }
            return counter;
        }
    }
}
