package io.bigtotoro;

/**
 * <a href="https://leetcode.com/problems/check-if-all-1s-are-at-least-length-k-places-away/">1437. Check If All 1's Are at Least Length K Places Away</a>
 */

public class _1437 {

    public static class Solution1 {
        public boolean kLengthApart(int[] nums, int k) {
            int counter = k;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 1) {
                    if (counter < k) {
                        return false;
                    }

                    counter = 0;
                } else {
                    counter++;
                }
            }

            return true;
        }
    }
}
