package io.bigtotoro;

/**
 * <a href="https://leetcode.com/problems/squares-of-a-sorted-array/">977. Squares of a Sorted Array</a>
 */

public class _977 {
    public static class Solution1 {
        public int[] sortedSquares(int[] A) {
            /**
             * Look for the first non-negative value
             */
            int j = 0;
            while (j < A.length && A[j] < 0) {
                j++;
            }

            int i = j - 1;
            int k = 0;
            int[] result = new int[A.length];

            while (i >= 0 && j < A.length) {
                int pow1 = (int) Math.pow(A[i], 2);
                int pow2 = (int) Math.pow(A[j], 2);

                if (pow1 < pow2) {
                    result[k++] = pow1;
                    i--;
                } else {
                    result[k++] = pow2;
                    j++;
                }
            }

            while (i >= 0) {
                result[k++] = (int) Math.pow(A[i], 2);
                i--;
            }
            while (j < A.length) {
                result[k++] = (int) Math.pow(A[j], 2);
                j++;
            }

            return result;
        }
    }

    public static class Solution2 {
        public int[] sortedSquares(int[] A) {
            int h = 0;
            int t = A.length - 1;
            int k = t;
            int[] result = new int[A.length];

            while (h <= t) {
                if (Math.abs(A[h]) > Math.abs(A[t])) {
                    result[k--] = Math.abs(A[h++]);
                } else {
                    result[k--] = Math.abs(A[t--]);
                }
            }

            for (int i = 0; i < result.length; ++i) {
                result[i] = (int)Math.pow(result[i], 2);
            }

            return result;
        }
    }
}
