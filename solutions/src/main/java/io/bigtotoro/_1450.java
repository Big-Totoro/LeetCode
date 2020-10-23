package io.bigtotoro;

/**
 * <a href="https://leetcode.com/problems/number-of-students-doing-homework-at-a-given-time/">Number of Students Doing Homework at a Given Time</a>
 */

public class _1450 {
    public static class Solution1 {
        public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
            if (startTime.length != endTime.length) {
                return 0;
            }

            int counter = 0;

            for (int i = 0; i < startTime.length; ++i) {
                if (queryTime >= startTime[i] && queryTime <= endTime[i]) {
                    counter++;
                }
            }

            return counter;
        }
    }
}
