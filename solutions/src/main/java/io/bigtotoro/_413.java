package io.bigtotoro;

/**
 * <a href="https://leetcode.com/problems/arithmetic-slices/">413. Arithmetic Slices</a>
 */

public class _413 {

    public static class Solution1 {
        public int numberOfArithmeticSlices(int[] A) {
            int counter = 0;
            int result = 0;
            for (int i = 0; i < A.length - 2; ++i) {
                if (A[i + 1] - A[i] == A[i + 2] - A[i + 1]) {
                    counter++;
                    result += counter;
                } else {
                    counter = 0;
                }
            }
            return result;
        }
    }
}
