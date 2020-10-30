package io.bigtotoro;

/**
 * <a href="https://leetcode.com/problems/generate-a-string-with-characters-that-have-odd-counts/">Generate a String With Characters That Have Odd Counts</a>
 */

public class _1374 {
    public static class Solution1 {
        public String generateTheString(int n) {
            if (n == 0) {
                return "";
            }

            int length = (n % 2 == 0) ? n - 1 : n;
            StringBuilder builder = new StringBuilder(n);

            for (int i = 0; i < length; ++i) {
                builder.append('a');
            }
            if (n % 2 == 0) {
                builder.append('b');
            }

            return builder.toString();
        }
    }
}