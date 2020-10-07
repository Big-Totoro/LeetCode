package io.bigtotoro;

/**
 * <a href="https://leetcode.com/problems/minimum-time-visiting-all-points/">1266. Minimum Time Visiting All Points</a>
 */

public class _1266 {
    public static class Solution1 {
        public int minTimeToVisitAllPoints(int[][] points) {
            int seconds = 0;

            for (int i = 1; i < points.length; ++i) {
                int x = Math.abs(points[i][0] - points[i - 1][0]);
                int y = Math.abs(points[i][1] - points[i - 1][1]);

                if (x > y) {
                    seconds += x;
                } else {
                    seconds += y;
                }
            }

            return seconds;
        }
    }
}
