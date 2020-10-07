package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _1266_Test {

    private static _1266.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1266.Solution1();
    }

    @Test
    public void test1() {
        assertThat(solution1.minTimeToVisitAllPoints(new int[][] {{1, 1}, {3, 4}, {-1, 0}})).isEqualTo(7);
    }

    @Test
    public void test2() {
        assertThat(solution1.minTimeToVisitAllPoints(new int[][] {{3, 2}, {-2, 2}})).isEqualTo(5);
    }
}