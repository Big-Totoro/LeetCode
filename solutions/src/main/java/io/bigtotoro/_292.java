package io.bigtotoro;

/**
 * <a href="https://leetcode.com/problems/nim-game/">292. Nim game</a>
 */

public class _292 {

    public static class Solution1 {
        public boolean canWinNim(int n) {
            return (n % 4) != 0;
        }
    }
}
