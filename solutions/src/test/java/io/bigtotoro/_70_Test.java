package io.bigtotoro;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _70_Test {

    private static _70.Solution1 solution1 = new _70.Solution1();

    @Test
    public void test11() {
        assertThat(solution1.climbStairs(1)).isEqualTo(1);
    }

    @Test
    public void test12() {
        assertThat(solution1.climbStairs(2)).isEqualTo(2);
    }

    @Test
    public void test13() {
        assertThat(solution1.climbStairs(3)).isEqualTo(3);
    }

    @Test
    public void test14() {
        assertThat(solution1.climbStairs(4)).isEqualTo(5);
    }

    @Test
    public void test15() {
        assertThat(solution1.climbStairs(5)).isEqualTo(8);
    }
}
