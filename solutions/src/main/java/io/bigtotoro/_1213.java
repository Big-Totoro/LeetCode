package io.bigtotoro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/intersection-of-three-sorted-arrays/">1213. Intersection of Three Sorted Arrays</a>
 */

public class _1213 {
    public static class Solution1 {
        public List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {
            List<Integer> result = new ArrayList<>();
            Map<Integer, Integer> map = new HashMap<>();
            int length = Math.max(Math.max(arr1.length, arr2.length), arr3.length);

            for (int i = 0; i < length; ++i) {
                if (i < arr1.length) {
                    map.compute(arr1[i], (k, v) -> (v == null) ? 1 : ++v);
                }
                if (i < arr2.length) {
                    map.compute(arr2[i], (k, v) -> (v == null) ? 1 : ++v);
                }
                if (i < arr3.length) {
                    map.compute(arr3[i], (k, v) -> (v == null) ? 1 : ++v);
                }
            }

            for (Map.Entry<Integer, Integer> e : map.entrySet()) {
                if (e.getValue() == 3) {
                    result.add(e.getKey());
                }
            }

            return result;
        }
    }

    public static class Solution2 {
        public List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {
            int[] bucket = new int[2000 + 1];
            int max = 0;

            for (int v : arr1) {
                bucket[v]++;
                max = Math.max(max, v);
            }

            for (int v : arr2) {
                bucket[v]++;
                max = Math.max(max, v);
            }

            for (int v : arr3) {
                bucket[v]++;
                max = Math.max(max, v);
            }

            List<Integer> result = new ArrayList<>(max);
            for (int i = 0; i <= max; ++i) {
                if (bucket[i] == 3) {
                    result.add(i);
                }
            }

            return result;
        }
    }
}
