package io.bigtotoro;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class _119_Test {

    private static _119.Solution1 solution1 = new _119.Solution1();

    @Test
    public void test11() {
        assertThat(solution1.getRow(0)).isEqualTo(List.of(1));
    }

    @Test
    public void test12() {
        assertThat(solution1.getRow(1)).isEqualTo(List.of(1, 1));
    }

    @Test
    public void test13() {
        assertThat(solution1.getRow(2)).isEqualTo(List.of(1, 2, 1));
    }

    @Test
    public void test14() {
        assertThat(solution1.getRow(3)).isEqualTo(List.of(1, 3, 3, 1));
    }

    @Test
    public void test15() {
        assertThat(solution1.getRow(4)).isEqualTo(List.of(1, 4, 6, 4, 1));
    }

    @Test
    public void test16() {
        assertThat(solution1.getRow(5)).isEqualTo(List.of(1, 5, 10, 10, 5, 1));
    }

    @Test
    public void test17() {
        assertThat(solution1.getRow(6)).isEqualTo(List.of(1, 6, 15, 20, 15, 6, 1));
    }

    @Test
    public void test18() {
        assertThat(solution1.getRow(13))
                .isEqualTo(List.of(1, 13, 78, 286, 715, 1287, 1716, 1716, 1287, 715, 286, 78, 13, 1));
    }
}