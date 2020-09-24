package io.bigtotoro;

/**
 * <a href="https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/">1365. How Many Numbers Are Smaller Than the Current Number</a>
 */

public class _1365 {
    public static class Solution1 {
        public int[] smallerNumbersThanCurrent(int[] nums) {
            int[] result = new int[nums.length];

            for (int i = 0; i < nums.length; ++i) {
                int counter = 0;
                for (int j = 0; j < nums.length; j++) {
                    if ((nums[i] > nums[j]) && (i != j)) {
                        ++counter;
                    }
                }
                result[i] = counter;
            }

            return result;
        }
    }

    public static class Solution2 {
        public int[] smallerNumbersThanCurrent(int[] nums) {
            int[] temp = new int[101];
            int maxIndex = 0;

            for (int i = 0; i < nums.length; ++i) {
                temp[nums[i]]++;

                /**
                 * Look for the max index based on the maximum number in the nums array.
                 * It allows to iterate less then 101 elements in the next loop.
                 */
                if (maxIndex < nums[i]) {
                    maxIndex = nums[i];
                }
            }

            for (int i = 1; i < maxIndex; ++i) {
                temp[i] += temp[i - 1];
            }

            for (int i = 0; i < nums.length; ++i) {
                nums[i] = (nums[i] == 0) ? 0 : temp[nums[i] - 1];
            }

            return nums;
        }
    }
}
