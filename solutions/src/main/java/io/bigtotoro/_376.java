package io.bigtotoro;

/**
 * <a href="https://leetcode.com/problems/wiggle-subsequence/">376. Wiggle Subsequence</a>
 */

public class _376 {

    public static class Solution1 {
        public int wiggleMaxLength(int[] nums) {
            if (nums.length == 2) {
                if (nums[0] == nums[1]) {
                    return 1;
                }
                return nums.length;
            }

            int maxLengthInc = 1;
            int maxLengthDec = 1;

            for (int i = 1; i < nums.length; i++) {
                int difference = nums[i] - nums[i - 1];
                if (difference > 0) {
                    maxLengthInc = maxLengthDec + 1;
                } else if (difference < 0) {
                    maxLengthDec = maxLengthInc + 1;
                }
            }

            return Math.max(maxLengthInc, maxLengthDec);
        }
    }
}
