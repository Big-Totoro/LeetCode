package io.bigtotoro;

/**
 * <a href="https://leetcode.com/problems/excel-sheet-column-number/">171. Excel Sheet Column Number</a>
 */

public class _171 {
    /**
     * T: O(n)
     * S: O(1)
     */
    public static class Solution1 {
        public int titleToNumber(String s) {
            final int BASE = 26;
            final int ASCII_OFFSET = 64;
            int number = 0;

            for (int i = 0; i < s.length(); ++i) {
                int code = s.charAt(s.length() - i - 1) - ASCII_OFFSET;
                number += code * Math.pow(BASE, i);
            }

            return number;
        }
    }
}
