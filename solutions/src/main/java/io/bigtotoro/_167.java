package io.bigtotoro;

/**
 * <a href="https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/">167. Two Sum II - Input array is sorted</a>
 */

public class _167 {

    public static class Solution1 {
        public int[] twoSum(int[] numbers, int target) {
            int h = 0;
            int t = numbers.length - 1;

            while (h < t) {
                if (numbers[h] + numbers[t] > target) {
                    t--;
                } else if (numbers[h] + numbers[t] < target) {
                    h++;
                } else {
                    return new int[] {h + 1, t + 1};
                }
            }

            return numbers;
        }
    }
}
