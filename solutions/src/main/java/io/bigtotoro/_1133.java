package io.bigtotoro;

/**
 * <a href="https://leetcode.com/problems/largest-unique-number/">1133. Largest Unique Number</a>
 */

public class _1133 {

    public static class Solution1 {
        public int largestUniqueNumber(int[] A) {
            int[] frequency = new int[1000 + 1];
            for (int i = 0; i < A.length; ++i) {
                frequency[A[i]]++;
            }

            int max = Integer.MIN_VALUE;
            for (int i = 1000; i >= 0; --i) {
                if (frequency[i] == 1) {
                    max = Math.max(i, max);
                }
            }

            return (max == Integer.MIN_VALUE) ? -1 : max;
        }
    }
}