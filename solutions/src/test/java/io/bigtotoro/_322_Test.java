package io.bigtotoro;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _322_Test {

    private static final _322.Solution1 SOLUTION_1 = new _322.Solution1();

    @Test
    public void test11() {
        assertThat(SOLUTION_1.coinChange(new int[] {1, 2, 5}, 11)).isEqualTo(3);
    }

    @Test
    public void test12() {
        assertThat(SOLUTION_1.coinChange(new int[] {2}, 3)).isEqualTo(-1);
    }

    @Test
    public void test13() {
        assertThat(SOLUTION_1.coinChange(new int[] {1}, 0)).isEqualTo(0);
    }

    @Test
    public void test14() {
        assertThat(SOLUTION_1.coinChange(new int[] {1}, 1)).isEqualTo(1);
    }

    @Test
    public void test15() {
        assertThat(SOLUTION_1.coinChange(new int[] {1}, 2)).isEqualTo(2);
    }
}
