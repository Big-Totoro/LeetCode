package io.bigtotoro;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _292_Test {

    private static _292.Solution1 solution1 = new _292.Solution1();

    @Test
    public void test11() {
        assertThat(solution1.canWinNim(4)).isFalse();
    }

    @Test
    public void test12() {
        assertThat(solution1.canWinNim(1)).isTrue();
    }

    @Test
    public void test13() {
        assertThat(solution1.canWinNim(2)).isTrue();
    }
}
