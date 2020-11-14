package io.bigtotoro;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/valid-anagram/">242. Valid Anagram</a>
 */

public class _242 {
    public static class Solution1 {
        public boolean isAnagram(String s, String t) {
            if (s.length() != t.length()) {
                return false;
            }

            Map<Character, Integer> map = new HashMap<>();
            for (Character c : s.toCharArray()) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }

            for (Character c : t.toCharArray()) {
                if (map.containsKey(c)) {
                    map.put(c, map.get(c) - 1);
                    if (map.get(c) == 0) {
                        map.remove(c);
                    }
                } else {
                    map.put(c, map.getOrDefault(c, 0) + 1);
                }
            }

            return map.size() == 0;
        }
    }
}
