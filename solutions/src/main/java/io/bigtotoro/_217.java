package io.bigtotoro;

import java.util.HashSet;
import java.util.Set;

/**
 * <a href="https://leetcode.com/problems/contains-duplicate/">217. Contains Duplicate</a>
 */

public class _217 {

    public static class Solution1 {
        public boolean containsDuplicate(int[] nums) {
            Set<Integer> set = new HashSet<>();
            for (int n : nums) {
                if (set.contains(n)) {
                    return true;
                }
                set.add(n);
            }

            return false;
        }
    }
}
