package io.bigtotoro;

/**
 * <a href="https://leetcode.com/problems/final-prices-with-a-special-discount-in-a-shop/">1475. Final Prices With a Special Discount in a Shop</a>
 */

public class _1475 {
    public static class Solution1 {

        public int[] finalPrices(int[] prices) {
            for (int i = 0; i < prices.length - 1; i++) {
                int price = findMin(prices, i + 1, prices[i]);
                prices[i] = prices[i] - price;
            }

            return prices;
        }

        private int findMin(int[] prices, int start, int value) {
            for (int i = start; i < prices.length; i++) {
                if (prices[i] <= value) {
                    return prices[i];
                }
            }

            return 0;
        }
    }
}
