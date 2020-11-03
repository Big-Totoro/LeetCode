package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _122_Test {

    private static _122.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _122.Solution1();
    }

    @Test
    public void test11() {
        assertThat(solution1.maxProfit(new int[] {7, 1, 5, 3, 6, 4})).isEqualTo(7);
    }

    @Test
    public void test12() {
        assertThat(solution1.maxProfit(new int[] {1, 2, 3, 4, 5})).isEqualTo(4);
    }

    @Test
    public void test13() {
        assertThat(solution1.maxProfit(new int[] {7, 6, 4, 3, 1})).isEqualTo(0);
    }
}
