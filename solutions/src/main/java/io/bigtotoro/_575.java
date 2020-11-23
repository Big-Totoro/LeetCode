package io.bigtotoro;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/distribute-candies/">575. Distribute Candies</a>
 */

public class _575 {
    public static class Solution1 {
        public int distributeCandies(int[] candyType) {
        Arrays.sort(candyType);
        int counter = 1;
        for (int i = 1; i < candyType.length; ++i) {
            if (counter >= candyType.length / 2) {
                return counter;
            }
            if (candyType[i] > candyType[i - 1]) {
                ++counter;
            }
        }

        return counter;
        }
    }
}
