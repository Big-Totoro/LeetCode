package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _1252_Test {

    private static _1252.Solution1 solution1;
    private static _1252.Solution2 solution2;

    @BeforeClass
    public static void setup() {
        solution1 = new _1252.Solution1();
        solution2 = new _1252.Solution2();
    }

    @Test
    public void test11() {
        assertThat(solution1.oddCells(2, 3, new int[][] {{0, 1}, {1, 1}})).isEqualTo(6);
    }

    @Test
    public void test21() {
        assertThat(solution2.oddCells(2, 3, new int[][] {{0, 1}, {1, 1}})).isEqualTo(6);
    }
}
