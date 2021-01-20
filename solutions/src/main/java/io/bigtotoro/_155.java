package io.bigtotoro;

import java.util.Stack;

/**
 * <a href="https://leetcode.com/problems/min-stack/">155. Min Stack</a>
 */

public class _155 {

    public static class MinStack {

        private Stack<Integer> stack = new Stack<>();
        private Stack<Integer> minStack = new Stack<>();

        /** initialize your data structure here. */
        public MinStack() {

        }

        public void push(int x) {
            if (minStack.isEmpty() || x <= minStack.peek()) {
                minStack.push(x);
            }
            stack.push(x);
        }

        public void pop() {
            int value = stack.pop();
            if (!minStack.isEmpty() && value == minStack.peek()) {
                minStack.pop();
            }
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return minStack.peek();
        }
    }
}
