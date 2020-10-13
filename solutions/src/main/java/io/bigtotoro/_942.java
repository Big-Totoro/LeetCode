package io.bigtotoro;

/**
 * <a href="https://leetcode.com/problems/di-string-match/">942. DI String Match</a>
 */

public class _942 {
    public static class Solution1 {
        public int[] diStringMatch(String S) {
            int[] result = new int[S.length() + 1];
            int h = 0;
            int t = S.length();

            for (int i = 0; i < S.length(); ++i) {
                if (S.charAt(i) == 'I') {
                    result[i] = h++;
                } else {
                    result[i] = t--;
                }
            }
            result[result.length - 1] = h;

            return result;
        }
    }
}