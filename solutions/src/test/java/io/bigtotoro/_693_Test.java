package io.bigtotoro;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _693_Test {

    private static _693.Solution1 solution1 = new _693.Solution1();

    @Test
    public void test11() {
        assertThat(solution1.hasAlternatingBits(5)).isTrue();
    }

    @Test
    public void test12() {
        assertThat(solution1.hasAlternatingBits(7)).isFalse();
    }

    @Test
    public void test13() {
        assertThat(solution1.hasAlternatingBits(11)).isFalse();
    }

    @Test
    public void test14() {
        assertThat(solution1.hasAlternatingBits(10)).isTrue();
    }

    @Test
    public void test15() {
        assertThat(solution1.hasAlternatingBits(3)).isFalse();
    }
}
