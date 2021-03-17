package io.bigtotoro;

/**
 * <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-transaction-fee/">714. Best Time to Buy and Sell Stock with Transaction Fee</a>
 */

public class _714 {

    public static class Solution1 {
        public int maxProfit(int[] prices, int fee) {
            int[] buy = new int[prices.length];
            int[] sell = new int[prices.length];
            int[] rest = new int[prices.length];
            int[] noAction = new int[prices.length];

            buy[0] = -prices[0] - fee;
            sell[0] = Integer.MIN_VALUE;
            rest[0] = 0;
            noAction[0] = Integer.MIN_VALUE;

            for (int i = 1; i < prices.length; i++) {
                buy[i] = Math.max(sell[i - 1], rest[i - 1]) - prices[i] - fee;
                sell[i] = Math.max(buy[i - 1], noAction[i - 1]) + prices[i];
                rest[i] = Math.max(rest[i - 1], sell[i - 1]);
                noAction[i] = Math.max(noAction[i - 1], buy[i - 1]);
            }

            return Math.max(
                    Math.max(
                        Math.max(
                            buy[buy.length - 1],
                            sell[sell.length - 1]),
                        rest[rest.length - 1]),
                    noAction[noAction.length - 1]
            );
        }
    }
}
