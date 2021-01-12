package io.bigtotoro;

/**
 * <a href="https://leetcode.com/problems/rotate-image/">48. Rotate Image</a>
 */

public class _48 {

    public static class Solution1 {
        public void rotate(int[][] matrix) {
            int n = matrix.length;
            for (int i = 0; i < n / 2 + n % 2; ++i) {
                for (int j = 0; j < n / 2; ++j) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[n - j - 1][i];
                    matrix[n - j - 1][i] = matrix[n - i - 1][n - j - 1];
                    matrix[n - i - 1][n - j - 1] = matrix[j][n - i - 1];
                    matrix[j][n - i - 1] = temp;
                }
            }
        }
    }
}
