package io.bigtotoro;

/**
 * <a href="https://leetcode.com/problems/matrix-diagonal-sum/">Matrix Diagonal Sum</a>
 */

public class _1572 {
    public static class Solution1 {
        public int diagonalSum(int[][] mat) {
            if ((mat.length == 0) || (mat[0].length == 0)) {
                return 0;
            }
            if (mat.length == 1) {
                return mat[0][0];
            }

            int sum = 0;

            for (int i = 0, j = mat.length - 1; i < mat.length && j >= 0; ++i, --j) {
                sum += mat[i][i];
                if (i != j) {
                    sum += mat[i][j];
                }
            }

            return sum;
        }
    }
}