package io.bigtotoro;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class _310_Test {

    @Test
    public void test11() {
        _310.Solution1 solution1 = new _310.Solution1();
        assertThat(solution1.findMinHeightTrees(4, new int[][]{{1, 0}, {1, 2}, {1, 3}})).isEqualTo(List.of(1));
    }

    @Test
    public void test12() {
        _310.Solution1 solution1 = new _310.Solution1();
        assertThat(solution1.findMinHeightTrees(6, new int[][]{{3, 0}, {3, 1}, {3, 2}, {3, 4}, {3, 5}}))
                .isEqualTo(List.of(1));
    }

    @Test
    public void test13() {
        _310.Solution1 solution1 = new _310.Solution1();
        assertThat(solution1.findMinHeightTrees(1, new int[][]{}))
                .isEqualTo(List.of(1));
    }

    @Test
    public void test14() {
        _310.Solution1 solution1 = new _310.Solution1();
        assertThat(solution1.findMinHeightTrees(2, new int[][]{{0, 1}}))
                .isEqualTo(List.of(0, 1));
    }
}