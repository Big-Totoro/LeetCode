package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _1351_Test {

    private static _1351.Solution1 solution1;
    private static _1351.Solution2 solution2;
    private static _1351.Solution3 solution3;

    @BeforeClass
    public static void setup() {
        solution1 = new _1351.Solution1();
        solution2 = new _1351.Solution2();
        solution3 = new _1351.Solution3();
    }

    @Test
    public void test11() {
        assertThat(solution1.countNegatives(new int[][] {
                {4, 3, 2, -1}, {3, 2, 1, -1}, {1, 1, -1, -2}, {-1, -1, -2, -3}
        })).isEqualTo(8);
    }

    @Test
    public void test12() {
        assertThat(solution1.countNegatives(new int[][] {
                {3, 2}, {1, 0}
        })).isEqualTo(0);
    }

    @Test
    public void test13() {
        assertThat(solution1.countNegatives(new int[][] {
                {1, -1}, {-1, -1}
        })).isEqualTo(3);
    }

    @Test
    public void test14() {
        assertThat(solution1.countNegatives(new int[][] {
                {-1}
        })).isEqualTo(1);
    }

    @Test
    public void test21() {
        assertThat(solution2.countNegatives(new int[][] {
                {4, 3, 2, -1}, {3, 2, 1, -1}, {1, 1, -1, -2}, {-1, -1, -2, -3}
        })).isEqualTo(8);
    }

    @Test
    public void test22() {
        assertThat(solution2.countNegatives(new int[][] {
                {3, 2}, {1, 0}
        })).isEqualTo(0);
    }

    @Test
    public void test23() {
        assertThat(solution2.countNegatives(new int[][] {
                {1, -1}, {-1, -1}
        })).isEqualTo(3);
    }

    @Test
    public void test24() {
        assertThat(solution2.countNegatives(new int[][] {
                {-1}
        })).isEqualTo(1);
    }

    @Test
    public void test31() {
        assertThat(solution3.countNegatives(new int[][] {
                {4, 3, 2, -1}, {3, 2, 1, -1}, {1, 1, -1, -2}, {-1, -1, -2, -3}
        })).isEqualTo(8);
    }

    @Test
    public void test32() {
        assertThat(solution3.countNegatives(new int[][] {
                {3, 2}, {1, 0}
        })).isEqualTo(0);
    }

    @Test
    public void test33() {
        assertThat(solution3.countNegatives(new int[][] {
                {1, -1}, {-1, -1}
        })).isEqualTo(3);
    }

    @Test
    public void test34() {
        assertThat(solution3.countNegatives(new int[][] {
                {-1}
        })).isEqualTo(1);
    }
}