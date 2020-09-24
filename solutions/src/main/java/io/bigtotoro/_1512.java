package io.bigtotoro;

/**
 * <a href="https://leetcode.com/problems/number-of-good-pairs/">1512. Number of Good Pairs</a>
 */

public class _1512 {
    public static class Solution1 {
        public int numIdenticalPairs(int[] nums) {
            int goodPairs = 0;
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] == nums[j]) {
                        ++goodPairs;
                    }
                }
            }
            return goodPairs;
        }
    }
}
