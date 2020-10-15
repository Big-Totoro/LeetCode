package io.bigtotoro;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/palindrome-permutation/">266. Palindrome Permutation</a>
 */

public class _266 {
    public static class Solution1 {
        public boolean canPermutePalindrome(String s) {
            Map<Character, Boolean> map = new HashMap<>();

            for (int i = 0; i < s.length(); ++i) {
                Character c = s.charAt(i);
                map.compute(c, (k, v) -> v == null ? false : !v);
            }

            long odd = map.values().stream().filter(v -> v == false).count();
            long even = map.values().stream().filter(v -> v == true).count();

            if (odd == 0) {
                return even > 0;
            } else if (odd == 1) {
                return even >= 0;
            } else if (odd > 1) {
                return false;
            }

            return false;
        }
    }
}
