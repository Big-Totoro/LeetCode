package io.bigtotoro;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _1133_Test {

    private _1133.Solution1 solution1 = new _1133.Solution1();

    @Test
    public void test11() {
        assertThat(solution1.largestUniqueNumber(new int[] {5, 7, 3, 9, 4, 9, 8, 3, 1})).isEqualTo(8);
    }

    @Test
    public void test12() {
        assertThat(solution1.largestUniqueNumber(new int[] {9, 9, 8, 8})).isEqualTo(-1);
    }
}
