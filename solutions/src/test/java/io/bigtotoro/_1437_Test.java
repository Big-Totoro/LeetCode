package io.bigtotoro;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _1437_Test {

    private static final _1437.Solution1 SOLUTION_1 = new _1437.Solution1();

    @Test
    public void test11() {
        assertThat(SOLUTION_1.kLengthApart(new int[] {1, 0, 0, 0, 1, 0, 0, 1}, 2)).isTrue();
    }

    @Test
    public void test12() {
        assertThat(SOLUTION_1.kLengthApart(new int[] {1, 0, 0, 1, 0, 1}, 2)).isFalse();
    }

    @Test
    public void test13() {
        assertThat(SOLUTION_1.kLengthApart(new int[] {1, 1, 1, 1, 1, 1}, 0)).isTrue();
    }

    @Test
    public void test14() {
        assertThat(SOLUTION_1.kLengthApart(new int[] {0, 1, 0, 1}, 1)).isTrue();
    }
}
