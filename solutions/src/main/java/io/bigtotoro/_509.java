package io.bigtotoro;

/**
 * <a href="https://leetcode.com/problems/fibonacci-number/">509. Fibonacci Number</a>
 */

public class _509 {
    public static class Solution1 {
        /**
         * Time: O(n)
         * Space: O(n)
         */
        public int fib(int N) {
            if (N < 2) {
                return N;
            }
            return fib(N - 1) + fib(N - 2);
        }
    }
}
