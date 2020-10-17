package io.bigtotoro;

/**
 * <a href="https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/">1309. Decrypt String from Alphabet to Integer Mapping</a>
 */

public class _1309 {
    public static class Solution1 {
        public String freqAlphabets(String s) {
            StringBuilder builder = new StringBuilder();

            for (int i = 0; i < s.length();) {
                if ((i + 2 < s.length()) && (s.charAt(i + 2) == '#')) {
                    builder.append(decode(s.substring(i, i + 2)));
                    i += 3;
                } else {
                    builder.append(decode(String.valueOf(s.charAt(i++))));
                }
            }

            return builder.toString();
        }

        private Character decode(String input) {
            return (char)(Integer.valueOf(input) + 'a' - 1);
        }
    }
}
