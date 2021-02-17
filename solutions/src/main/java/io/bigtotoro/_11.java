package io.bigtotoro;

/**
 * <a href="https://leetcode.com/problems/letter-case-permutation/">784. Letter Case Permutation</a>
 */

public class _11 {

    public static class Solution1 {
        public int maxArea(int[] height) {
            if (height.length == 0) {
                return 0;
            }

            int l = 0;
            int r = height.length - 1;
            int maxArea = 0;
            while (l < r) {
                maxArea = Math.max(maxArea, Math.min(height[l], height[r]) * (r - l));
                if (height[l] < height[r]) {
                    l++;
                } else {
                    r--;
                }
            }

            return maxArea;
        }
    }
}