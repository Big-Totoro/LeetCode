package io.bigtotoro;

/**
 * <a href="https://leetcode.com/problems/divisor-game/">1025. Divisor Game</a>
 */

public class _1025 {
    public static class Solution1 {
        public boolean divisorGame(int N) {
            return aliceTurn(N);
        }

        private boolean aliceTurn(int N) {
            int x = 1;
            /**
             * Looking for the proper number
             */
            while (x < N && N % x != 0) {
                x++;
            }

            /**
             * If we reach the N then it means Alice was not able to find the number and Alice loses the game.
             */
            if (x >= N) {
                return false;
            }

            /**
             * Passing the move to Bob and if Bob wins then Alice losses and vice versa
             */
            return !bobTurn(N - x);
        }

        private boolean bobTurn(int N) {
            int x = 1;

            /**
             * Looking for the proper number
             */
            while (x < N && N % x != 0) {
                x++;
            }

            /**
             * If we reach the N then it means Bob was not able to find the number and Bob loses the game.
             */
            if (x >= N) {
                return false;
            }

            /**
             * Passing the move to Alice and if Alice wins then Bob losses and vice versa.
             */
            return !aliceTurn(N - x);
        }
    }
}
