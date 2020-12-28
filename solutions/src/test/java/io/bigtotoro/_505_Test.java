package io.bigtotoro;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _505_Test {

    private static final _505.Solution1 SOLUTION_1 = new _505.Solution1();
    private static final _505.Solution2 SOLUTION_2 = new _505.Solution2();
    private static final _505.Solution3 SOLUTION_3 = new _505.Solution3();

    @Test
    public void test11() {
        assertThat(SOLUTION_1.shortestDistance(new int[][] {
                {0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0},
                {1, 1, 0, 1, 1},
                {0, 0, 0, 0, 0}
        }, new int[] {0, 4}, new int[] {4, 4})).isEqualTo(12);
    }

    @Test
    public void test12() {
        assertThat(SOLUTION_1.shortestDistance(new int[][] {
                {0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0},
                {1, 1, 0, 1, 1},
                {0, 0, 0, 0, 0}
        }, new int[] {0, 4}, new int[] {3, 2})).isEqualTo(-1);
    }

    @Test
    public void test21() {
        assertThat(SOLUTION_2.shortestDistance(new int[][] {
                {0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0},
                {1, 1, 0, 1, 1},
                {0, 0, 0, 0, 0}
        }, new int[] {0, 4}, new int[] {4, 4})).isEqualTo(12);
    }

    @Test
    public void test22() {
        assertThat(SOLUTION_2.shortestDistance(new int[][] {
                {0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0},
                {1, 1, 0, 1, 1},
                {0, 0, 0, 0, 0}
        }, new int[] {0, 4}, new int[] {3, 2})).isEqualTo(-1);
    }

    @Test
    public void test31() {
        assertThat(SOLUTION_3.shortestDistance(new int[][] {
                {0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0},
                {1, 1, 0, 1, 1},
                {0, 0, 0, 0, 0}
        }, new int[] {0, 4}, new int[] {4, 4})).isEqualTo(12);
    }

    @Test
    public void test32() {
        assertThat(SOLUTION_3.shortestDistance(new int[][] {
                {0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0},
                {1, 1, 0, 1, 1},
                {0, 0, 0, 0, 0}
        }, new int[] {0, 4}, new int[] {3, 2})).isEqualTo(-1);
    }
}
