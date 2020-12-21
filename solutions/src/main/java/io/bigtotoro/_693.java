package io.bigtotoro;

/**
 * <a href="https://leetcode.com/problems/binary-number-with-alternating-bits/">693. Binary Number with Alternating Bits</a>
 */

public class _693 {

    public static class Solution1 {
        public boolean hasAlternatingBits(int n) {
            while (n > 0) {
                int firstBit = n & 1;
                n >>= 1;
                int secondBit = n & 1;
                if (firstBit == secondBit) {
                    return false;
                }
            }

            return true;
        }
    }
}
