package io.bigtotoro;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * <a href="https://leetcode.com/problems/number-of-recent-calls/">933. Number of Recent Calls</a>
 */

public class _933 {
    public static class RecentCounter {
        private Deque<Integer> queue;

        public RecentCounter() {
            queue = new ArrayDeque<>();
        }

        public int ping(int t) {
            queue.offer(t);

            while (!queue.isEmpty() && queue.getFirst() < t - 3000) {
                queue.removeFirst();
            }

            return queue.size();
        }
    }
}
