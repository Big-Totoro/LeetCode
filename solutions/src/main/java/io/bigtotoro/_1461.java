package io.bigtotoro;

import java.util.HashSet;
import java.util.Set;

/**
 * <a href="https://leetcode.com/problems/check-if-a-string-contains-all-binary-codes-of-size-k/">1461. Check If a String Contains All Binary Codes of Size K</a>
 */

public class _1461 {

    public static class Solution1 {
        public boolean hasAllCodes(String s, int k) {
            int expectedCount = 1 << k;
            Set<String> set = new HashSet<>();

            for (int i = 0; i <= s.length() - k; ++i) {
                String candidate = s.substring(i, i + k);
                if (!set.contains(candidate)) {
                    set.add(candidate);
                    if (set.size() == expectedCount) {
                        return true;
                    }
                }
            }

            return false;
        }
    }
}
