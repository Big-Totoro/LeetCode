package io.bigtotoro;

/**
 * <a href="https://leetcode.com/problems/to-lower-case/">709. To Lower Case</a>
 */

public class _709 {
    public static class Solution1 {
        /**
         * Time: O(n)
         * Space: O(n)
         */
        public String toLowerCase(String str) {
            char[] result = new char[str.length()];
            char[] input = str.toCharArray();

            for (int i = 0; i < str.length(); ++i) {
                result[i] = ((input[i] >= 'A') && (input[i] <= 'Z')) ? (char)(input[i] + (char)32) : input[i];
            }

            return new String(result);
        }
    }
}
