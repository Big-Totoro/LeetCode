package io.bigtotoro;

/**
 * <a href="https://leetcode.com/problems/broken-calculator/">991. Broken Calculator</a>
 */

public class _991 {

    public static class Solution1 {
        public int brokenCalc(int X, int Y) {
            int result = 0;

            while (X < Y) {
                if (Y % 2 == 0) {
                    Y /= 2;
                } else {
                    Y++;
                }
                ++result;
            }
            return result + (X - Y);
        }
    }
}
