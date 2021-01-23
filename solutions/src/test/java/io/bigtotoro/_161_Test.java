package io.bigtotoro;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _161_Test {

    private static final _161.Solution1 SOLUTION_1 = new _161.Solution1();

    @Test
    public void test11() {
        assertThat(SOLUTION_1.isOneEditDistance("ab", "acb")).isTrue();
    }

    @Test
    public void test12() {
        assertThat(SOLUTION_1.isOneEditDistance("", "")).isFalse();
    }

    @Test
    public void test13() {
        assertThat(SOLUTION_1.isOneEditDistance("a", "")).isTrue();
    }

    @Test
    public void test14() {
        assertThat(SOLUTION_1.isOneEditDistance("c", "c")).isFalse();
    }

    @Test
    public void test15() {
        assertThat(SOLUTION_1.isOneEditDistance("a", "A")).isTrue();
    }

    @Test
    public void test16() {
        assertThat(SOLUTION_1.isOneEditDistance("aca", "caca")).isTrue();
    }
}
