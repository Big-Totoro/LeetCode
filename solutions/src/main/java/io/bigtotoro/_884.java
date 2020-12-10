package io.bigtotoro;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/uncommon-words-from-two-sentences/">884. Uncommon Words from Two Sentences</a>
 */

public class _884 {
    public static class Solution1 {
        public String[] uncommonFromSentences(String A, String B) {
            if (A == null || A.length() == 0 || B == null || B.length() == 0) {
                return new String[0];
            }

            String[] a = A.split(" ");
            String[] b = B.split(" ");
            Map<String, Integer> map = new HashMap<>();

            for (String s : a) {
                map.put(s, map.getOrDefault(s, 0) + 1);
            }

            for (String s : b) {
                map.put(s, map.getOrDefault(s, 0) + 1);
            }

            int count = 0;
            String[] result = new String[map.size()];
            for (Map.Entry<String, Integer> e : map.entrySet()) {
                if (e.getValue() == 1) {
                    result[count++] = e.getKey();
                }
            }

            return Arrays.copyOfRange(result, 0, count);
        }
    }
}
