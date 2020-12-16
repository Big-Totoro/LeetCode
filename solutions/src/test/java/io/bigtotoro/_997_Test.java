package io.bigtotoro;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _997_Test {

    @Test
    public void test11() {
        _997.Solution1 solution1 = new _997.Solution1();
        assertThat(solution1.findJudge(2, new int[][] {{1, 2}}))
            .isEqualTo(2);
    }

    @Test
    public void test12() {
        _997.Solution1 solution1 = new _997.Solution1();
        assertThat(solution1.findJudge(3, new int[][] {{1, 3}, {2, 3}}))
            .isEqualTo(3);
    }

    @Test
    public void test13() {
        _997.Solution1 solution1 = new _997.Solution1();
        assertThat(solution1.findJudge(3, new int[][] {{1, 3}, {2, 3}, {3, 1}}))
            .isEqualTo(-1);
    }

    @Test
    public void test14() {
        _997.Solution1 solution1 = new _997.Solution1();
        assertThat(solution1.findJudge(3, new int[][] {{1, 2}, {2, 3}}))
            .isEqualTo(-1);
    }

    @Test
    public void test15() {
        _997.Solution1 solution1 = new _997.Solution1();
        assertThat(solution1.findJudge(4, new int[][] {{1, 3}, {1, 4}, {2, 3}, {2, 4}, {4, 3}}))
            .isEqualTo(3);
    }
}
