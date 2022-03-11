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
                if ((j + 1 < nums.length) && (nums[j + 1] == nums[j] + 1)) {
                    continue;
                }

                if (i == j) {
                    result.add(String.valueOf(nums[j]));
                } else {
                    result.add(nums[i] + "->" + nums[j]);
                }
                i = j + 1;
            }

            return result;
        }
    }
}
