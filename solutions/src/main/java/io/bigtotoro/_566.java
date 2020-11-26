package io.bigtotoro;

/**
 * <a href="https://leetcode.com/problems/reshape-the-matrix/">566. Reshape the Matrix</a>
 */

public class _566 {
    public static class Solution1 {
        public int[][] matrixReshape(int[][] nums, int r, int c) {
            if (nums.length * nums[0].length < r * c) {
                return nums;
            }

            int[][] result = new int[r][c];
            int row1 = 0, col1 = 0;
            int row2 = 0, col2 = 0;
            for (int i = 0; i < r * c; ++i) {
                if (col2 >= c) {
                    ++row2;
                    col2 = 0;
                }
                if (col1 >= nums[0].length) {
                    ++row1;
                    col1 = 0;
                }
                result[row2][col2++] = nums[row1][col1++];
            }

            return result;
        }
    }

    public static class Solution2 {
        public int[][] matrixReshape(int[][] nums, int r, int c) {
            if (nums.length * nums[0].length < r * c) {
                return nums;
            }

            int[][] result = new int[r][c];
            for (int i = 0; i < r * c; ++i) {
                result[i / c][i % c] = nums[i / nums[0].length][i % nums[0].length];
            }
            return result;
        }
    }
}
