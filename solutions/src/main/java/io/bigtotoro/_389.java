package io.bigtotoro;

/**
 * <a href="https://leetcode.com/problems/find-the-difference/">389. Find the Difference</a>
 */

public class _389 {

    public static class Solution1 {
        public char findTheDifference(String s, String t) {
            int[] chars = new int[26];

            for (int i = 0; i < s.length(); ++i) {
                chars[s.charAt(i) - 'a']++;
            }

            for (int i = 0; i < t.length(); ++i) {
                chars[t.charAt(i) - 'a']--;
                if (chars[t.charAt(i) - 'a'] < 0) {
                    return t.charAt(i);
                }
            }

            return ' ';
        }
    }
}
