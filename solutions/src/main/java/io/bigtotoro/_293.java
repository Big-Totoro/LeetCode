package io.bigtotoro;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/flip-game/">Flip Game</a>
 */

public class _293 {
    public static class Solution1 {
        public List<String> generatePossibleNextMoves(String s) {
            List<String> result = new ArrayList<>();

            for (int i = 0; i < s.length() - 1; ++i) {
                char[] charArray = s.toCharArray();
                if (charArray[i] == '+' && charArray[i + 1] == '+') {
                    charArray[i] = charArray[i + 1] = '-';
                    result.add(String.valueOf(charArray));
                }
            }

            return result;
        }
    }
}