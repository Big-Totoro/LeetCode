package io.bigtotoro;

import java.util.Stack;

/**
 * <a href="https://leetcode.com/problems/daily-temperatures/">739. Daily Temperatures</a>
 */

public class _739 {
    public static class Pair<U, V> {
        private U value;
        private V index;

        public Pair(U value, V index) {
            this.value = value;
            this.index = index;
        }

        public static <U, V> Pair valueOf(U value, V index) {
            return new Pair(value, index);
        }
    }
    public static class Solution1 {
        public int[] dailyTemperatures(int[] temperatures) {
            int[] result = new int[temperatures.length];

            Stack<Pair<Integer, Integer>> stack = new Stack<>();
            for (int i = temperatures.length - 1; i >= 0; --i) {
                while (!stack.empty() && stack.peek().value <= temperatures[i]) {
                    stack.pop();
                }

                if (!stack.empty()) {
                    result[i] = stack.peek().index - i;
                }
                stack.push(Pair.valueOf(temperatures[i], i));
            }

            return result;
        }
    }
}
