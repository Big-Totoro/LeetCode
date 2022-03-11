package io.bigtotoro;

/**
 * <a href="https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/">1493. Longest Subarray of 1's After Deleting One Element</a>
 */

public class _1493 {
    public static class Solution1 {
        public int longestSubarray(int[] nums) {
            if (nums.length == 0) {
                return 0;
            }

            int max = 0, current = 0, extended = 0;
            for (int n : nums) {
                if (n == 0) {
                    extended = current;
                    current = 0;
                } else {
                    ++current;
                    ++extended;
                    max = Math.max(max, extended);
                }
            }

            return max == nums.length ? max - 1 : max;
        }
    }
}
