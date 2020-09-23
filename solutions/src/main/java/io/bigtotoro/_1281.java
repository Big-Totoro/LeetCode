package io.bigtotoro;

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
