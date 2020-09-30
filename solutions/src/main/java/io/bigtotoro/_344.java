package io.bigtotoro;

/**
 * <a href="https://leetcode.com/problems/reverse-string/">344. Reverse String</a>
 */

public class _344 {
    public static class Solution1 {
        public void reverseString(char[] s) {
            int t = s.length - 1;

            for (int i = 0; i < s.length / 2; ++i) {
                char tmp = s[i];
                s[i] = s[t];
                s[t--] = tmp;
            }
        }
    }
}
