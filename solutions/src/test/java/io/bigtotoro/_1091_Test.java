package io.bigtotoro;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _1091_Test {

    private static final _1091.Solution1 SOLUTION_1 = new _1091.Solution1();

    @Test
    public void test11() {
        assertThat(SOLUTION_1.shortestPathBinaryMatrix(new int[][]{
                {0, 1},
                {1, 0}
        })).isEqualTo(2);
    }

    @Test
    public void test12() {
        assertThat(SOLUTION_1.shortestPathBinaryMatrix(new int[][]{
                {0, 0, 0},
                {1, 1, 0},
                {1, 1, 0}
        })).isEqualTo(4);
    }
}
