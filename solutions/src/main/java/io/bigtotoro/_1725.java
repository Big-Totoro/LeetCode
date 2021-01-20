package io.bigtotoro;

/**
 * <a href="https://leetcode.com/problems/number-of-rectangles-that-can-form-the-largest-square/">1725. Number Of Rectangles That Can Form The Largest Square</a>
 */

public class _1725 {

    public static class Solution1 {
        public int countGoodRectangles(int[][] rectangles) {
            int max = Integer.MIN_VALUE;
            int count = 0;

            for (int i = 0; i < rectangles.length; i++) {
                int l = rectangles[i][0];
                int r = rectangles[i][1];

                int min = Math.min(l, r);
                max = Math.max(max, min);
            }

            for (int i = 0; i < rectangles.length; i++) {
                int l = rectangles[i][0];
                int r = rectangles[i][1];

                if (Math.min(l, r) == max) {
                    count++;
                }
            }

            return count;
        }
    }
}
