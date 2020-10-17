package io.bigtotoro;

/**
 * <a href="https://leetcode.com/problems/number-complement/">476. Number Complement</a>
 */

public class _476 {
    public static class Solution1 {
        public int findComplement(int num) {
            int k = num;
            int mask = 1;

            while (k != 0) {
                num ^= mask;
                mask <<= 1;
                k >>= 1;
            }

            return num;
        }
    }

    public static class Solution2 {
        public int findComplement(int num) {
            int highestOneBit = Integer.highestOneBit(num);
            int mask = (highestOneBit << 1) - 1;

            return num ^ mask;
        }
    }

    public static class Solution3 {
        public int findComplement(int num) {
            int mask = num;

            mask |= mask >> 1;
            mask |= mask >> 2;
            mask |= mask >> 4;
            mask |= mask >> 8;
            mask |= mask >> 16;
            mask |= mask >> 32;

            return num ^ mask;
        }
    }
}
