package io.bigtotoro;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/generate-parentheses/">22. Generate Parentheses</a>
 */

public class _22 {
    public static class Solution1 {
        public List<String> generateParenthesis(int n) {
            if (n <= 0) {
                return List.of();
            }

            List<String> result = new ArrayList<>();
            backtrack("", 0, 0, n, result);

            return result;
        }

        private void backtrack(String parentheses, int openCount, int closeCount, int maxCount, List<String> result) {
            if (openCount == maxCount && closeCount == maxCount) {
                result.add(parentheses);
                return;
            }

            if (openCount < maxCount) {
                backtrack(parentheses + "(", openCount + 1, closeCount, maxCount, result);
            }

            if (closeCount < openCount) {
                backtrack(parentheses + ")", openCount, closeCount + 1, maxCount, result);
            }
        }
    }
}
