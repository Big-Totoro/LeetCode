package io.bigtotoro;

/**
 * <a href="https://leetcode.com/problems/add-digits/">258. Add Digits</a>
 */

public class _258 {
    public static class Solution1 {
        public int addDigits(int num) {
            int n = num;
            int result = 0;

            while (n > 9) {
                while (n > 0) {
                    result += n % 10;
                    n /= 10;
                }
                n = result;
                result = 0;
            }

            return n;
        }
    }

    public static class Solution2 {
        public int addDigits(int num) {
            if (num == 0)
                return 0;
            if (num % 9 == 0)
                return 9;
            return num % 9;
        }
    }
}