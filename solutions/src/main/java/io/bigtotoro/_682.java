package io.bigtotoro;

import java.util.Stack;

/**
 * <a href="https://leetcode.com/problems/baseball-game/">682. Baseball Game</a>
 */

public class _682 {
    public static class Solution1 {
        public int calPoints(String[] ops) {
            Stack<String> stack = new Stack<>();
            int result = 0;

            for (int i = 0; i < ops.length; ++i) {
                if (ops[i].equals("+")) {
                    Integer op1 = Integer.valueOf(stack.pop());
                    Integer op2 = Integer.valueOf(stack.peek());
                    stack.push(Integer.toString(op1));
                    stack.push(Integer.toString
                            (op1 + op2));
                } else if (ops[i].equals("D")) {
                    String op = stack.peek();
                    Integer value = Integer.valueOf(op);
                    stack.push(Integer.toString(value * 2));
                } else if (ops[i].equals("C")) {
                    stack.pop();
                } else {
                    stack.push(ops[i]);
                }
            }

            while (!stack.empty()) {
                result += Integer.valueOf(stack.pop());
            }

            return result;
        }
    }
}
