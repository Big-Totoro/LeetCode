package io.bigtotoro;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/lucky-numbers-in-a-matrix/">1380. Lucky Numbers in a Matrix</a>
 */

public class _1380 {

    public static class Solution1 {
        public List<Integer> luckyNumbers (int[][] matrix) {
            if (matrix.length == 0 || matrix[0].length == 0) {
                return List.of();
            }

            List<Integer> result = new ArrayList<>();
            for (int r = 0; r < matrix.length; ++r) {
                int min = Integer.MAX_VALUE;
                int min_column = 0;
                for (int c = 0; c < matrix[0].length; ++c) {
                    if (min > matrix[r][c]) {
                        min = matrix[r][c];
                        min_column = c;
                    }
                }

                int max = Integer.MIN_VALUE;
                for (int r2 = 0; r2 < matrix.length; ++r2) {
                    max = Math.max(max, matrix[r2][min_column]);
                }
                if (min == max) {
                    result.add(min);
                }
            }

            return result;
        }
    }
}
