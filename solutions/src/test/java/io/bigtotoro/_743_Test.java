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
                {4, 1, 95}}, 5, 1)).isEqualTo(68);
    }
}
