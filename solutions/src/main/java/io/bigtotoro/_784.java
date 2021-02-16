package io.bigtotoro;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/letter-case-permutation/">784. Letter Case Permutation</a>
 */

public class _784 {

    public static class Solution1 {
        public List<String> letterCasePermutation(String S) {
            if (S.length() == 0) {
                return List.of();
            }

            List<String> result = new ArrayList<>();
            StringBuilder builder = new StringBuilder();
            permutation(S.toCharArray(), 0, builder, result);

            return result;
        }

        private void permutation(char[] original, int start, StringBuilder builder, List<String> result) {
            if (start == original.length) {
                result.add(builder.toString());
                return;
            }

            if (!Character.isDigit(original[start])) {
                builder.append(Character.toUpperCase(original[start]));
                permutation(original, start + 1, builder, result);
                builder.deleteCharAt(builder.length() - 1);

                builder.append(Character.toLowerCase(original[start]));
                permutation(original, start + 1, builder, result);
                builder.deleteCharAt(builder.length() - 1);
            } else {
                builder.append(original[start]);
                permutation(original, start + 1, builder, result);
                builder.deleteCharAt(builder.length() - 1);
            }
        }
    }
}
