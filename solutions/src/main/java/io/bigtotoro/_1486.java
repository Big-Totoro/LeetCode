package io.bigtotoro;

/**
 * <a href="https://leetcode.com/problems/xor-operation-in-an-array/">1486. XOR Operation in an Array</a>
 */

public class _1486 {
    public static class Solution1 {
        public int xorOperation(int n, int start) {
            int num = 0;

            for (int i = 0; i < n; ++i) {
                num ^= start + 2 * i;
            }

            return num;
        }
    }
}
