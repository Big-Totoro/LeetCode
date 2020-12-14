package io.bigtotoro;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _1502_Test {

    @Test
    public void test11() {
        assertThat(new _1502.Solution1().canMakeArithmeticProgression(new int[] {3, 5, 1})).isTrue();
    }

    @Test
    public void test12() {
        assertThat(new _1502.Solution1().canMakeArithmeticProgression(new int[] {1, 2, 4})).isFalse();
    }
}
