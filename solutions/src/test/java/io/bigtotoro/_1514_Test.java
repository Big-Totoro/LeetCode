package io.bigtotoro;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _1514_Test {

    private static _1514.Solution1 solution1 = new _1514.Solution1();

    @Test
    public void test11() {
        assertThat(solution1.maxProbability(3, new int[][]{{0, 1}, {1, 2}, {0, 2}},
                new double[] {0.5, 0.5, 0.2}, 0, 2)).isEqualTo(0.25000);
    }

    @Test
    public void test12() {
        assertThat(solution1.maxProbability(3, new int[][]{{0, 1}, {1, 2}, {0, 2}},
                new double[] {0.5, 0.5, 0.3}, 0, 2)).isEqualTo(0.30000);
    }

    @Test
    public void test13() {
        assertThat(solution1.maxProbability(3, new int[][]{{0, 1}},
                new double[] {0.5}, 0, 2)).isEqualTo(0.00000);
    }
}
