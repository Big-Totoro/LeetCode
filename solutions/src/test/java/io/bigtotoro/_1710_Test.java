package io.bigtotoro;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _1710_Test {

    private static final _1710.Solution1 SOLUTION_1 = new _1710.Solution1();

    @Test
    public void test11() {
        assertThat(SOLUTION_1.maximumUnits(new int[][]{{1, 3}, {2, 2}, {3, 1}}, 4)).isEqualTo(8);
    }

    @Test
    public void test12() {
        assertThat(SOLUTION_1.maximumUnits(new int[][]{{5, 10}, {2, 5}, {4, 7}, {3, 9}}, 10)).isEqualTo(91);
    }
}
