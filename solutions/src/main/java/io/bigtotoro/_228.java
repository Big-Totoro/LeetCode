package io.bigtotoro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/summary-ranges/">228. Summary Ranges</a>
 */

public class _228 {
    public static class Solution {
        public List<String> summaryRanges(int[] nums) {
            if (nums.length == 0) {
                return List.of("0");
            }

            List<String> result = new ArrayList<>();
            for (int i = 0, j = 0; j < nums.length; ++j) {
                i = j;
                while (j + 1 < nums.length && nums[j + 1] == nums[j] + 1) {
                    ++j;
                }

                if (i == j) {
                    result.add(String.valueOf(nums[i]));
                } else {
                    result.add(nums[i] + "->" + nums[j]);
                }
            }

            return result;
        }
    }
}
