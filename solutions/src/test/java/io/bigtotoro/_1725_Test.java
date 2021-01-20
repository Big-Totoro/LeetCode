package io.bigtotoro;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _1725_Test {

    private static final _1725.Solution1 SOLUTION_1 = new _1725.Solution1();

    @Test
    public void test11() {
        assertThat(SOLUTION_1.countGoodRectangles(
                new int[][]{{5, 8}, {3, 9}, {5, 12}, {16, 5}}
        )).isEqualTo(3);
    }

    @Test
    public void test12() {
        assertThat(SOLUTION_1.countGoodRectangles(
                new int[][]{{2, 3}, {3, 7}, {4, 3}, {3, 7}}
        )).isEqualTo(3);
    }
}
