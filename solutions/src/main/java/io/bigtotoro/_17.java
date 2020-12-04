package io.bigtotoro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/letter-combinations-of-a-phone-number/">17. Letter Combinations of a Phone Number</a>
 */

public class _17 {

    public static class Solution1 {

        private Map<String, String> map = new HashMap<>();
        {
            map.put("2", "abc");
            map.put("3", "def");
            map.put("4", "ghi");
            map.put("5", "jkl");
            map.put("6", "mno");
            map.put("7", "pqrs");
            map.put("8", "tuv");
            map.put("9", "wxyz");
        }

        public List<String> letterCombinations(String digits) {
            if (digits.length() == 0) {
                return List.of();
            }

            List<String> result = new ArrayList<>();
            findSolution("", digits, result);

            return result;
        }

        private void findSolution(String combination, String digits, List<String> result) {
            if (digits.length() == 0) {
                result.add(combination);
                return;
            }

            String digit = digits.substring(0, 1);
            String letters = map.get(digit);
            for (int i = 0; i < letters.length(); ++i) {
                String letter = letters.substring(i, i + 1);
                findSolution(combination + letter, digits.substring(1), result);
            }
        }
    }
}
