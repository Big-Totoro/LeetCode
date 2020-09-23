package io.bigtotoro;

import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Collectors;

/**
 * <a href="https://leetcode.com/problems/moving-average-from-data-stream/">346. Moving Average from Data Stream</a>
 */

public class _346 {
    public static class Solution1 {
        static class MovingAverage {
            private Queue<Integer> queue = new LinkedList<>();
            private int windowSize = 0;

            public MovingAverage(int size) {
                windowSize = size;
            }

            public double next(int val) {
                double sum = 0.0;

                queue.add(val);

                if (queue.size() < windowSize) {
                    sum = queue.stream().collect(Collectors.summingInt(Integer::intValue));

                    return sum / queue.size();
                }
                sum = queue.stream().skip(queue.size() - windowSize).collect(Collectors.summingInt(Integer::intValue));

                return sum / windowSize;
            }
        }
    }
}
