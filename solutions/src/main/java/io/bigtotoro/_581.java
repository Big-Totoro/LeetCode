package io.bigtotoro;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/shortest-unsorted-continuous-subarray/">581. Shortest Unsorted Continuous Subarray</a>
 */

public class _581 {

    public static class Solution1 {
        public int findUnsortedSubarray(int[] nums) {
            int[] nums2 = nums.clone();
            Arrays.sort(nums2);

            int l = 0;
            int r = nums.length - 1;
            while (l < nums.length && nums[l] == nums2[l]) {
                l++;
            }
            while (r >= 0 && nums[r] == nums2[r]) {
                r--;
            }

            int result = r - l;

            return (result <= 0) ? 0 : result + 1;
        }
    }
}