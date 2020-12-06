package io.bigtotoro;

import java.util.LinkedList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/combination-sum-iii/">216. Combination Sum III</a>
 */

public class _216 {
    public static class Solution1 {
        public List<List<Integer>> combinationSum3(int k, int n) {
            if (k == 0) {
                return List.of();
            }

            int[] candidates = new int[k];
            List<List<Integer>> result = new LinkedList<>();
            backtrack(new LinkedList<>(), 1, k, n, result);

            return result;
        }

        private void backtrack(LinkedList<Integer> solution, int currentNumber, int k, int target,
                               List<List<Integer>> result) {
            if (solution.size() == k && target == 0) {
                result.add(List.copyOf(solution));
                return;
            }
            if (solution.size() == k || target < 0) {
                return;
            }

            for (int i = currentNumber; i <= 9; ++i) {
                solution.add(i);
                backtrack(solution, i + 1, k, target - i, result);
                solution.removeLast();
            }
        }
    }
}
