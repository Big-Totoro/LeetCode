package io.bigtotoro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/intersection-of-two-arrays-ii/">350. Intersection of Two Arrays II</a>
 */

public class _350 {

    public static class Solution1 {
        public int[] intersect(int[] nums1, int[] nums2) {
            List<Integer> result = new ArrayList<>();
            Arrays.sort(nums1);
            Arrays.sort(nums2);
            int i = 0;
            int j = 0;
            while (i < nums1.length && j < nums2.length) {
                if (nums1[i] < nums2[j]) {
                    ++i;
                } else if (nums1[i] > nums2[j]) {
                    ++j;
                } else {
                    result.add(nums1[i++]);
                    ++j;
                }
            }

            int[] temp = new int[result.size()];
            for (i = 0; i < temp.length; ++i) {
                temp[i] = result.get(i);
            }
            return temp;
        }
    }
}
