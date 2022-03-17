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

            int maxWindowSize = 0;
            int[] set = new int[128];
            for (int left = 0, right = 0; right < s.length(); ++right) {
                char c = s.charAt(right);
                set[c]++;

                while (set[c] > 1) {
                    char t = s.charAt(left);
                    set[t]--;
                    ++left;
                }

                maxWindowSize = Math.max(maxWindowSize, right - left + 1);
            }

            return maxWindowSize;
        }
    }
}
