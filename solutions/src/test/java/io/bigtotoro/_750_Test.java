package io.bigtotoro;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _750_Test {

    private static final _750.Solution1 SOLUTION_1 = new _750.Solution1();

    @Test
    public void test11() {
        assertThat(SOLUTION_1.countCornerRectangles(new int[][]{
                {1, 0, 0, 1, 0},
                {0, 0, 1, 0, 1},
                {0, 0, 0, 1, 0},
                {1, 0, 1, 0, 1}})).isEqualTo(1);
    }

    @Test
    public void test12() {
        assertThat(SOLUTION_1.countCornerRectangles(new int[][]{
                {1, 1, 1},
                {1, 1, 1},
                {1, 1, 1}})).isEqualTo(9);
    }

    @Test
    public void test13() {
        assertThat(SOLUTION_1.countCornerRectangles(new int[][]
                {{1, 1, 1, 1}})).isEqualTo(0);
    }
}