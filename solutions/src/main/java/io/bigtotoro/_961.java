package io.bigtotoro;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * <a href="https://leetcode.com/problems/n-repeated-element-in-size-2n-array/">961. N-Repeated Element in Size 2N Array</a>
 */

public class _961 {
    public static class Solution1 {
        public int repeatedNTimes(int[] A) {
            Map<Integer, Integer> map = new HashMap<>();

            for (int n : A) {
                map.compute(n, (k, v) -> (v == null) ? 1 : ++v);
            }

            return map.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
        }
    }

    public static class Solution2 {
        public int repeatedNTimes(int[] A) {
            Set<Integer> set = new HashSet<>();
            for (int n : A) {
                if (set.add(n) == false)
                    return n;
            }

            return -1;
        }
    }
}
