package io.bigtotoro;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/squirrel-simulation/">594. Longest Harmonious Subsequence</a>
 */

public class _594 {

    public static class Solution1 {
        public int findLHS(int[] nums) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int n : nums) {
                map.put(n, map.getOrDefault(n, 0) + 1);
            }

            int result = 0;
            for (int n : map.keySet()) {
                if (map.containsKey(n + 1)) {
                    result = Math.max(result, map.get(n) + map.get(n + 1));
                }
            }

            return result;
        }
    }
}
