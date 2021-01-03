package io.bigtotoro;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/merge-sorted-array/">88. Merge Sorted Array</a>
 */

public class _88 {

    public static class Solution1 {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            if (nums1.length == 0 || nums2.length == 0) {
                return;
            }

            int j = 0;
            for (int i = m; i < nums1.length; ++i) {
                nums1[i] = nums2[j++];
            }

            Arrays.sort(nums1);
        }
    }

    public static class Solution2 {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            if (nums1.length == 0 || nums2.length == 0) {
                return;
            }

            int[] nums11 = Arrays.copyOfRange(nums1, 0, m);
            int i = 0, j = 0, k = 0;
            while (i < m && j < n) {
                nums1[k++] = (nums11[i] < nums2[j]) ? nums11[i++] : nums2[j++];
            }

            for (; i < m; ++i) {
                nums1[k++] = nums11[i];
            }

            for (; j < n; ++j) {
                nums1[k++] = nums2[j];
            }
        }
    }

    public static class Solution3 {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int i = m - 1, j = n - 1, k = m + n - 1;
            while (i >= 0 && j >= 0) {
                nums1[k--] = (nums1[i] > nums2[j]) ? nums1[i--] : nums2[j--];
            }

            for (; j >= 0; j--) {
                nums1[k--] = nums1[j];
            }
        }
    }
}
