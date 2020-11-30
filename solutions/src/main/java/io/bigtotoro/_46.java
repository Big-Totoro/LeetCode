package io.bigtotoro;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/permutations/">46. Permutation</a>
 */

public class _46 {
    public static class Solution1 {
        public List<List<Integer>> permute(int[] nums) {
            if (nums.length == 0) {
                return List.of();
            }

            List<List<Integer>> result = new ArrayList<>();
            permutation(nums, 0, result);

            return result;
        }

        private void permutation(int[] nums, int start, List<List<Integer>> result) {
            if (start == nums.length) {
                List<Integer> array = new ArrayList<>();
                for (int i = 0; i < nums.length; ++i) {
                    array.add(nums[i]);
                }
                result.add(array);
                return;
            }

            for (int i = start; i < nums.length; ++i) {
                swap(nums, i, start);
                permutation(nums, start + 1, result);
                swap(nums, i, start);
            }
        }

        private void swap(int[] nums, int i, int j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
}
