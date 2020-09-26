package io.bigtotoro;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

/**
 * <a href="https://leetcode.com/problems/high-five/">1086. High Five</a>
 */

public class _1086 {
    public static class Solution1 {
        public class Student {
            private ArrayList<Integer> scores;

            public Student() {
                this.scores = new ArrayList<>();
            }

            public void addScore(Integer score) {
                this.scores.add(score);
            }

            public Integer getAverage() {
                final int WINDOW_SIZE = 5;

                return scores.stream().sorted().skip(scores.size() - WINDOW_SIZE)
                        .collect(Collectors.averagingInt(Integer::intValue)).intValue();
            }
        }

        public int[][] highFive(int[][] items) {
            Map<Integer, Student> map = new TreeMap<>();

            for (int i = 0; i < items.length; ++i) {
                Integer id = items[i][0];
                Integer score = items[i][1];

                map.compute(id, (k, v) -> {
                    if (v == null) {
                        v = new Student();
                    }

                    v.addScore(score);

                    return v;
                });
            }

            int[][] result = new int[map.size()][];
            int i = 0;

            for (var e : map.entrySet()) {
                result[i] = new int[2];
                result[i][0] = e.getKey();
                result[i++][1] = e.getValue().getAverage();
            }

            return result;
        }
    }
}
