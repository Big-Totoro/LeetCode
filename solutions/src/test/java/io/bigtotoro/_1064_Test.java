package io.bigtotoro;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _1064_Test {

    private static _1064.Solution1 solution1 = new _1064.Solution1();

    @Test
    public void test11() {
        assertThat(solution1.fixedPoint(new int[] {-10, -5, 0, 3, 7})).isEqualTo(3);
    }

    @Test
    public void test12() {
        assertThat(solution1.fixedPoint(new int[] {0, 2, 5, 8, 17})).isEqualTo(0);
    }

    @Test
    public void test13() {
        assertThat(solution1.fixedPoint(new int[] {-10, -5, 3, 4, 7, 9})).isEqualTo(-1);
    }

    @Test
    public void test14() {
        assertThat(solution1.fixedPoint(new int[] {-10, -5, -2, 0, 4, 5, 6, 7, 8, 9, 10})).isEqualTo(4);
    }
}
