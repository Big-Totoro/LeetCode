package io.bigtotoro;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _1176_Test {

    private static final _1176.Solution1 SOLUTION_1 = new _1176.Solution1();

    @Test
    public void test11() {
        assertThat(SOLUTION_1.dietPlanPerformance(new int[] {1, 2, 3, 4, 5}, 1, 3, 3)).isEqualTo(0);
    }

    @Test
    public void test12() {
        assertThat(SOLUTION_1.dietPlanPerformance(new int[] {3, 2}, 2, 0, 1)).isEqualTo(1);
    }

    @Test
    public void test13() {
        assertThat(SOLUTION_1.dietPlanPerformance(new int[] {6, 5, 0, 0}, 2, 1, 5)).isEqualTo(0);
    }
}
