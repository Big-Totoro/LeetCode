package io.bigtotoro;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class _216_Test {

    private static _216.Solution1 solution1 = new _216.Solution1();

    @Test
    public void test11() {
        assertThat(solution1.combinationSum3(3, 7)).isEqualTo(List.of(List.of(1, 2, 4)));
    }

    @Test
    public void test12() {
        assertThat(solution1.combinationSum3(3, 9))
                .isEqualTo(List.of(List.of(1, 2, 6), List.of(1, 3, 5), List.of(2, 3, 4)));
    }

    @Test
    public void test13() {
        assertThat(solution1.combinationSum3(4, 1)).isEqualTo(List.of());
    }

    @Test
    public void test14() {
        assertThat(solution1.combinationSum3(3, 2)).isEqualTo(List.of());
    }

    @Test
    public void test15() {
        assertThat(solution1.combinationSum3(9, 45)).containsExactly(List.of(1 ,2, 3, 4, 5, 6, 7, 8, 9));
    }
}
