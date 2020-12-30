package io.bigtotoro;

/**
 * <a href="https://leetcode.com/problems/palindrome-number/">9. Palindrome Number</a>
 */

public class _9 {

    public static class Solution1 {
        public boolean isPalindrome(int x) {
            if (x < 0){
                return false;
            } else if (x < 10) {
                return true;
            }

            int n = x;
            long result = 0;
            while (n > 0) {
                result += n % 10;
                n /= 10;
                if (n > 0) {
                    result *= 10;
                }
            }

            return result == x;
        }
    }
}
