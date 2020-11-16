package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _1475_Test {

    private static _1475.Solution1 solution1;
    private static _1475.Solution2 solution2;

    @BeforeClass
    public static void setup() {
        solution1 = new _1475.Solution1();
        solution2 = new _1475.Solution2();
    }

    @Test
    public void test11() {
        assertThat(solution1.finalPrices(new int[] {8, 4, 6, 2, 3})).isEqualTo(new int[] {4, 2, 4, 2, 3});
    }

    @Test
    public void test12() {
        assertThat(solution1.finalPrices(new int[] {1, 2, 3, 4, 5})).isEqualTo(new int[] {1, 2, 3, 4, 5});
    }

    @Test
    public void test13() {
        assertThat(solution1.finalPrices(new int[] {10, 1, 1, 6})).isEqualTo(new int[] {9, 0, 1, 6});
    }

    @Test
    public void test14() {
        assertThat(solution1.finalPrices(new int[] {8, 7, 4, 2, 8, 1, 7, 7, 10, 1}))
                .isEqualTo(new int[] {1, 3, 2, 1, 7, 0, 0, 6, 9, 1});
    }

    @Test
    public void test21() {
        assertThat(solution2.finalPrices(new int[] {8, 4, 6, 2, 3})).isEqualTo(new int[] {4, 2, 4, 2, 3});
    }

    @Test
    public void test22() {
        assertThat(solution2.finalPrices(new int[] {1, 2, 3, 4, 5})).isEqualTo(new int[] {1, 2, 3, 4, 5});
    }

    @Test
    public void test23() {
        assertThat(solution2.finalPrices(new int[] {10, 1, 1, 6})).isEqualTo(new int[] {9, 0, 1, 6});
    }

    @Test
    public void test24() {
        assertThat(solution2.finalPrices(new int[] {8, 7, 4, 2, 8, 1, 7, 7, 10, 1}))
                .isEqualTo(new int[] {1, 3, 2, 1, 7, 0, 0, 6, 9, 1});
    }
}
