package io.bigtotoro;

/**
 * <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock/">121. Best Time to Buy and Sell Stock</a>
 */

public class _121 {

    public static class Solution1 {
        public int maxProfit(int[] prices) {
            int maxProfit = 0;
            int minPrice = Integer.MAX_VALUE;

            for (int i = 0; i < prices.length; ++i) {
                if (prices[i] < minPrice) {
                    minPrice = prices[i];
                }
                if (prices[i] - minPrice > maxProfit) {
                    maxProfit = prices[i] - minPrice;
                }
            }

            return maxProfit;
        }
    }
}
