package io.bigtotoro;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _1356_Test {

    private static final _1356.Solution1 SOLUTION_1 = new _1356.Solution1();

    @Test
    public void test11() {
        assertThat(SOLUTION_1.sortByBits(new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8}))
                .isEqualTo(new int[] {0, 1, 2, 4, 8, 3, 5, 6, 7});
    }

    @Test
    public void test12() {
        assertThat(SOLUTION_1.sortByBits(new int[] {1024, 512, 256, 128, 64, 32, 16, 8, 4, 2, 1}))
                .isEqualTo(new int[] {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024});
    }

    @Test
    public void test13() {
        assertThat(SOLUTION_1.sortByBits(new int[] {10000, 10000}))
                .isEqualTo(new int[] {10000, 10000});
    }

    @Test
    public void test14() {
        assertThat(SOLUTION_1.sortByBits(new int[] {2, 3, 5, 7, 11, 13, 17, 19}))
                .isEqualTo(new int[] {2, 3, 5, 17, 7, 11, 13, 19});
    }

    @Test
    public void test15() {
        assertThat(SOLUTION_1.sortByBits(new int[] {10, 100, 1000, 10000}))
                .isEqualTo(new int[] {10, 100, 10000, 1000});
    }
}
