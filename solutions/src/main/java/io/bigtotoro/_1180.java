package io.bigtotoro;

/**
 * <a href="https://leetcode.com/problems/count-substrings-with-only-one-distinct-letter/">1180. Count Substrings with Only One Distinct Letter</a>
 */

public class _1180 {
    public static class Solution1 {
        public int countLetters(String S) {
            int count = 1;
            int result = 1;

            for (int i = 1; i < S.length(); ++i) {
                if (S.charAt(i) == S.charAt(i - 1)) {
                    ++count;
                } else {
                    count = 1;
                }

                result += count;
            }

            return result;
        }
    }
}
