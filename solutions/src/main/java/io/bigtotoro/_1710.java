package io.bigtotoro;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/maximum-units-on-a-truck/">1710. Maximum Units on a Truck</a>
 */

public class _1710 {

    public static class Solution1 {
        public int maximumUnits(int[][] boxTypes, int truckSize) {
            Arrays.sort(boxTypes, (l, r) -> r[1] - l[1]);
            int result = 0;
            for (int[] boxType : boxTypes) {
                int boxes = boxType[0];
                int units = boxType[1];
                boxes = Math.min(truckSize, boxes);
                result += boxes * units;
                truckSize -= boxes;
                if (truckSize == 0) {
                    return result;
                }
            }

            return result;
        }
    }
}
