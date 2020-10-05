package io.bigtotoro;

/**
 * <a href="https://leetcode.com/problems/find-numbers-with-even-number-of-digits/">Find Numbers with Even Number of Digits</a>
 */

public class _1295 {
    public static class Solution1 {
        public int findNumbers(int[] nums) {
            int eventCounter = 0;
            int counter = 0;

            for (int n : nums) {
                counter = 0;

                while (n > 0) {
                    n /= 10;
                    ++counter;
                }

                if (counter % 2 == 0) {
                    ++eventCounter;
                }
            }

            return eventCounter;
        }
    }
}
