package io.bigtotoro;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _1631_Test {

    private static _1631.Solution1 solution1 = new _1631.Solution1();
    private static _1631.Solution2 solution2 = new _1631.Solution2();

    @Test
    public void test11() {
        assertThat(solution1.minimumEffortPath(new int[][]{{1, 2, 2}, {3, 8, 2}, {5, 3, 5}})).isEqualTo(2);
    }

    @Test
    public void test12() {
        assertThat(solution1.minimumEffortPath(new int[][]{{1, 2, 3}, {3, 8, 4}, {5, 3, 5}})).isEqualTo(1);
    }

    @Test
    public void test13() {
        assertThat(solution1.minimumEffortPath(new int[][]{{1, 2, 1, 1, 1}, {1, 2, 1, 2, 1}, {1, 2, 1, 2, 1},
                {1, 2, 1, 2, 1}, {1, 1, 1, 2, 1}})).isEqualTo(0);
    }

    @Test
    public void test21() {
        assertThat(solution2.minimumEffortPath(new int[][]{{1, 2, 2}, {3, 8, 2}, {5, 3, 5}})).isEqualTo(2);
    }

    @Test
    public void test22() {
        assertThat(solution2.minimumEffortPath(new int[][]{{1, 2, 3}, {3, 8, 4}, {5, 3, 5}})).isEqualTo(1);
    }

    @Test
    public void test23() {
        assertThat(solution2.minimumEffortPath(new int[][]{{1, 2, 1, 1, 1}, {1, 2, 1, 2, 1}, {1, 2, 1, 2, 1},
                {1, 2, 1, 2, 1}, {1, 1, 1, 2, 1}})).isEqualTo(0);
    }
}
