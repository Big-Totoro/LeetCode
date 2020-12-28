package io.bigtotoro;

import java.util.HashSet;
import java.util.Set;

/**
 * <a href="https://leetcode.com/problems/longest-substring-without-repeating-characters/">3. Longest Substring Without Repeating Characters</a>
 */

public class _3 {

    public static class Solution1 {
        public int lengthOfLongestSubstring(String s) {
            if (s.length() == 0) {
                return 0;
            }

            int maxWindowSize = Integer.MIN_VALUE;

            int l = 0;
            int r = 0;
            Set<Character> set = new HashSet<>();
            while (l < s.length() && r < s.length()) {
                if (set.add(s.charAt(r))) {
                    r++;
                    maxWindowSize = Math.max(maxWindowSize, r - l);
                } else {
                    set.remove(s.charAt(l++));
                }
            }

            return maxWindowSize;
        }
    }
}
