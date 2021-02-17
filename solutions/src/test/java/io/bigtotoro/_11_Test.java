package io.bigtotoro;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _11_Test {

    private static final _11.Solution1 SOLUTION_1 = new _11.Solution1();

    @Test
    public void test11() {
        assertThat(SOLUTION_1.maxArea(new int[] {1, 1})).isEqualTo(1);
    }

    @Test
    public void test12() {
        assertThat(SOLUTION_1.maxArea(new int[] {4, 3, 2, 1, 4})).isEqualTo(16);
    }

    @Test
    public void test13() {
        assertThat(SOLUTION_1.maxArea(new int[] {1, 2, 1})).isEqualTo(2);
    }
}