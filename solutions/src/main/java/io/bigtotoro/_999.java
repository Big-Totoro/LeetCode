package io.bigtotoro;

/**
 * <a href="https://leetcode.com/problems/available-captures-for-rook/">999. Available Captures for Rook</a>
 */

public class _999 {

    public static class Solution1 {
        public int numRookCaptures(char[][] board) {
            if (board.length == 0 || board[0].length == 0) {
                return 0;
            }
            final int BOARD_SIZE = 8;
            final char ROOK = 'R';
            final char BISHOP = 'B';
            final char PAWN = 'p';

            int counter = 0;
            int rookRow = 0, rookCol = 0;
            boolean found = false;

            /**
             * Look for the rook
             */
            for (rookRow = 0; rookRow < BOARD_SIZE; rookRow++) {
                for (rookCol = 0; rookCol < BOARD_SIZE; rookCol++) {
                    if (board[rookRow][rookCol] == ROOK) {
                        found = true;
                        break;
                    }
                }
                if (found)
                    break;
            }

            /**
             * Explore north, south, west, east
             */
            int left = rookCol - 1, right = rookCol + 1;
            int up = rookRow - 1, down = rookRow + 1;
            while (left >= 0 || right < BOARD_SIZE || up >= 0 || down < BOARD_SIZE) {
                /**
                 * Explore east side. If we find the bishop first then stop exploring.
                 * If we find the pawn first then increase counter and stop exploring.
                 */
                if (left >= 0) {
                    if (board[rookRow][left] == BISHOP) {
                        left = -1;
                    } else if (board[rookRow][left] == PAWN) {
                        ++counter;
                        left = -1;
                    }
                }
                --left;

                /**
                 * Explore west side. If we find the bishop first then stop exploring.
                 * If we find the pawn first then increase counter and stop exploring.
                 */
                if (right < BOARD_SIZE) {
                    if (board[rookRow][right] == BISHOP) {
                        right = BOARD_SIZE;
                    } else if (board[rookRow][right] == PAWN) {
                        ++counter;
                        right = BOARD_SIZE;
                    }
                }
                ++right;

                /**
                 * Explore north side. If we find the bishop first then stop exploring.
                 * If we find the pawn first then increase counter and stop exploring.
                 */
                if (up >= 0) {
                    if (board[up][rookCol] == BISHOP) {
                        up = -1;
                    } else if (board[up][rookCol] == PAWN) {
                        ++counter;
                        up = -1;
                    }
                }
                --up;

                /**
                 * Explore south side. If we find the bishop first then stop exploring.
                 * If we find the pawn first then increase counter and stop exploring.
                 */
                if (down < BOARD_SIZE) {
                    if (board[down][rookCol] == BISHOP) {
                        down = BOARD_SIZE;
                    } else if (board[down][rookCol] == PAWN) {
                        ++counter;
                        down = BOARD_SIZE;
                    }
                }
                ++down;
            }

            return counter;
        }
    }
}