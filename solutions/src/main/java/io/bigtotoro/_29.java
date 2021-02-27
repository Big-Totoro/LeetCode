package io.bigtotoro;

/**
 * <a href="https://leetcode.com/problems/divide-two-integers/">29. Divide Two Integers</a>
 */

public class _29 {

    public static class Solution1 {
        public int divide(int dividend, int divisor) {
            if (dividend == Integer.MIN_VALUE && divisor == -1) {
                return Integer.MAX_VALUE;
            }

            int quotient = 0;
            int expected = Math.abs(dividend);
            int candidate = Math.abs(divisor);
            int leftShift = 0;

            while (candidate <= expected) {
                while (candidate <= expected && candidate << 1 < expected) {
                    candidate <<= 1;
                    ++leftShift;
                }
                quotient += Math.pow(2, leftShift);
                expected = Math.abs(expected - candidate);
                candidate = Math.abs(divisor);
                leftShift = 0;
            }

            if (dividend < 0 && divisor < 0) {
                return quotient;
            }
            if (dividend < 0 || divisor < 0) {
                return -quotient;
            }

            return quotient;
        }
    }

    public static class Solution2 {
        public int divide(int dividend, int divisor) {
            if (dividend == Integer.MIN_VALUE && divisor == -1) {
                return Integer.MAX_VALUE;
            }
            int d = Math.abs(divisor);
            int d2 = d;
            int d1 = Math.abs(dividend);
            int quotient = 0;
            while (d2 <= d1) {
                d2 <<= 1;
                ++quotient;
            }

            if (dividend < 0 && divisor < 0) {
                return quotient;
            }
            if (dividend < 0 || divisor < 0) {
                return -quotient;
            }

            return quotient;
        }
    }
}
