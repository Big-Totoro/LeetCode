package io.bigtotoro;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/pascals-triangle/">118. Pascal's Triangle</a>
 */

public class _118 {
    public static class Solution1 {
        public List<List<Integer>> generate(int numRows) {
            if (numRows == 0) {
                return List.of();
            }

            List<List<Integer>> result = new ArrayList<>();
            result.add(List.of(1));

            for (int i = 1; i < numRows; ++i) {
                List<Integer> row = new ArrayList<>();
                row.add(1);
                for (int j = 1; j < i; ++j) {
                    row.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
                }
                row.add(1);
                result.add(row);
            }

            return result;
        }
    }
}
