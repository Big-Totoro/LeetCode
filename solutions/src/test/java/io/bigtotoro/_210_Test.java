package io.bigtotoro;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _210_Test {

    private static _210.Solution1 solution1 = new _210.Solution1();

    @Test
    public void test11() {
        assertThat(solution1.findOrder(2, new int[][] {{1, 0}}))
            .isEqualTo(new int[] {0, 1});
    }

    @Test
    public void test12() {
        assertThat(solution1.findOrder(4, new int[][] {{1, 0}, {2, 0}, {3, 1}, {3, 2}}))
            .isEqualTo(new int[] {0, 2, 1, 3});
    }

    @Test
    public void test13() {
        assertThat(solution1.findOrder(1, new int[][] {}))
            .isEqualTo(new int[] {0});
    }
}
