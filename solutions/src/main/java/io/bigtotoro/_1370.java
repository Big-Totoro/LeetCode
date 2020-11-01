package io.bigtotoro;

/**
 * <a href="https://leetcode.com/problems/increasing-decreasing-string/">1370. Increasing Decreasing String</a>
 */

public class _1370 {
    public static class Solution1 {
        public String sortString(String s) {
            if (s.length() <= 0) {
                return s;
            }

            StringBuilder builder = new StringBuilder();
            char[] alphabet = new char[26];
            for (int i = 0; i < s.length(); ++i) {
                alphabet[s.charAt(i) - 'a']++;
            }

            while (builder.length() < s.length()) {
                for (int i = 0; i < alphabet.length; ++i) {
                    if (alphabet[i] > 0) {
                        builder.append((char) ('a' + i));
                        --alphabet[i];
                    }
                }

                for (int i = alphabet.length - 1; i >= 0; --i) {
                    if (alphabet[i] > 0) {
                        builder.append((char) ('a' + i));
                        --alphabet[i];
                    }
                }
            }

            return builder.toString();
        }
    }
}
