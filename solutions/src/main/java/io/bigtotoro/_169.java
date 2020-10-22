package io.bigtotoro;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/majority-element/">Majority Element</a>
 */

public class _169 {
    public static class Solution1 {
        public int majorityElement(int[] nums) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; ++i) {
                map.compute(nums[i], (k, v) -> v == null ? 1 : ++v);
            }

            int maxValue = Integer.MIN_VALUE;
            int maxKey = 0;
            for (var e : map.entrySet()) {
                if (maxValue < e.getValue()) {
                    maxKey = e.getKey();
                    maxValue = e.getValue();
                }
            }

            return maxKey;
        }
    }

    public static class Solution2 {
        public int majorityElement(int[] nums) {
            return 0;
        }
    }

    public static class Solution3 {
        public int majorityElement(int[] nums) {
            return 0;
        }
    }

    public static class Solution4 {
        public int majorityElement(int[] nums) {
            return 0;
        }
    }
}
