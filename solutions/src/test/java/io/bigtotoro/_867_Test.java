package io.bigtotoro;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _867_Test {

    private static _867.Solution1 solution1 = new _867.Solution1();

    @Test
    public void test11() {
        assertThat(solution1.transpose(new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}))
            .isEqualTo(new int[][] {{1, 4, 7}, {2, 5, 8}, {3, 6, 9}});
    }
}
