package io.bigtotoro;

/**
 * <a href="https://leetcode.com/problems/peak-index-in-a-mountain-array/">852. Peak Index in a Mountain Array</a>
 */

public class _852 {
    public static class Solution1 {
        public int peakIndexInMountainArray(int[] arr) {
            int i = 1;

            while (arr[i - 1] < arr[i]) {
                i++;
            }

            return i - 1;
        }
    }

    public static class Solution2 {
        public int peakIndexInMountainArray(int[] arr) {
            int low = 0;
            int high = arr.length;

            while (low < high) {
                int mid = (high - low) / 2;
                if (arr[mid] < arr[mid + 1]) {
                    low = mid + 1;
                } else {
                    high = mid;
                }
            }

            return low;
        }
    }
}
