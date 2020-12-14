package io.bigtotoro;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class _1380_Test {

    private static _1380.Solution1 solution1 = new _1380.Solution1();

    @Test
    public void test11() {
        assertThat(solution1.luckyNumbers(new int[][] {{3, 7, 8}, {9, 11, 13}, {15, 16, 17}})).isEqualTo(List.of(15));
    }

    @Test
    public void test12() {
        assertThat(solution1.luckyNumbers(new int[][] {{1, 10, 4, 2}, {9, 3, 8, 7}, {15, 16, 17, 12}}))
                .isEqualTo(List.of(12));
    }

    @Test
    public void test13() {
        assertThat(solution1.luckyNumbers(new int[][] {{7, 8}, {1, 2}})).isEqualTo(List.of(7));
    }
}
