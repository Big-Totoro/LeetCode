package io.bigtotoro;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _202_Test {

    private static _202.Solution1 solution1 = new _202.Solution1();

    @Test
    public void test11() {
        assertThat(solution1.isHappy(19)).isTrue();
    }

    @Test
    public void test12() {
        assertThat(solution1.isHappy(2)).isFalse();
    }

    @Test
    public void test13() {
        assertThat(solution1.isHappy(7)).isTrue();
    }
}