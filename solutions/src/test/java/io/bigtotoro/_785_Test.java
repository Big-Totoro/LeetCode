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
}
