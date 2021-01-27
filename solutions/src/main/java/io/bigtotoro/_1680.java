package io.bigtotoro;

/**
 * <a href="https://leetcode.com/problems/concatenation-of-consecutive-binary-numbers/">1680. Concatenation of Consecutive Binary Numbers</a>
 */

public class _1680 {

    public static class Solution1 {
        public int concatenatedBinary(int n) {
            if (n < 1) {
                return 0;
            }

            int mod = 1_000_000_007;
            int result = 0;
            for (int i = 1; i <= n; ++i) {
                String value = Integer.toBinaryString(i);
                for (char c : value.toCharArray()) {
                    result = (result * 2 + (c == '1' ? 1 : 0)) % mod;
                }
            }

            return result;
        }
    }
}
