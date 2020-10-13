package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _463_Test {

    private static _463.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _463.Solution1();
    }

    @Test
    public void test11() {
        assertThat(solution1.islandPerimeter(new int[][] {{0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}})).isEqualTo(16);
    }

    @Test
    public void test12() {
        assertThat(solution1.islandPerimeter(new int[][] {{1}})).isEqualTo(4);
    }

    @Test
    public void test13() {
        assertThat(solution1.islandPerimeter(new int[][] {{1, 0}})).isEqualTo(4);
    }
}
