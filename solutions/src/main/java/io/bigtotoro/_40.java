package io.bigtotoro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/combination-sum-ii/">40. Combination Sum II</a>
 */

public class _40 {
    public static class Solution1 {
        public List<List<Integer>> combinationSum2(int[] candidates, int target) {
            if (candidates.length == 0) {
                return List.of();
            }

            Arrays.sort(candidates);

            List<List<Integer>> result = new ArrayList<>();
            backtrack(new LinkedList(), candidates, 0, 0, target, result);

            return result;
        }

        private void backtrack(LinkedList<Integer> solution, int[] candidates, int sum, int start, int target, List<List<Integer>> result) {
            if (sum == target) {
                result.add(List.copyOf(solution));
                return;
            }

            for (int i = start; i < candidates.length; ++i) {
                if (i > start && candidates[i] == candidates[i - 1]) {
                    continue;
                }
                if (sum + candidates[i] <= target) {
                    solution.add(candidates[i]);
                    backtrack(solution, candidates, sum + candidates[i], i + 1, target, result);
                    solution.removeLast();
                } else {
                    break;
                }
            }
        }
    }
}
