package io.bigtotoro;

/**
 * <a href="https://leetcode.com/problems/split-a-string-in-balanced-strings/">1221. Split a String in Balanced Strings</a>
 */

public class _1221 {
    public static class Solution1 {
        public int balancedStringSplit(String s) {
            int counter = 0;
            int sum = 0;

            for (char ch : s.toCharArray()) {
                if (ch == 'L') {
                    ++sum;
                } else {
                    --sum;
                }
                if (sum == 0) {
                    ++counter;
                }
            }

            return counter;
        }
    }
}
