package io.bigtotoro;

import java.util.Stack;

public class _716 {
    public static class MaxStack {

        private final Stack<Integer> stack;
        private final Stack<Integer> maxStack;

        public MaxStack() {
            stack = new Stack<>();
            maxStack = new Stack<>();
        }

        public void push(int x) {
            int max = 0;
            if (maxStack.empty()) {
                maxStack.push(x);
            } else {
                max = maxStack.peek();
            }

            if (x > max) {
                maxStack.push(x);
            } else {
                maxStack.push(max);
            }

            stack.push(x);
        }

        public int pop() {
            maxStack.pop();
            return stack.pop();
        }

        public int top() {
            return stack.peek();
        }

        public int peekMax() {
            return maxStack.peek();
        }

        public int popMax() {
            Stack<Integer> buffer = new Stack<>();
            int max = peekMax();
            while (top() != max) {
                buffer.push(pop());
            }

            pop();

            while (!buffer.empty()) {
                push(buffer.pop());
            }

            return max;
        }
    }
}
