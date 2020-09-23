package io.bigtotoro;

/**
 * <a href="https://leetcode.com/problems/hamming-distance/">461. Hamming Distance</a>
 */

public class _461 {
    public static class Solution1 {
        public int hammingDistance(int x, int y) {
            int diffs = 0;

            while ((x > 0) || (y > 0)) {
                if ((x & 1) != (y & 1)) {
                    ++diffs;
                }
                x >>= 1;
                y >>= 1;
            }

            return diffs;
        }
    }
}
