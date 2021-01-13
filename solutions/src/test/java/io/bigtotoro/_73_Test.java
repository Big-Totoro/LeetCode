package io.bigtotoro;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _73_Test {

    private static final _73.Solution1 SOLUTION_1 = new _73.Solution1();

    @Test
    public void test11() {
        int[][] matrix = new int[][] {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        SOLUTION_1.setZeroes(matrix);
        assertThat(matrix).isEqualTo(new int[][] {{1, 0, 1}, {0, 0, 0}, {1, 0, 1}});
    }

    @Test
    public void test12() {
        int[][] matrix = new int[][] {{0, 1, 2, 0}, {3, 4, 5, 2},{1, 3, 1, 5}};
        SOLUTION_1.setZeroes(matrix);
        assertThat(matrix).isEqualTo(new int[][] {{0, 0, 0, 0}, {0, 4, 5, 0},{0, 3, 1, 0}});
    }
}
