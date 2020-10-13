package io.bigtotoro;

/**
 * <a href="https://leetcode.com/problems/island-perimeter/">463. Island Perimeter</a>
 */

public class _463 {
    public static class Solution1 {
        public int islandPerimeter(int[][] grid) {
            int perimeter = 0;

            for (int i = 0; i < grid.length; ++i) {
                for (int j = 0; j < grid[0].length; ++j) {
                    int t = 0, b = 0, l = 0, r = 0;

                    // We can ignore the water
                    if (grid[i][j] == 0) {
                        continue;
                    }

                    if (j == 0) {
                        l = 0;
                    } else {
                        l = grid[i][j - 1] * 1;
                    }
                    if (j == grid[0].length - 1) {
                        r = 0;
                    } else {
                        r = grid[i][j + 1] * 1;
                    }
                    if (i == 0) {
                        t = 0;
                    } else {
                        t = grid[i - 1][j] * 1;
                    }
                    if (i == grid.length - 1) {
                        b = 0;
                    } else {
                        b = grid[i + 1][j] * 1;
                    }

                    perimeter += grid[i][j] * 4 - l - t - r - b;
                }
            }

            return perimeter;
        }
    }
}
