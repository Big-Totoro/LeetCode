package io.bigtotoro;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _1337_Test {

    private static _1337.Solution1 solution1 = new _1337.Solution1();

    @Test
    public void test11() {
        assertThat(solution1.kWeakestRows(new int[][]{
                {1, 1, 0, 0, 0},
                {1, 1, 1, 1, 0},
                {1, 0, 0, 0, 0},
                {1, 1, 0, 0, 0},
                {1, 1, 1, 1, 1}
        }, 3)).isEqualTo(new int[] {2, 0, 3});
    }

    @Test
    public void test12() {
        assertThat(solution1.kWeakestRows(new int[][]{
                {1, 0, 0, 0},
                {1, 1, 1, 1},
                {1, 0, 0, 0},
                {1, 0, 0, 0}
        }, 2)).isEqualTo(new int[] {0, 2});
    }

    @Test
    public void test13() {
        assertThat(solution1.kWeakestRows(new int[][]{
                {1, 0},
                {1, 0},
                {1, 0},
                {1, 1}
        }, 4)).isEqualTo(new int[] {0, 1, 2, 3});
    }

    @Test
    public void test14() {
        assertThat(solution1.kWeakestRows(new int[][]{
                {1, 1, 1, 1},
                {1, 0, 0 ,0},
                {1, 1, 0, 0},
                {1, 1, 1, 0},
                {1, 1, 1, 1}
        }, 3)).isEqualTo(new int[] {1, 2, 3});
    }
}
