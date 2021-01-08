package io.bigtotoro;

/**
 * <a href="https://leetcode.com/problems/remove-element/">27. Remove Element</a>
 */

public class _27 {

    public static class Solution1 {
        public int removeElement(int[] nums, int val) {
            if (nums.length == 0) {
                return 0;
            }

            int l = 0;
            int r = nums.length;
            while (l < r) {
                if (nums[l] == val) {
                    nums[l] = nums[r - 1];
                    --r;
                } else {
                    ++l;
                }
            }

            return l;
        }
    }

    public static class Solution2 {
        public int removeElement(int[] nums, int val) {
        if (nums.length == 0) {
            return 0;
        }

        int i = 0;
        for (int j = 0; j < nums.length; ++j) {
            if (nums[j] != val) {
                nums[i++] = nums[j];
            }
        }

        return i;
        }
    }
}
