package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _1572_Test {

    private static _1572.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1572.Solution1();
    }

    @Test
    public void test11() {
        assertThat(solution1.diagonalSum(new int[][]{
                {1, 2, 3}, {4, 5, 6}, {7, 8, 9}
        })).isEqualTo(25);
    }

    @Test
    public void test12() {
        assertThat(solution1.diagonalSum(new int[][]{
                {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}
        })).isEqualTo(8);
    }

    @Test
    public void test13() {
        assertThat(solution1.diagonalSum(new int[][]{
                {5}
        })).isEqualTo(5);
    }

    @Test
    public void test14() {
        assertThat(solution1.diagonalSum(new int[][]{
                {7, 3, 1, 9}, {3, 4, 6, 9}, {6, 9, 6, 6}, {9, 5, 8, 5}
        })).isEqualTo(55);
    }
}