package io.bigtotoro;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/sort-the-matrix-diagonally/">1329. Sort the Matrix Diagonally</a>
 */

public class _1329 {

    public static class Solution1 {
        public int[][] diagonalSort(int[][] mat) {
            final int N = mat.length;
            final int M = mat[0].length;

            /**
             * Loop through all diagonals based on the columns
             */
            for (int col = 0; col < M; ++col) {
                List<Integer> array = new ArrayList<>(N);
                /**
                 * Collect the diagonal values into the array
                 */
                int i = col;
                int j = 0;
                while(i < M && j < N) {
                    array.add(mat[j++][i++]);
                }

                /**
                 * Sort the diagonal values
                 */
                array.sort(Comparator.naturalOrder());

                /**
                 * Set the sorted array values back to the matrix diagonal
                 */
                i = col;
                j = 0;
                while(i < M && j < N) {
                    mat[j][i] = array.get(j);
                    i++;
                    j++;
                }
            }

            /**
             * Loop through all diagonals based on the rows
             */
            for (int row = 1; row < N; ++row) {
                List<Integer> array = new ArrayList<>(N);
                /**
                 * Collect the diagonal values into the array
                 */
                int i = row;
                int j = 0;
                while(i < N && j < M) {
                    array.add(mat[i++][j++]);
                }

                /**
                 * Sort the diagonal values
                 */
                array.sort(Comparator.naturalOrder());

                /**
                 * Set the sorted array values back to the matrix diagonal
                 */
                i = row;
                j = 0;
                while(i < N && j < M) {
                    mat[i][j] = array.get(j);
                    i++;
                    j++;
                }
            }

            return mat;
        }
    }
}
