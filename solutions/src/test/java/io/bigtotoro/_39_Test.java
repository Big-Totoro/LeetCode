package io.bigtotoro;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class _39_Test {

    private _39.Solution1 solution1 = new _39.Solution1();

    @Test
    public void test11() {
        assertThat(solution1.combinationSum(new int[] {2, 3, 6 ,7}, 7))
            .containsExactlyInAnyOrder(List.of(2, 2, 3), List.of(7));
    }

    @Test
    public void test12() {
        assertThat(solution1.combinationSum(new int[] {2, 3, 5}, 8))
            .containsExactlyInAnyOrder(List.of(2, 2, 2, 2), List.of(2, 3, 3), List.of(3, 5));
    }

    @Test
    public void test13() {
        assertThat(solution1.combinationSum(new int[] {2}, 1))
            .isEqualTo(List.of());
    }

    @Test
    public void test14() {
        assertThat(solution1.combinationSum(new int[] {1}, 1))
            .containsExactlyInAnyOrder(List.of(1));
    }

    @Test
    public void test15() {
        assertThat(solution1.combinationSum(new int[] {1}, 2))
            .containsExactlyInAnyOrder(List.of(1, 1));
    }
}
