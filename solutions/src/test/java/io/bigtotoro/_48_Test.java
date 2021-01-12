package io.bigtotoro;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _48_Test {

    private static final _48.Solution1 SOLUTION_1 = new _48.Solution1();

    @Test
    public void test11() {
        int[][] matrix = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        SOLUTION_1.rotate(matrix);
        assertThat(matrix).isEqualTo(new int[][] {{7, 4, 1}, {8, 5, 2}, {9, 6, 3}});
    }

    @Test
    public void test12() {
        int[][] matrix = new int[][] {{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}};
        SOLUTION_1.rotate(matrix);
        assertThat(matrix).isEqualTo(new int[][] {{15, 13, 2, 5}, {14, 3, 4, 1}, {12, 6, 8, 9}, {16, 7, 10, 11}});
    }

    @Test
    public void test13() {
        int[][] matrix = new int[][] {{1}};
        SOLUTION_1.rotate(matrix);
        assertThat(matrix).isEqualTo(new int[][]{{1}});
    }

    @Test
    public void test14() {
        int[][] matrix = new int[][] {{1, 2}, {3, 4}};
        SOLUTION_1.rotate(matrix);
        assertThat(matrix).isEqualTo(new int[][]{{3, 1}, {4, 2}});
    }
}
