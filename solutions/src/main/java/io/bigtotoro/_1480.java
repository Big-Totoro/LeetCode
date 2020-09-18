package io.bigtotoro;

/**
 * <a href="https://leetcode.com/problems/running-sum-of-1d-array/">1480. Running Sum of 1d Array</a>
 */

public class _1480 {
    public static class Solution1 {
        /**
         * Time: O(n ^ 2)
         * Space: O(n)
         */
        public int[] runningSum(int[] nums) {
            int[] result = new int[nums.length];

            for (int i = 0; i < nums.length; ++i) {
                int sum = nums[0];

                for (int j = 1; j <= i; ++j) {
                    sum += nums[j];
                }
                result[i] = sum;
            }

            return result;
        }
    }

    public static class Solution2 {
        public int[] runningSum(int[] nums) {
            int[] result = new int[nums.length];

            int sum = 0;
            for (int i = 0; i < nums.length; ++i) {
                sum += nums[i];
                result[i] = sum;
            }

            return result;
        }
    }
}
