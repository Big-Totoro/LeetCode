package io.bigtotoro;

import java.util.HashMap;

/**
 * <a href="https://leetcode.com/problems/single-number/">136. Single Number</a>
 */

public class _136 {
    public static class Solution1 {
        public int singleNumber(int[] nums) {
            HashMap<Integer, Integer> map = new HashMap<>(nums.length);
            for (Integer n : nums) {
                map.compute(n, (k, v) -> {
                    if (v == null) {
                        return 1;
                    } else {
                        return ++v;
                    }
                });
            }

            return map.entrySet().stream().filter(k -> k.getValue().equals(1)).findFirst().get().getKey();
        }
    }

    public static class Solution2 {
        public int singleNumber(int[] nums) {
            int v = 0;
            for (int n : nums) {
                v ^= n;
            }

            return v;
        }
    }
}
