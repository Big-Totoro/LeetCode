package io.bigtotoro;

/**
 * <a href="https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/">1252. Cells with Odd Values in a Matrix</a>
 */

public class _1252 {
    public static class Solution1 {
        public int oddCells(int n, int m, int[][] indices) {
            int[][] array = new int[n][m];

            for (int i = 0; i < indices.length; ++i) {
                for (int c = 0; c < m; ++c) {
                    array[indices[i][0]][c]++;
                }

                for (int r = 0; r < n; ++r) {
                    array[r][indices[i][1]]++;
                }
            }

            int oddsCount = 0;
            for (int i = 0; i < n; ++i) {
                for (int j = 0; j < m; ++j) {
                    if (array[i][j] % 2 > 0) {
                        ++oddsCount;
                    }
                }
            }

            return oddsCount;
        }
    }

    public static class Solution2 {
        public int oddCells(int n, int m, int[][] indices) {

        }
    }
}