package io.bigtotoro;

import java.util.List;

/**
 * <a href="https://leetcode.com/problems/longest-word-in-dictionary-through-deleting/">524. Longest Word in Dictionary through Deleting</a>
 */

public class _524 {

    public static class Solution1 {

        public String findLongestWord(String s, List<String> d) {
            d.sort((a, b) -> {
                if (a.length() == b.length()) {
                    return a.compareTo(b);
                }

                return b.length() - a.length();
            });

            for (String str : d) {
                if (verify(str, s)) {
                    return str;
                }
            }

            return "";
        }

        private boolean verify(String left, String right) {
            int l = 0;
            int r = 0;
            while (l < left.length() && r < right.length()) {
                if (left.charAt(l) == right.charAt(r)) {
                    l++;
                }
                r++;
            }

            return l == left.length();
        }
    }
}
