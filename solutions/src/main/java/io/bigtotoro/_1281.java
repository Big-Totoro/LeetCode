package io.bigtotoro;

/**
 * <a href="https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/">1281. Subtract the Product and Sum of Digits of an Integer</a>
 */

public class _1281 {
    public static class Solution1 {
        public int subtractProductAndSum(int n) {
            int d = 0;
            int sumOfDigits = 0;
            int productOfDigits = 1;

            while (n > 0) {
                d = n % 10;

                sumOfDigits += d;
                productOfDigits *= d;

                n /= 10;
            }

            return productOfDigits - sumOfDigits;
        }
    }
}
