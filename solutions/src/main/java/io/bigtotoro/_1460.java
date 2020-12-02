package io.bigtotoro;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/make-two-arrays-equal-by-reversing-sub-arrays/">1460. Make Two Arrays Equal by Reversing Sub-arrays</a>
 */

public class _1460 {
    public static class Solution1 {
        public boolean canBeEqual(int[] target, int[] arr) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < target.length; ++i) {
                map.put(target[i], map.getOrDefault(target[i], 0) + 1);
                map.put(arr[i], map.getOrDefault(arr[i], 0) - 1);
            }

            for (Map.Entry<Integer, Integer> e : map.entrySet()) {
                if (e.getValue() != 0) {
                    return false;
                }
            }

            return true;
        }
    }

    public static class Solution2 {
        public boolean canBeEqual(int[] target, int[] arr) {
            int[] t = new int[1000 + 1];

            for (int i = 0; i < target.length; ++i) {
                t[target[i]]++;
                t[arr[i]]--;
            }

            for (int i = 0; i < t.length; ++i) {
                if (t[i] != 0) {
                    return false;
                }
            }

            return true;
        }
    }
}
