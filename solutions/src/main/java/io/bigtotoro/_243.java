package io.bigtotoro;

/**
 * <a href="https://leetcode.com/problems/shortest-word-distance/">243. Shortest Word Distance</a>
 */

public class _243 {
    public static class Solution1 {
        public int shortestDistance(String[] words, String word1, String word2) {
            int idx1 = -1;
            int idx2 = -1;
            int min = words.length;

            for (int i = 0; i < words.length; ++i) {
                String w = words[i];

                if (w.equalsIgnoreCase(word1)) {
                    idx1 = i;
                }
                if (w.equalsIgnoreCase(word2)) {
                    idx2 = i;
                }
                if (idx1 != -1 && idx2 != -1) {
                    int d = Math.abs(idx1 - idx2);
                    if (d < min) {
                        min = d;
                    }
                }
            }

            return min;
        }
    }
}
