package io.bigtotoro;

/**
 * <a href="https://leetcode.com/problems/smallest-string-with-a-given-numeric-value/">1663. Smallest String With A Given Numeric Value</a>
 */

public class _1663 {

    public static class Solution1 {
        public String getSmallestString(int n, int k) {
            int maxChar = k - n;
            char[] array = new char[n];
            for (int i = n - 1; i >= 0; --i) {
                int ch = Math.min(maxChar, 25);
                array[i] = (char)('a' + ch);
                maxChar -= ch;
            }
            return String.valueOf(array);
        }
    }
}