package io.bigtotoro;

/**
 * <a href="https://leetcode.com/problems/missing-number/">268. Missing Number</a>
 */

public class _268 {

    public static class Solution1 {
        public int missingNumber(int[] nums) {
            int result = nums.length;
            for (int i = 0; i < nums.length; ++i) {
                result ^= i ^ nums[i];
            }

            return result;
        }
    }

    public static class Solution2 {
        public int missingNumber(int[] nums) {
            int sum1 = 0;
            int sum2 = 0;
            for (int i = 0; i < nums.length; ++i) {
                sum1 += nums[i];
                sum2 += i + 1;
            }


            return sum2 - sum1;
        }
    }
}
