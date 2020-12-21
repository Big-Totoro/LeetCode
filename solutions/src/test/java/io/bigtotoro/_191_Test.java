package io.bigtotoro;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _191_Test {

    private static _191.Solution1 solution1 = new _191.Solution1();

    @Test
    public void test11() {
        assertThat(solution1.hammingWeight(0b11111111111111111111111111111101)).isEqualTo(31);
    }
}
