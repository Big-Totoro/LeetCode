package io.bigtotoro;

/**
 * <a href="https://leetcode.com/problems/sort-array-by-parity/">905. Sort Array By Parity</a>
 */

public class _905 {
    public static class Solution1 {
        public int[] sortArrayByParity(int[] A) {
            int[] result = new int[A.length];
            int h = 0;
            int t = A.length - 1;

            for (int i = 0; i < A.length; ++i) {
                if (A[i] % 2 == 0) {
                    result[h++] = A[i];
                } else {
                    result[t--] = A[i];
                }
            }

            return result;
        }
    }
}
