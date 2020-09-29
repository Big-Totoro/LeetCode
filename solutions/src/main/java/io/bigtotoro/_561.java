package io.bigtotoro;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/array-partition-i/">561. Array Partition I</a>
 */

public class _561 {
    public static class Solution1 {
        public int arrayPairSum(int[] nums) {
            int sum = 0;

            Arrays.sort(nums);
            for (int i = 0; i < nums.length; i += 2) {
                sum += nums[i];
            }

            return sum;
        }
    }
}
