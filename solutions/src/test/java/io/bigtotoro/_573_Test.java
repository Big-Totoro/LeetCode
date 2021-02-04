package io.bigtotoro;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _573_Test {

    private static final _573.Solution1 SOLUTION_1 = new _573.Solution1();

    @Test
    public void test11() {
        assertThat(SOLUTION_1.minDistance(5, 7,
                new int[] {2, 2}, new int[] {4, 4}, new int[][]{{3, 0}, {2, 5}})).isEqualTo(12);
    }
}
