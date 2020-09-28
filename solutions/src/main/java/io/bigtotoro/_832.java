package io.bigtotoro;

/**
 * <a href="https://leetcode.com/problems/flipping-an-image/">832. Flipping an Image</a>
 */

public class _832 {
    public static class Solution1 {
        public int[][] flipAndInvertImage(int[][] A) {
            for (int r = 0; r < A.length; r++) {
                for (int c = 0; c < A[r].length / 2; c++) {
                    int idx = A[r].length - c - 1;
                    int temp = A[r][c];
                    A[r][c] = A[r][idx];
                    A[r][idx] = temp;

                    if (A[r][c] == 1) {
                        A[r][c] = 0;
                    } else {
                        A[r][c] = 1;
                    }

                    if (A[r][idx] == 1) {
                        A[r][idx] = 0;
                    } else {
                        A[r][idx] = 1;
                    }
                }

                if (A[r].length % 2 != 0) {
                    if (A[r][A[r].length / 2] == 1) {
                        A[r][A[r].length / 2] = 0;
                    } else {
                        A[r][A[r].length / 2] = 1;
                    }
                }
            }
            return A;
        }
    }
}
