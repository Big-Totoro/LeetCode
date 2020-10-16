package io.bigtotoro;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * <a href="https://leetcode.com/problems/intersection-of-two-arrays/">349. Intersection of Two Arrays</a>
 */

public class _349 {
    public static class Solution1 {
        public int[] intersection(int[] nums1, int[] nums2) {
            if (nums1.length == 0 || nums2.length == 0) {
                return new int[] {};
            }

            Set<Integer> set = new HashSet<>();
            for (int n : nums1) {
                set.add(n);
            }

            List<Integer> list = new ArrayList<>();
            for (int n : nums2) {
                if (set.remove(n)) {
                    list.add(n);
                }
            }

            int[] result = new int[list.size()];
            for (int i = 0; i < list.size(); ++i) {
                result[i] = list.get(i);
            }

            return result;
        }
    }
}
