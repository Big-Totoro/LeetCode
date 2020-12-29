package io.bigtotoro;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _490_Test {

    public static final _490.Solution1 SOLUTION_1 = new _490.Solution1();

    @Test
    public void test11() {
        assertThat(SOLUTION_1.hasPath(new int[][] {
                {0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0},
                {1, 1, 0, 1, 1},
                {0, 0, 0, 0, 0}
        }, new int[] {0, 4}, new int[] {4, 4})).isEqualTo(true);
    }

    @Test
    public void test12() {
        assertThat(SOLUTION_1.hasPath(new int[][] {
                {0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0},
                {1, 1, 0, 1, 1},
                {0, 0, 0, 0, 0}
        }, new int[] {0, 4}, new int[] {3, 2})).isEqualTo(false);
    }

    @Test
    public void test13() {
        assertThat(SOLUTION_1.hasPath(new int[][] {
                {0,0,0,0,1,0,0},
                {0,0,1,0,0,0,0},
                {0,0,0,0,0,0,0},
                {0,0,0,0,0,0,1},
                {0,1,0,0,0,0,0},
                {0,0,0,1,0,0,0},
                {0,0,0,0,0,0,0},
                {0,0,1,0,0,0,1},
                {0,0,0,0,1,0,0}
        }, new int[] {0, 0}, new int[] {8, 6})).isEqualTo(true);
    }
}
