package io.bigtotoro;

/**
 * <a href="https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/">Count Negative Numbers in a Sorted Matrix</a>
 */

public class _1351 {
    public static class Solution1 {
        public int countNegatives(int[][] grid) {
            int result = 0;

            for (int i = 0; i < grid.length; ++i) {
                for (int j = 0; j < grid[0].length; ++j) {
                    if (grid[i][j] < 0) {
                        ++result;
                    }
                }
            }

            return result;
        }
    }

    public static class Solution2 {
        public int countNegatives(int[][] grid) {
            int result = 0;

            for (int i = 0; i < grid.length; ++i) {
                result += search(grid[i], 0, grid[i].length - 1);
            }

            return result;
        }

        private int search(int[] row, int l, int r) {
            if (l > r) {
                return 0;
            }

            int result = 0;

            int mid = l + (r - l) / 2;
            if (row[mid] < 0) {
                ++result;
            }

            result += search(row, mid + 1, r);
            return result + search(row, l, mid - 1);
        }
    }

    public static class Solution3 {
        public int countNegatives(int[][] grid) {
            int result = 0;

            for (int i = 0; i < grid.length; ++i) {
                result += search(grid[i], 0, grid[i].length - 1);
            }

            return result;
        }

        private int search(int[] row, int l, int r) {
            int result = 0;

            while (l <= r) {
                int mid = l + (r - l) / 2;
                if (row[mid] >= 0) {
                    l = mid + 1;
                } else {
                    result += r - mid + 1;
                    r = mid - 1;
                }
            }

            return result;
        }
    }
}
