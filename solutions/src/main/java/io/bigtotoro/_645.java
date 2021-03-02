package io.bigtotoro;

/**
 * <a href="https://leetcode.com/problems/set-mismatch/">645. Set Mismatch</a>
 */

public class _645 {

    public static class Solution1 {
        public int[] findErrorNums(int[] nums) {
            int[] copyCounter = new int[nums.length + 1];
            for (int n : nums) {
                copyCounter[n]++;
            }

            int[] result = new int[2];
            for (int i = 1; i < copyCounter.length; ++i) {
                if (copyCounter[i] == 0) {
                    result[1] = i;
                } else if (copyCounter[i] > 1) {
                    result[0] = i;
                }
            }

            return result;
        }
    }
}
