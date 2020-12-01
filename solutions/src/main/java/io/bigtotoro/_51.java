package io.bigtotoro;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/n-queens/">51. N-Queens</a>
 */

public class _51 {
    public static class Solution1 {

        /**
         * The list of the occupied rows. These mean we placed the queen on these rows.
         */
        private boolean[] occupiedRows;

        /**
         * The list of the occupied primary diagonals
         */
        private boolean[] occupiedPrimaryDiag;

        /**
         * The list of the occupied secondary diagonals
         */
        private boolean[] occupiedSecondaryDiag;

        public List<List<String>> solveNQueens(int n) {
            /**
             * The chess board array to store '1' for the queen and '0' for the available cell.
             */
            int[][] board = new int[n][n];
            occupiedRows = new boolean[n];
            occupiedPrimaryDiag = new boolean[n + n - 1];
            occupiedSecondaryDiag = new boolean[n + n - 1];

            List<List<String>> result = new ArrayList<>();
            solveNQueens(board, n, 0, result);

            return result;
        }

        private boolean solveNQueens(int[][] board, int queens, int column, List<List<String>> result) {
            /**
             * If we reach the last column then it means we solved the problem
             */
            if (column >= queens) {
                /**
                 * Add the solution to the result list
                 */
                result.add(toList(board));

                /**
                 * Uncomment it for the first solution only
                 */
                //return true;
            }

            /**
             * Loop through all rows of the board trying to place the queen and solve the problem
             */
            for (int i = 0; i < board.length; ++i) {
                if (canPlaceQueenHere(board, i, column)) {
                    /**
                     * Place the queen
                     */
                    board[i][column] = 1;
                    /**
                     * Mark the row as occupied by the queen
                     */
                    occupiedRows[i] = true;
                    /**
                     * Mark the primary diagonal as not available
                     */
                    occupiedPrimaryDiag[i - column + board[0].length - 1] = true;
                    /**
                     * Mark the secondary diagonal as not available
                     */
                    occupiedSecondaryDiag[i + column] = true;

                    /**
                     * Try to place the queen on the next column
                     */
                    if (solveNQueens(board, queens, column + 1, result)) {
                        return true;
                    }

                    /**
                     * Remove the queen from the position
                     */
                    board[i][column] = 0;
                    /**
                     * Mark the row as available
                     */
                    occupiedRows[i] = false;
                    /**
                     * Mark the primary diagonal as available
                     */
                    occupiedPrimaryDiag[i - column + board[0].length - 1] = false;
                    /**
                     * Mark the secondary diagonal as available
                     */
                    occupiedSecondaryDiag[i + column] = false;
                }
            }

            return false;
        }

        /**
         * Check if the row, primary diagonal and secondary diagonal are available toe place the queen.
         * @param board board to check
         * @param row the row to place queen
         * @param col the column to place queen
         * @return true in case of the cell is available to place the queen
         */
        private boolean canPlaceQueenHere(int[][] board, int row, int col) {
            if (occupiedRows[row] || occupiedPrimaryDiag[row - col + board.length - 1] || occupiedSecondaryDiag[row + col]) {
                return false;
            }

            return true;
        }

        /**
         * Convert the board to the list of strings
         * @param board board
         * @return the list of strings
         */
        private List<String> toList(int[][] board) {
            List<String> result = new ArrayList<>();

            for (int i = 0; i < board.length; ++i) {
                StringBuilder builder = new StringBuilder();
                for (int j = 0; j < board[0].length; ++j) {
                    builder.append(board[i][j] == 1 ? "Q" : ".");
                }
                result.add(builder.toString());
            }

            return result;
        }
    }
}
