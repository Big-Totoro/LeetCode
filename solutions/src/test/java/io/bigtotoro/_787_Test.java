package io.bigtotoro;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _787_Test {

    private static final _787.Solution1 SOLUTION_1 = new _787.Solution1();

    @Test
    public void test11() {
        assertThat(SOLUTION_1.findCheapestPrice(3, new int[][]{{0, 1, 100}, {1, 2, 100}, {0, 2, 500}}, 0, 2, 1))
                .isEqualTo(200);
    }

    @Test
    public void test12() {
        assertThat(SOLUTION_1.findCheapestPrice(3, new int[][]{{0, 1, 100}, {1, 2, 100}, {0, 2, 500}}, 0, 2, 0))
                .isEqualTo(500);
    }
}
