package io.bigtotoro;

/**
 * <a href="https://leetcode.com/problems/transpose-matrix/">867. Transpose Matrix</a>
 */

public class _867 {

    public static class Solution1 {
        public int[][] transpose(int[][] A) {
            if (A.length == 0 || A[0].length == 0) {
                return null;
            }

            int[][] result = new int[A[0].length][A.length];

            for (int i = 0; i < A.length; ++i) {
                for (int j = 0; j < A[0].length; ++j) {
                    result[j][i] = A[i][j];
                }
            }

            return result;
        }
    }
}
