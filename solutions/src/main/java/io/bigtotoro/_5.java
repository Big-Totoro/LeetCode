package io.bigtotoro;

/**
 * <a href="https://leetcode.com/problems/longest-palindromic-substring/">5. Longest Palindromic Substring</a>
 */

public class _5 {

    public static class Solution1 {
        public String longestPalindrome(String s) {
            int start = 0;
            int end = 0;
            for (int i = 0; i < s.length(); i++) {
                int oddLen = calcLen(s, i, i);
                int evenLen = calcLen(s, i, i + 1);

                int maxLen = Math.max(oddLen, evenLen);
                if (maxLen > end - start) {
                    start = i - (maxLen - 1) / 2;
                    end = i + maxLen / 2 + 1;
                }
            }

            return s.substring(start, end);
        }

        private int calcLen(String s, int l, int r) {
            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                l--;
                r++;
            }

            return r - l - 1;
        }
    }
}
