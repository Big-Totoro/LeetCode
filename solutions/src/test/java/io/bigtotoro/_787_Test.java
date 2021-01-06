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

    @Test
    public void test13() {
        assertThat(SOLUTION_1.findCheapestPrice(10, new int[][]{
                    {3,4,4}, {2,5,6}, {4,7,10}, {9,6,5}, {7,4,4}, {6,2,10}, {6,8,6}, {7,9,4}, {1,5,4}, {1,0,4}, {9,7,3},
                    {7,0,5}, {6,5,8}, {1,7,6}, {4,0,9}, {5,9,1}, {8,7,3}, {1,2,6}, {4,1,5}, {5,2,4}, {1,9,1}, {7,8,10},
                    {0,4,2}, {7,2,8}
                }, 6, 0, 7))
                .isEqualTo(14);
    }
}
