package io.bigtotoro;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _161_Test {

    private static final _161.Solution1 SOLUTION_1 = new _161.Solution1();
    private static final _161.Solution2 SOLUTION_2 = new _161.Solution2();

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

    @Test
    public void test21() {
        assertThat(SOLUTION_2.isOneEditDistance("ab", "acb")).isTrue();
    }

    @Test
    public void test22() {
        assertThat(SOLUTION_2.isOneEditDistance("", "")).isFalse();
    }

    @Test
    public void test23() {
        assertThat(SOLUTION_2.isOneEditDistance("a", "")).isTrue();
    }

    @Test
    public void test24() {
        assertThat(SOLUTION_2.isOneEditDistance("c", "c")).isFalse();
    }

    @Test
    public void test25() {
        assertThat(SOLUTION_2.isOneEditDistance("a", "A")).isTrue();
    }

    @Test
    public void test26() {
        assertThat(SOLUTION_2.isOneEditDistance("aca", "caca")).isTrue();
    }
}
