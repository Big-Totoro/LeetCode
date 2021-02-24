package io.bigtotoro;

import java.util.Stack;

/**
 * <a href="https://leetcode.com/problems/score-of-parentheses/">856. Score of Parentheses</a>
 */

public class _856 {

    public static class Solution1 {
        public int scoreOfParentheses(String S) {
            Stack<Integer> stack = new Stack<>();
            stack.push(0);
            for (Character c : S.toCharArray()) {
                if (c == '(') {
                    stack.push(0);
                } else {
                    int r1 = stack.pop();
                    int r2 = stack.pop();
                    stack.push(r2 + Math.max(2 * r1, 1));
                }
            }
            return stack.pop();
        }
    }
}
