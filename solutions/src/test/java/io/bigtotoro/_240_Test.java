package io.bigtotoro;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _240_Test {

    private static final _240.Solution1 SOLUTION_1 = new _240.Solution1();

    @Test
    public void test11() {
        assertThat(SOLUTION_1.searchMatrix(new int[][]{
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        }, 5)).isTrue();
    }

    @Test
    public void test12() {
        assertThat(SOLUTION_1.searchMatrix(new int[][]{
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        }, 20)).isFalse();
    }

    @Test
    public void test13() {
        assertThat(SOLUTION_1.searchMatrix(new int[][]{{-5}}, -10)).isFalse();
    }
}
