package io.bigtotoro;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * <a href="https://leetcode.com/problems/line-reflection/">356. Line Reflection</a>
 */

public class _356 {
    public static class Solution1 {
        public boolean isReflected(int[][] points) {
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            HashMap<Integer, Set<Integer>> map = new HashMap<>();

            for (int[] point : points) {
                if (!map.containsKey(point[1])) {
                    map.put(point[1], new HashSet<>());
                }
                map.get(point[1]).add(point[0]);
                min = Math.min(min, point[0]);
                max = Math.max(max, point[0]);
            }

            int mid = max + min;
            for (Set<Integer> set : map.values()) {
                for (Integer x : set) {
                    if (!set.contains(mid - x)) {
                        return false;
                    }
                }
            }

            return true;
        }
    }
}
