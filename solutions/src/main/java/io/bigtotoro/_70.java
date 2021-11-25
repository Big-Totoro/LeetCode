package io.bigtotoro;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/climbing-stairs/">70. Climbing Stairs</a>
 */

public class _70 {
    public static class Solution1 {

        private Map<Integer, Integer> map = new HashMap<>() {{
            put(0, 1);
            put(1, 1);
            put(2, 2);
        }};

        public int climbStairs(int n) {
            if (map.containsKey(n)) {
                return map.get(n);
            }

            int n1 = climbStairs(n - 1);
            map.put(n - 1, n1);

            int n2 = climbStairs(n - 2);
            map.put(n - 2, n2);

            return n1 + n2;
        }
    }
}
