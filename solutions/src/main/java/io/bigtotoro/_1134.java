package io.bigtotoro;

/**
 * <a href="https://leetcode.com/problems/armstrong-number/">1134. Armstrong Number</a>
 */

public class _1134 {
    public static class Solution1 {
        public boolean isArmstrong(int N) {
            int n = N;
            int k = 0;

            // Count a number of digits in the N variable to define a k variable
            while (n > 0) {
                ++k;
                n /= 10;
            }

            n = N;
            int sum = 0;

            // Calculate the sum variable
            while(n > 0) {
                sum += Math.pow(n % 10, k);
                n /= 10;
            }

            return sum == N;
        }
    }
}
