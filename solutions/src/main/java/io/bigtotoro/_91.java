package io.bigtotoro;

public class _91 {
    public static class Solution1 {
        public int numDecodings(String s) {
            int[] dp = new int[s.length() + 1];

            dp[0] = 1;
            dp[1] = (s.charAt(0) == '0') ? 0 : 1;

            for (int i = 2; i < dp.length; ++i) {
                if (s.charAt(i - 1) != '0') {
                    dp[i] = dp[i - 1];
                }

                int number = Integer.valueOf(s.substring(i - 2, i));
                if (number >= 10 && number <= 26) {
                    dp[i] += dp[i - 2];
                }
            }

            return dp[s.length()];
        }
    }
}
