package io.bigtotoro;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _743_Test {

    private static _743.Solution1 solution1 = new _743.Solution1();

    @Test
    public void test11() {
        assertThat(solution1.networkDelayTime(new int[][] {{2, 1, 1}, {2, 3, 1}, {3, 4, 1}}, 4, 2)).isEqualTo(2);
    }

    @Test
    public void test12() {
        assertThat(solution1.networkDelayTime(new int[][] {
                {2, 4, 10},
                {5, 2, 38},
                {3, 4, 33},
                {4, 2, 76},
                {3, 2, 64},
                {1, 5, 54},
                {1, 4, 98},
                {2, 3, 61},
                {2, 1, 0},
                {3, 5, 77},
                {5, 1, 34},
                {3, 1, 79},
                {5, 3, 2},
                {1, 2, 59},
                {4, 3, 46},
                {5, 4, 44},
                {2, 5, 89},
                {4, 5, 21},
                {1, 3, 86},
                {4, 1, 95}}, 5, 1)).isEqualTo(69);
    }

    @Test
    public void test13() {
        assertThat(solution1.networkDelayTime(new int[][] {
                {1, 2, 7}, {1, 3, 9}, {1, 6, 14},
                {2, 3, 10}, {2, 4, 15},
                {3, 1, 9}, {3, 2, 10}, {3, 4, 11}, {3, 6, 2},
                {4, 2, 15}, {4, 3, 11}, {4, 5, 6},
                {5, 4, 6}, {5, 6, 6},
                {6, 1, 14}, {6, 3, 2}, {6, 5, 9}
                }, 6, 1)).isEqualTo(20);
    }

    @Test
    public void test14() {
        assertThat(solution1.networkDelayTime(new int[][] {
                {4, 2, 76}, {1, 3, 79}, {3, 1, 81}, {4, 3, 30}, {2, 1, 47}, {1, 5, 61}, {1, 4, 99}, {3, 4, 68},
                {3, 5, 46}, {4, 1, 6}, {5, 4, 7}, {5, 3, 44}, {4, 5, 19}, {2, 3, 13}, {3, 2, 18}, {1, 2, 0}, {5, 1, 25},
                {2, 5, 58}, {2, 4, 77}, {5, 2, 74}}, 5, 3))
                .isEqualTo(59);
    }
}
