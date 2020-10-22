package io.bigtotoro;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * <a href="https://leetcode.com/problems/majority-element/">Majority Element</a>
 */

public class _169 {
    /**
     * HashMap
     */
    public static class Solution1 {
        public int majorityElement(int[] nums) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; ++i) {
                map.compute(nums[i], (k, v) -> v == null ? 1 : ++v);
            }

            int maxValue = Integer.MIN_VALUE;
            int maxKey = 0;
            for (var e : map.entrySet()) {
                if (maxValue < e.getValue()) {
                    maxKey = e.getKey();
                    maxValue = e.getValue();
                }
            }

            return maxKey;
        }
    }

    /**
     * Sort
     */
    public static class Solution2 {
        public int majorityElement(int[] nums) {
            Arrays.sort(nums);
            return nums[nums.length / 2];
        }
    }

    /**
     * Randomization
     */
    public static class Solution3 {
        public int majorityElement(int[] nums) {
            Random random = new Random();
            int majorityCount = nums.length / 2;
            int randomIndex;

            randomIndex = Math.abs(random.nextInt(nums.length - 1));

            int counter = 0;
            while (counter <= majorityCount) {
                counter = 0;
                randomIndex = Math.abs(random.nextInt(nums.length - 1));

                for (int i = 0; i < nums.length; ++i) {
                    if (nums[i] == nums[randomIndex]) {
                        ++counter;
                    }
                }
            }

            return nums[randomIndex];
        }
    }

    /**
     * Divide and conquer
     */
    public static class Solution4 {
        public int majorityElement(int[] nums) {
            return majorityElement(nums, 0, nums.length - 1);
        }

        private int majorityElement(int[] nums, int l, int r) {
            if (l == r) {
                return nums[l];
            }

            int mid = l + (r - l) / 2;
            int left = majorityElement(nums, l, mid);
            int right = majorityElement(nums, mid + 1, r);

            int leftCounter = count(nums, left, l, r);
            int rightCounter = count(nums, right, l, r);

            return leftCounter > rightCounter ? left : right;
        }

        private int count(int[] nums, int n, int l, int r) {
            int counter = 0;

            for (int i = l; i <= r; ++i) {
                if (nums[i] == n) {
                    ++counter;
                }
            }

            return counter;
        }
    }

    /**
     * Boyer-Moore Voting
     */
    public static class Solution5 {
        public int majorityElement(int[] nums) {
            Arrays.sort(nums);
            return nums[nums.length / 2];
        }
    }
}
