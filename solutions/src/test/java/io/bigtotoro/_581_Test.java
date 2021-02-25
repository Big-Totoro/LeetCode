package io.bigtotoro;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _581_Test {

    private static final _581.Solution1 SOLUTION_1 = new _581.Solution1();

    @Test
    public void test11() {
        assertThat(SOLUTION_1.findUnsortedSubarray(new int[] {2, 6, 4, 8, 10, 9, 15})).isEqualTo(5);
    }

    @Test
    public void test12() {
        assertThat(SOLUTION_1.findUnsortedSubarray(new int[] {1, 2, 3, 4})).isEqualTo(0);
    }

    @Test
    public void test13() {
        assertThat(SOLUTION_1.findUnsortedSubarray(new int[] {1})).isEqualTo(0);
    }
}