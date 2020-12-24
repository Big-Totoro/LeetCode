package io.bigtotoro;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _743_Test {

    private static _743.Solution1 solution1 = new _743.Solution1();

    @Test
    public void test11() {
        assertThat(solution1.networkDelayTime(new int[][] {{2, 1, 1}, {2, 3, 1}, {3, 4, 1}}, 4, 2)).isEqualTo(2);
    }
}
