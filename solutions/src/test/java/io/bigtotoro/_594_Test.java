package io.bigtotoro;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _594_Test {

    private static final _594.Solution1 SOLUTION_1 = new _594.Solution1();

    @Test
    public void test11() {
        assertThat(SOLUTION_1.findLHS(new int[] {1, 3, 2, 2, 5, 2, 3, 7})).isEqualTo(5);
    }

    @Test
    public void test12() {
        assertThat(SOLUTION_1.findLHS(new int[] {1, 2, 3, 4})).isEqualTo(2);
    }

    @Test
    public void test13() {
        assertThat(SOLUTION_1.findLHS(new int[] {1, 1, 1, 1})).isEqualTo(0);
    }
}
