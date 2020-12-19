package io.bigtotoro;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/">448. Find All Numbers Disappeared in an Array</a>
 */

public class _448 {

    public static class Solution1 {
        public List<Integer> findDisappearedNumbers(int[] nums) {
            if (nums.length == 0) {
                return List.of();
            }

            for (int i = 0; i < nums.length; ++i) {
                int index = Math.abs(nums[i]) - 1;
                nums[index] = -Math.abs(nums[index]);
            }

            List<Integer> result = new ArrayList<>();
            for (int i = 0; i < nums.length; ++i) {
                if (nums[i] > 0) {
                    result.add(i + 1);
                }
            }

            return result;
        }
    }
}
