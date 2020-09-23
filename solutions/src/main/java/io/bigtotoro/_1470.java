package io.bigtotoro;

/**
 * <a href="https://leetcode.com/problems/shuffle-the-array/">1470. Shuffle the Array</a>
 */

public class _1470 {
    public static class Solution1 {
        public int[] shuffle(int[] nums, int n) {
            int[] result = new int[nums.length];

            for (int i = 0; i < n; ++i) {
                result[i * 2] = nums[i];
                result[i * 2 + 1] = nums[n + i];
            }

            return result;
        }
    }
}

