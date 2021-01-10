package io.bigtotoro;

/**
 * <a href="https://leetcode.com/problems/first-unique-character-in-a-string/">387. First Unique Character in a String</a>
 */

public class _387 {

    public static class Solution1 {

        public int firstUniqChar(String s) {
            int[] freq = new int[26];
            for (char c : s.toCharArray()) {
                freq[c - 'a']++;
            }

            for (int i = 0; i < s.length(); ++i) {
                if (freq[s.charAt(i) - 'a'] == 1) {
                    return i;
                }
            }

            return -1;
        }
    }
}
