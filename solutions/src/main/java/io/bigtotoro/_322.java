package io.bigtotoro;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * <a href="https://leetcode.com/problems/coin-change/">322. Coin Change</a>
 */

public class _322 {

    public static class Solution1 {
        public int coinChange(int[] coins, int amount) {
            if (coins == null || coins.length == 0 || amount < 1) {
                return 0;
            }

            int depth = 0;
            Queue<Integer> queue = new LinkedList<>();
            Set<Integer> cache = new HashSet<>();
            queue.offer(amount);
            while (!queue.isEmpty()) {
                int size = queue.size();
                for (int i = 0; i < size; ++i) {
                    int currentAmount = queue.poll();

                    if (currentAmount == 0) {
                        return depth;
                    }
                    if (currentAmount < 0) {
                        continue;
                    }

                    for (int coin : coins) {
                        int diff = currentAmount - coin;
                        if (diff >= 0 && !cache.contains(diff)) {
                            queue.offer(diff);
                            cache.add(diff);
                        }
                    }
                }

                ++depth;
            }

            return -1;
        }
    }
}
