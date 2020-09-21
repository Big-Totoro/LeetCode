package io.bigtotoro;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/fibonacci-number/">509. Fibonacci Number</a>
 */

public class _1165 {
    public static class Solution1 {
        public int calculateTime(String keyboard, String word) {
            int result = 0;
            Map<Character, Integer> layout = new HashMap<>(keyboard.length());

            for (int i = 0; i < keyboard.length(); ++i) {
                layout.putIfAbsent(keyboard.charAt(i), i);
            }

            int last = 0;
            for (Character c : word.toCharArray()) {
                result += Math.abs(last - layout.get(c));
                last = layout.get(c);
            }

            return result;
        }
    }

    public static class Solution2 {
        public int calculateTime(String keyboard, String word) {
            int result = 0;
            int[] layout = new int[keyboard.length()];

            for (int i = 0; i < keyboard.length(); ++i) {
                layout[keyboard.charAt(i) - 'a'] = i;
            }

            int last = 0;
            for (int i = 0; i < word.length(); ++i) {
                int pos = layout[word.charAt(i) - 'a'];
                result += Math.abs(last - pos);
                last = pos;
            }

            return result;
        }
    }
}
