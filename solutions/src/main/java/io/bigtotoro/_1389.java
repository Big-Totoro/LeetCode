package io.bigtotoro;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/create-target-array-in-the-given-order/">1389. Create Target Array in the Given Order</a>
 */

public class _1389 {
    public static class Solution1 {
        public int[] createTargetArray(int[] nums, int[] index) {
            List<Integer> targetArray = new ArrayList<>(100);

            for (int i = 0; i < nums.length; ++i) {
                targetArray.add(index[i], nums[i]);
            }

            for (int i = 0; i < nums.length; ++i) {
                nums[i] = targetArray.get(i);
            }

            return nums;
        }
    }
}
