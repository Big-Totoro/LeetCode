package io.bigtotoro;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _785_Test {

    private static final _785.Solution1 SOLUTION_1 = new _785.Solution1();

    @Test
    public void test11() {
        assertThat(SOLUTION_1.isBipartite(new int[][]{
                {1, 3},
                {0, 2},
                {1, 3},
                {0, 2},
        })).isTrue();
    }

    @Test
    public void test12() {
        assertThat(SOLUTION_1.isBipartite(new int[][]{
                {1, 2, 3},
                {0, 2},
                {0, 1, 3},
                {0, 2},
        })).isFalse();
    }

    @Test
    public void test13() {
        assertThat(SOLUTION_1.isBipartite(new int[][]{
                {},
                {2, 4, 6},
                {1, 4, 8, 9},
                {7, 8},
                {1, 2, 8, 9},
                {6, 9},
                {1, 5, 7, 8, 9},
                {3, 6, 9},
                {2, 3, 4, 6, 9},
                {2, 4, 5, 6, 7, 8},
        })).isFalse();
    }
}
