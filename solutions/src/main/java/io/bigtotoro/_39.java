package io.bigtotoro;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/combination-sum/">39. Combination Sum</a>
 */

public class _39 {
    public static class Solution1 {
        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            if (candidates.length == 0) {
                return List.of();
            }

            List<List<Integer>> result = new ArrayList<>();
            backtrack(new LinkedList<>(), 0, candidates, target, result);

            return result;
        }

        private void backtrack(LinkedList<Integer> solution, int start, int[] candidates, int target, List<List<Integer>> result) {
            if (target == 0) {
                result.add(List.copyOf(solution));
                return;
            }

            if (target < 0) {
                return;
            }

            for (int i = start; i < candidates.length; ++i) {
                if (target - candidates[i] < 0) {
                    continue;
                }
                solution.add(candidates[i]);
                backtrack(solution, i, candidates, target - candidates[i], result);
                solution.removeLast();
            }
        }
    }
}
