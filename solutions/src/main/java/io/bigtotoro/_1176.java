package io.bigtotoro;

/**
 * <a href="https://leetcode.com/problems/diet-plan-performance/">1176. Diet Plan Performance</a>
 */

public class _1176 {

    public static class Solution1 {
        public int dietPlanPerformance(int[] calories, int k, int lower, int upper) {
            if (calories.length == 0) {
                return 0;
            }

            int result = 0;
            int sum = 0;
            for (int i = 0; i < k; ++i) {
                sum += calories[i];
            }

            if (sum > upper) {
                result++;
            } else if (sum < lower) {
                result--;
            }

            int l = 0;
            int r = k;
            while (r < calories.length) {
                sum -= calories[l++];
                sum += calories[r++];
                if (sum > upper) {
                    result++;
                } else if (sum < lower) {
                    result--;
                }
            }

            return result;
        }
    }
}
