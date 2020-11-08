package io.bigtotoro;

/**
 * <a href="https://leetcode.com/problems/move-zeroes/">283. Move Zeros</a>
 */

public class _283 {
    public static class Solution1 {
        public void moveZeroes(int[] nums) {
            int h = 0;
            int counter = 0;
            for (int i = 0; i < nums.length; ++i) {
                if (nums[i] != 0) {
                    nums[h++] = nums[i];
                } else {
                    ++counter;
                }
            }

            for (int i = 1; i <= counter; ++i) {
                nums[nums.length - i] = 0;
            }
        }
    }
}
