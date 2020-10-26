package io.bigtotoro;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/height-checker/">1051. Height Checker</a>
 */

public class _1051 {
    public static class Solution1 {
        public int heightChecker(int[] heights) {
            int counter = 0;
            int[] heights2 = heights.clone();

            Arrays.sort(heights);

            for (int i = 0; i < heights.length; ++i) {
                if (heights[i] != heights2[i]) {
                    ++counter;
                }
            }

            return counter;
        }
    }
}
