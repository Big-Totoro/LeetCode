package io.bigtotoro;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _207_Test {

    @Test
    public void test11() {
        _207.Solution1 solution1 = new _207.Solution1();
        assertThat(solution1.canFinish(2, new int[][]{{1, 0}})).isTrue();
    }

    @Test
    public void test12() {
        _207.Solution1 solution1 = new _207.Solution1();
        assertThat(solution1.canFinish(2, new int[][]{{1, 0}, {0, 1}})).isFalse();
    }
}
