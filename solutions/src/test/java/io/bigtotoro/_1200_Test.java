package io.bigtotoro;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class _1200_Test {

    private static _1200.Solution1 solution1 = new _1200.Solution1();

    @Test
    public void test11() {
        assertThat(solution1.minimumAbsDifference(new int[] {4, 2, 1, 3}))
            .isEqualTo(List.of(List.of(1, 2), List.of(2, 3), List.of(3, 4)));
    }

    @Test
    public void test12() {
        assertThat(solution1.minimumAbsDifference(new int[] {1, 3, 6, 10, 15}))
            .isEqualTo(List.of(List.of(1, 3)));
    }

    @Test
    public void test13() {
        assertThat(solution1.minimumAbsDifference(new int[] {3, 8, -10, 23, 19, -4, -14, 27}))
            .isEqualTo(List.of(List.of(-14, -10), List.of(19, 23), List.of(23, 27)));
    }
}