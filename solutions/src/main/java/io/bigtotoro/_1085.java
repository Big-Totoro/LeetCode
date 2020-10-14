package io.bigtotoro;

/**
 * <a href="https://leetcode.com/problems/sum-of-digits-in-the-minimum-number/">1085. Sum of Digits in the Minimum Number</a>
 */

public class _1085 {
    public static class Solution1 {
        public int sumOfDigits(int[] A) {
            int min = Integer.MAX_VALUE;
            for (int n : A) {
                min = Math.min(n, min);
            }

            int length = (int)Math.log10(min);
            int num = 0;
            for (int i = length; i >= 0; --i) {
                int n = min / (int)Math.pow(10, i);
                num += n % 10;
            }
            return (num % 2 == 0) ? 1 : 0;
        }
    }
}
