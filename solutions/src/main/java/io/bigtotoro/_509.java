package io.bigtotoro;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/fibonacci-number/">509. Fibonacci Number</a>
 */

public class _509 {
    public static class Solution1 {
        /**
         * Time: O(n)
         * Space: O(1)
         */
        public int fib(int N) {
            if (N < 2) {
                return N;
            }
            return fib(N - 1) + fib(N - 2);
        }
    }

    public static class Solution2 {

        private Map<Integer, Integer> cache = new HashMap<>();

        {
            cache.put(0, 0);
            cache.put(1, 1);
        }

        public int fib(int N) {
            if (N < 2) {
                return N;
            }

            Integer l = 0;
            Integer r = 0;
            if (cache.containsKey(N - 1)) {
                l = cache.get(N - 1);
            } else {
                l = fib(N - 1);
                cache.put(N - 1, l);
            }

            if (cache.containsKey(N - 2)) {
                r = cache.get(N - 2);
            } else {
                r = fib(N - 2);
                cache.put(N - 2, r);
            }

            return l + r;
        }
    }
}
