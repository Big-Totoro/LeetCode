package io.bigtotoro;

import java.util.Arrays;
import java.util.Set;

/**
 * <a href="https://leetcode.com/problems/keyboard-row/">500. Keyboard Row</a>
 */

public class _500 {
    public static class Solution1 {
        public String[] findWords(String[] words) {
            String[] temp = new String[words.length];
            int counter = 0;
            for (String w : words) {
                if (findInRows(w)) {
                    temp[counter++] = w;
                }
            }

            return Arrays.copyOfRange(temp, 0, counter);
        }

        private boolean findInRows(String word) {
            Set<Character> row1 = Set.of('q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p',
                    'Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O', 'P');
            Set<Character> row2 = Set.of('a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l',
                    'A', 'S', 'D', 'F', 'G', 'H', 'J', 'K', 'L');
            Set<Character> row3 = Set.of('z', 'x', 'c', 'v', 'b', 'n', 'm',
                    'Z', 'X', 'C', 'V', 'B', 'N', 'M');

            boolean success = true;
            for (int i = 0; i < word.length(); ++i) {
                success &= row1.contains(word.charAt(i));
            }
            if (success) {
                return success;
            }

            success = true;
            for (int i = 0; i < word.length(); ++i) {
                success &= row2.contains(word.charAt(i));
            }
            if (success) {
                return success;
            }

            success = true;
            for (int i = 0; i < word.length(); ++i) {
                success &= row3.contains(word.charAt(i));
            }

            return success;
        }
    }
}
