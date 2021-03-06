package io.bigtotoro;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * <a href="https://leetcode.com/problems/unique-number-of-occurrences/">1207. Unique Number of Occurrences</a>
 */

public class _1207 {
    /**
     * T: O(n)
     * S: O(n)
     */
    public static class Solution1 {
        public boolean uniqueOccurrences(int[] arr) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < arr.length; ++i) {
                map.compute(arr[i], (k, v) -> v == null ? 1 : ++v);
            }

            Set<Integer> set = new HashSet<>();
            for (Integer e : map.values()) {
                if (!set.add(e)) {
                    return false;
                }
            }

            return true;
        }
    }
}
