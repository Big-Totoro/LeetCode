package io.bigtotoro;

/**
 * <a href="https://leetcode.com/problems/shuffle-string/">1528. Shuffle String</a>
 */

public class _1528 {
    public static class Solution1 {
        public String restoreString(String s, int[] indices) {
            char[] result = new char[s.length()];

            for (int i = 0; i < s.length(); i++) {
                result[indices[i]] = s.charAt(i);
            }

            return new String(result);
        }
    }
}
