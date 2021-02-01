package io.bigtotoro;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * <a href="https://leetcode.com/problems/longest-palindrome/">409. Longest Palindrome</a>
 */

public class _409 {

    public static class Solution1 {
        public int longestPalindrome(String s) {
            Map<Character, Integer> map = new HashMap<>();
            for (Character c : s.toCharArray()) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }

            int odd = map.values().stream().filter(n -> n % 2 != 0).max(Comparator.naturalOrder()).orElse(0);
            int even = map.values().stream().filter(n -> n % 2 == 0).collect(Collectors.summingInt(Integer::intValue));

            return even + odd;
        }
    }
}
