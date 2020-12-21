package io.bigtotoro;

/**
 * <a href="https://leetcode.com/problems/number-of-1-bits/">191. Number of 1 Bits</a>
 */

public class _191 {

    public static class Solution1 {
        // you need to treat n as an unsigned value
        public int hammingWeight(int n) {
            int counter = 0;
            while (n != 0) {
                counter += (n & 0x80000000) < 0 ? 1 : 0;
                n <<= 1;
            }

            return counter;
        }
    }
}