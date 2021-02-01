package io.bigtotoro;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _31_Test {

    private static final _31.Solution1 SOLUTION_1 = new _31.Solution1();

    @Test
    public void test11() {
        int[] array = {1, 2, 3};
        int[] expected = {1, 3, 2};
        SOLUTION_1.nextPermutation(array);
        assertThat(array).isEqualTo(expected);
    }

    @Test
    public void test12() {
        int[] array = {3, 2, 1};
        int[] expected = {1, 2, 3};
        SOLUTION_1.nextPermutation(array);
        assertThat(array).isEqualTo(expected);
    }

    @Test
    public void test13() {
        int[] array = {1, 1, 5};
        int[] expected = {1, 5, 1};
        SOLUTION_1.nextPermutation(array);
        assertThat(array).isEqualTo(expected);
    }

    @Test
    public void test14() {
        int[] array = {1};
        int[] expected = {1};
        SOLUTION_1.nextPermutation(array);
        assertThat(array).isEqualTo(expected);
    }
}
