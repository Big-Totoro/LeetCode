package io.bigtotoro;

/**
 * <a href="https://leetcode.com/problems/valid-palindrome/">125. Valid Palindrome</a>
 */

public class _125 {
    public static class Solution1 {
        public boolean isPalindrome(String s) {
            int left = 0, right = s.length() - 1;

            while (left < right) {
                while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                    ++left;
                }

                while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                    --right;
                }

                if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                    return false;
                }
                ++left;
                --right;
            }

            return true;
        }
    }
}
