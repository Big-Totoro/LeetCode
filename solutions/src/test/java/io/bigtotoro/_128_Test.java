package io.bigtotoro;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _128_Test {

    private static _128.Solution1 solution1 = new _128.Solution1();

    @Test
    public void test11() {
        assertThat(solution1.longestConsecutive(new int[] {100, 4, 200, 1, 3, 2})).isEqualTo(4);
    }

    @Test
    public void test12() {
        assertThat(solution1.longestConsecutive(new int[] {0, 3, 7, 2, 5, 8, 4, 6, 0, 1})).isEqualTo(9);
    }
}
