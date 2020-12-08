package io.bigtotoro;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _1025_Test {

    private static _1025.Solution1 solution1 = new _1025.Solution1();

    @Test
    public void test11() {
        assertThat(solution1.divisorGame(2)).isEqualTo(true);
    }

    @Test
    public void test12() {
        assertThat(solution1.divisorGame(3)).isEqualTo(false);
    }
}
