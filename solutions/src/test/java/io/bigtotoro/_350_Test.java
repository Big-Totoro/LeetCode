package io.bigtotoro;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _350_Test {

    private static final _350.Solution1 SOLUTION_1 = new _350.Solution1();

    @Test
    public void test11() {
        assertThat(SOLUTION_1.intersect(new int[]{1, 2, 2, 1}, new int[]{2, 2})).isEqualTo(new int[]{2, 2});
    }

    @Test
    public void test12() {
        assertThat(SOLUTION_1.intersect(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4})).isEqualTo(new int[]{4, 9});
    }
}