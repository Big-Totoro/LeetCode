package io.bigtotoro;

/**
 * <a href="https://leetcode.com/problems/sort-array-by-parity-ii/">922. Sort Array By Parity II</a>
 */

public class _922 {
    public static class Solution1 {
        public int[] sortArrayByParityII(int[] A) {
            int[] result = new int[A.length];

            int e = 0;
            int o = 1;
            for (int i = 0; i < A.length; ++i) {
                if (A[i] % 2 == 0) {
                    result[e] = A[i];
                    e += 2;
                } else {
                    result[o] = A[i];
                    o += 2;
                }
            }

            return result;
        }
    }

    public static class Solution2 {
        public int[] sortArrayByParityII(int[] A) {
            int e = 0;
            int o = A.length - 1;

            while (e < A.length - 1) {
                if (A[e] % 2 == 0) {
                    e += 2;
                } else if (A[o] % 2 != 0) {
                    o -= 2;
                } else {
                    int temp = A[o];
                    A[o] = A[e];
                    A[e] = temp;
                }
            }

            return A;
        }
    }
}