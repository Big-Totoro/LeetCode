package io.bigtotoro;

/**
 * <a href="https://leetcode.com/problems/number-of-lines-to-write-string/">806. Number of Lines To Write String</a>
 */

public class _806 {

    public static class Solution1 {
        public int[] numberOfLines(int[] widths, String S) {
            int buffer = 0;
            int lines = 0;

            for (int i = 0; i < S.length(); ++i) {
                buffer += widths[S.charAt(i) - 'a'];
                if (buffer > 100) {
                    lines++;
                    buffer = widths[S.charAt(i) - 'a'];
                }
            }
            return new int[] {lines + 1, buffer};
        }
    }
}