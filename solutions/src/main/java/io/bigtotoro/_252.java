package io.bigtotoro;

import java.util.Arrays;
import java.util.Comparator;

/**
 * <a href="https://leetcode.com/problems/meeting-rooms/">252. Meeting Rooms</a>
 */

public class _252 {

    public static class Solution1 {
        public boolean canAttendMeetings(int[][] intervals) {
            if (intervals.length == 0) {
                return true;
            }

            Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));

            for (int i = 1; i < intervals.length; ++i) {
                if (intervals[i - 1][1] > intervals[i][0]) {
                    return false;
                }
            }

            return true;
        }
    }
}
