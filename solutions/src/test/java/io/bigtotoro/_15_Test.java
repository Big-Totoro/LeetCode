package io.bigtotoro;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class _15_Test {

    private static _15.Solution1 solution1 = new _15.Solution1();
    private static _15.Solution2 solution2 = new _15.Solution2();

    @Test
    public void test11() {
        assertThat(solution1.threeSum(new int[] {-1, 0, 1, 2, -1, -4}))
                .isEqualTo(List.of(List.of(-1, -1, 2), List.of(-1, 0, 1)));
    }

    @Test
    public void test12() {
        assertThat(solution1.threeSum(new int[] {})).isEqualTo(List.of());
    }

    @Test
    public void test13() {
        assertThat(solution1.threeSum(new int[] {0})).isEqualTo(List.of());
    }

    @Test
    public void test21() {
        assertThat(solution2.threeSum(new int[] {-1, 0, 1, 2, -1, -4}))
                .isEqualTo(List.of(List.of(-1, -1, 2), List.of(-1, 0, 1)));
    }

    @Test
    public void test22() {
        assertThat(solution2.threeSum(new int[] {})).isEqualTo(List.of());
    }

    @Test
    public void test23() {
        assertThat(solution2.threeSum(new int[] {0})).isEqualTo(List.of());
    }
}
