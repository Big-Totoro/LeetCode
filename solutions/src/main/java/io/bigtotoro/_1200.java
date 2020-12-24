package io.bigtotoro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/minimum-height-trees/">310. Minimum Height Trees</a>
 */

public class _1200 {

    public static class Solution1 {
        public List<List<Integer>> minimumAbsDifference(int[] arr) {
            if (arr.length == 0) {
                return List.of();
            }

            List<List<Integer>> result = new ArrayList<>();
            int minDistance = Integer.MAX_VALUE;
            Arrays.sort(arr);
            for (int i = 0; i < arr.length - 1; ++i) {
                int distance = Math.abs(arr[i] - arr[i + 1]);
                if (distance < minDistance) {
                    minDistance = distance;
                    result.clear();
                    result.add(List.of(arr[i], arr[i + 1]));
                } else if (distance == minDistance) {
                    result.add(List.of(arr[i], arr[i + 1]));
                }
            }

            return result;
        }
    }
}
