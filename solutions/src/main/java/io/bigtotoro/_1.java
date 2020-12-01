package io.bigtotoro;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/two-sum/">1. Two Sum</a>
 */

public class _1 {
    public static class Solution1 {
        public int[] twoSum(int[] nums, int target) {
            if (nums.length == 0) {
                return new int[0];
            }

            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; ++i) {
                int diff = target - nums[i];
                if (map.containsKey(diff)) {
                    return new int[] {map.get(diff), i};
                }
                map.put(nums[i], i);
            }

            return new int[0];
        }
    }
}
