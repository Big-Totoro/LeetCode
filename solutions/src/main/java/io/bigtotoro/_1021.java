package io.bigtotoro;

/**
 * <a href="https://leetcode.com/problems/remove-outermost-parentheses/">1021. Remove Outermost Parentheses</a>
 */

public class _1021 {
    public static class Solution1 {
        public String removeOuterParentheses(String S) {
            int counter = 0;
            int index = 0;

            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < S.length(); i++) {
                if (S.charAt(i) == '(') {
                    ++counter;
                } else {
                    --counter;
                }

                if (counter == 0) {
                    builder.append(S.substring( index + 1, i));
                    index = i + 1;
                }
            }

            return builder.toString();
        }
    }
}
