package io.bigtotoro;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _91_Test {

    private static _91.Solution1 solution1 = new _91.Solution1();

    @Test
    public void test11() {
        assertThat(solution1.numDecodings("12")).isEqualTo(2);
    }

    @Test
    public void test12() {
        assertThat(solution1.numDecodings("226")).isEqualTo(3);
    }

    @Test
    public void test13() {
        assertThat(solution1.numDecodings("0")).isEqualTo(0);
    }

    @Test
    public void test14() {
        assertThat(solution1.numDecodings("06")).isEqualTo(0);
    }
}
