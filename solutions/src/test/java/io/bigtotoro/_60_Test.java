package io.bigtotoro;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _60_Test {

    private static _60.Solution1 solution1 = new _60.Solution1();

    @Test
    public void test11() {
        assertThat(solution1.getPermutation(3, 3)).isEqualTo("213");
    }

    @Test
    public void test12() {
        assertThat(solution1.getPermutation(4, 9)).isEqualTo("2314");
    }

    @Test
    public void test13() {
        assertThat(solution1.getPermutation(3, 1)).isEqualTo("123");
    }

    @Test
    public void test14() {
        assertThat(solution1.getPermutation(1, 1)).isEqualTo("1");
    }

    @Test
    public void test15() {
        assertThat(solution1.getPermutation(3, 2)).isEqualTo("132");
    }
}
