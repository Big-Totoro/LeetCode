package io.bigtotoro;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _246_Test {

    private static final _246.Solution1 SOLUTION_1 = new _246.Solution1();

    @Test
    public void test11() {
        assertThat(SOLUTION_1.isStrobogrammatic("69")).isTrue();
    }

    @Test
    public void test12() {
        assertThat(SOLUTION_1.isStrobogrammatic("88")).isTrue();
    }

    @Test
    public void test13() {
        assertThat(SOLUTION_1.isStrobogrammatic("962")).isFalse();
    }

    @Test
    public void test14() {
        assertThat(SOLUTION_1.isStrobogrammatic("962")).isFalse();
    }

    @Test
    public void test15() {
        assertThat(SOLUTION_1.isStrobogrammatic("2")).isFalse();
    }

    @Test
    public void test16() {
        assertThat(SOLUTION_1.isStrobogrammatic("609")).isTrue();
    }
}
