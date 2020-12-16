package io.bigtotoro;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _121_Test {

    private static _121.Solution1 solution1 = new _121.Solution1();

    @Test
    public void test11() {
        assertThat(solution1.maxProfit(new int[] {7, 1, 5, 3, 6, 4})).isEqualTo(5);
    }

    @Test
    public void test12() {
        assertThat(solution1.maxProfit(new int[] {7, 6, 4, 3, 1})).isEqualTo(0);
    }
}
