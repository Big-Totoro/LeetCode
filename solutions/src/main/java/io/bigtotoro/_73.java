package io.bigtotoro;

import java.util.HashSet;
import java.util.Set;

/**
 * <a href="https://leetcode.com/problems/set-matrix-zeroes/">73. Set Matrix Zeroes</a>
 */

public class _73 {

    public static class Solution1 {
        public void setZeroes(int[][] matrix) {
            Set<Integer> rowsMemo = new HashSet<>();
            Set<Integer> colsMemo = new HashSet<>();

            for (int r = 0; r < matrix.length; ++r) {
                for (int c = 0; c < matrix[0].length; ++c) {
                    if (matrix[r][c] == 0) {
                        rowsMemo.add(r);
                        colsMemo.add(c);
                    }
                }
            }

            for (int r : rowsMemo) {
                for (int i = 0; i < matrix[0].length; ++i) {
                    matrix[r][i] = 0;
                }
            }

            for (int c : colsMemo) {
                for (int i = 0; i < matrix.length; ++i) {
                    matrix[i][c] = 0;
                }
            }
        }
    }
}
