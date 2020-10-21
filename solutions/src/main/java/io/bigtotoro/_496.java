package io.bigtotoro;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/next-greater-element-i/">Next Greater Element I</a>
 */

public class _496 {
    public static class Solution1 {
        public int[] nextGreaterElement(int[] nums1, int[] nums2) {
            int[] result = new int[nums1.length];
            int j;

            for (int i = 0; i < nums1.length; ++i) {
                boolean found = false;
                for (j = 0; j < nums2.length; ++j) {
                    if (nums1[i] == nums2[j]) {
                        found = true;
                    }
                    if (found && nums2[j] > nums1[i]) {
                        result[i] = nums2[j];
                        break;
                    }
                }
                if (j >= nums2.length) {
                    result[i] = -1;
                }
            }

            return result;
        }
    }

    public static class Solution2 {
        public int[] nextGreaterElement(int[] nums1, int[] nums2) {
            int[] result = new int[nums1.length];
            Map<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < nums2.length; ++i) {
                map.put(nums2[i], i);
            }

            int j;
            for (int i = 0; i < nums1.length; ++i) {
                for (j = map.get(nums1[i]) + 1; j < nums2.length; ++j) {
                    if (nums2[j] > nums1[i]) {
                        result[i] = nums2[j];
                        break;
                    }
                }
                if (j >= nums2.length) {
                    result[i] = -1;
                }
            }

            return result;
        }
    }
}