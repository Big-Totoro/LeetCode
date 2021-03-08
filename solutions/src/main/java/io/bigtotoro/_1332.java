package io.bigtotoro;

/**
 * <a href="https://leetcode.com/problems/remove-palindromic-subsequences/">1332. Remove Palindromic Subsequences</a>
 */

public class _1332 {

    public static class Solution1 {
        public int removePalindromeSub(String s) {
            if (s == null || s.isEmpty()) {
                return 0;
            }

            int l = 0;
            int r = s.length() - 1;
            while (l < r) {
                if (s.charAt(l) != s.charAt(r)) {
                    return 2;
                }
                ++l;
                --r;
            }

            return 1;
        }
    }
}
