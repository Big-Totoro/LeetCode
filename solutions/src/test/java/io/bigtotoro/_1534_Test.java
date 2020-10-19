package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _1534_Test {

    private static _1534.Solution1 solution1;
    private static _1534.Solution2 solution2;

    @BeforeClass
    public static void setup() {
        solution1 = new _1534.Solution1();
        solution2 = new _1534.Solution2();
    }

    @Test
    public void test11() {
        assertThat(solution1.countGoodTriplets(new int[] {3, 0, 1, 1, 9, 7}, 7, 2, 3)).isEqualTo(4);
    }

    @Test
    public void test12() {
        assertThat(solution1.countGoodTriplets(new int[] {1, 1, 2, 2, 3}, 0, 0, 1)).isEqualTo(0);
    }

    @Test
    public void test21() {
        assertThat(solution2.countGoodTriplets(new int[] {3, 0, 1, 1, 9, 7}, 7, 2, 3)).isEqualTo(4);
    }

    @Test
    public void test22() {
        assertThat(solution2.countGoodTriplets(new int[] {1, 1, 2, 2, 3}, 0, 0, 1)).isEqualTo(0);
    }
}
