package io.bigtotoro;

/**
 * <a href="https://leetcode.com/problems/shortest-distance-to-a-character/">821. Shortest Distance to a Character</a>
 */

public class _821 {
    public static class Solution1 {
        public int[] shortestToChar(String S, char C) {
            int prev = Integer.MIN_VALUE / 2;
            int[] result = new int[S.length()];

            for (int i = 0; i < S.length(); i++) {
                if (S.charAt(i) == C) {
                    prev = i;
                }
                result[i] = i - prev;
            }

            prev = Integer.MAX_VALUE / 2;
            for (int i = S.length() - 1; i >= 0; --i) {
                if (S.charAt(i) == C) {
                    prev = i;
                }
                result[i] = Math.min(prev - i, result[i]);
            }

            return result;
        }
    }
}
