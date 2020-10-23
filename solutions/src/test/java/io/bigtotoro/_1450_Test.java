package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _1450_Test {

    private static _1450.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1450.Solution1();
    }

    @Test
    public void test11() {
        assertThat(solution1.busyStudent(new int[] {1, 2, 3}, new int[] {3, 2, 7}, 4)).isEqualTo(1);
    }

    @Test
    public void test12() {
        assertThat(solution1.busyStudent(new int[] {4}, new int[] {4}, 4)).isEqualTo(1);
    }

    @Test
    public void test13() {
        assertThat(solution1.busyStudent(new int[] {4}, new int[] {4}, 5)).isEqualTo(0);
    }

    @Test
    public void test14() {
        assertThat(solution1.busyStudent(new int[] {1, 1, 1, 1}, new int[] {1, 3, 2, 4}, 7)).isEqualTo(0);
    }

    @Test
    public void test15() {
        assertThat(solution1.busyStudent(new int[] {9, 8, 7, 6, 5, 4, 3, 2, 1},
                new int[] {10, 10, 10, 10, 10, 10, 10, 10, 10}, 5)).isEqualTo(5);
    }
}
