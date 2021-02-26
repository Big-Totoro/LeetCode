package io.bigtotoro;

import java.util.Stack;

/**
 * <a href="https://leetcode.com/problems/validate-stack-sequences/">946. Validate Stack Sequences</a>
 */

public class _946 {

    public static class Solution1 {
        public boolean validateStackSequences(int[] pushed, int[] popped) {
            Stack<Integer> stack = new Stack<>();
            int j = 0;
            for (int i = 0; i < pushed.length; ++i) {
                stack.push(pushed[i]);
                while (!stack.isEmpty() && stack.peek() == popped[j]) {
                    stack.pop();
                    ++j;
                }
            }

            return stack.isEmpty();
        }
    }
}