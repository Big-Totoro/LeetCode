package io.bigtotoro;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _1329_Test {

    private static final _1329.Solution1 SOLUTION_1 = new _1329.Solution1();

    @Test
    public void test11() {
        assertThat(SOLUTION_1.diagonalSort(new int[][]{{3, 3, 1, 1}, {2, 2, 1, 2}, {1, 1, 1, 2}}))
            .isEqualTo(new int[][] {{1, 1, 1, 1}, {1, 2, 2, 2}, {1, 2, 3, 3}});
    }
}
