package io.bigtotoro;

import java.util.HashSet;
import java.util.Set;

/**
 * <a href="https://leetcode.com/problems/longest-palindrome/">409. Longest Palindrome</a>
 */

public class _409 {

    public static class Solution1 {
        public int longestPalindrome(String s) {
            Set<Character> set = new HashSet<>();
            for (Character c : s.toCharArray()) {
                if (!set.add(c)) {
                    set.remove(c);
                }
            }

            return s.length() - ((set.size() > 0) ? set.size() - 1 : 0);
        }
    }
}
