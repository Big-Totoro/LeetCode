package io.bigtotoro;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/">1464. Maximum Product of Two Elements in an Array</a>
 */

public class _1464 {
    public static class Solution1 {
        public int maxProduct(int[] nums) {
            if (nums.length < 2) {
                return 0;
            }

            Arrays.sort(nums);

            return (nums[nums.length - 1] - 1) * (nums[nums.length - 2] - 1);
        }
    }

    public static class Solution2 {
        public int maxProduct(int[] nums) {
            if (nums.length < 2) {
                return 0;
            }

            int max = Integer.MIN_VALUE;
            int preMax = Integer.MIN_VALUE;

            for (int i = 0; i < nums.length; ++i) {
                if (nums[i] >= max) {
                    preMax = max;
                    max = nums[i];
                } else if (nums[i] > preMax) {
                    preMax = nums[i];
                }
            }

            --max;
            --preMax;

            return max * preMax;
        }
    }
}
