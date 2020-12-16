package io.bigtotoro;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/longest-consecutive-sequence/">128. Longest Consecutive Sequence</a>
 */

public class _128 {
    public static class Solution1 {
        public int longestConsecutive(int[] nums) {
            if (nums.length == 0) {
                return 0;
            }

            Arrays.sort(nums);

            int maxCounter = Integer.MIN_VALUE;
            int counter = 1;
            for (int i = 1; i < nums.length; ++i) {
                if (nums[i] != nums[i - 1]) {
                    if (nums[i] == nums[i - 1] + 1) {
                        ++counter;
                    } else {
                        maxCounter = Math.max(maxCounter, counter);
                        counter = 1;
                    }
                }
            }

            return Math.max(maxCounter, counter);
        }
    }
}
