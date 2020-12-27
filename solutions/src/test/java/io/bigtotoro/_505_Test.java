package io.bigtotoro;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _505_Test {

    private static final _505.Solution1 SOLUTION_1 = new _505.Solution1();

    @Test
    public void test11() {
        assertThat(SOLUTION_1.shortestDistance(new int[][] {
                {0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0},
                {1, 1, 0, 1, 1},
                {0, 0, 0, 0, 0}
        }, new int[] {0, 4}, new int[] {4, 4})).isEqualTo(12);
    }

    @Test
    public void test12() {
        assertThat(SOLUTION_1.shortestDistance(new int[][] {
                {0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0},
                {1, 1, 0, 1, 1},
                {0, 0, 0, 0, 0}
        }, new int[] {0, 4}, new int[] {3, 2})).isEqualTo(-1);
    }
}
