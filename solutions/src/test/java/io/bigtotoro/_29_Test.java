package io.bigtotoro;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _29_Test {

    private static final _29.Solution1 SOLUTION_1 = new _29.Solution1();

    @Test
    public void test11() {
        assertThat(SOLUTION_1.divide(10, 3)).isEqualTo(3);
    }

    @Test
    public void test12() {
        assertThat(SOLUTION_1.divide(7, -3)).isEqualTo(-2);
    }

    @Test
    public void test13() {
        assertThat(SOLUTION_1.divide(0, 1)).isEqualTo(0);
    }

    @Test
    public void test14() {
        assertThat(SOLUTION_1.divide(1, 1)).isEqualTo(1);
    }

    @Test
    public void test15() {
        assertThat(SOLUTION_1.divide(-2147483648, -1)).isEqualTo(2147483647);
    }

    @Test
    public void test16() {
        assertThat(SOLUTION_1.divide(694, 53)).isEqualTo(13);
    }
}
