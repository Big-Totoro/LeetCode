package io.bigtotoro;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _714_Test {

    private static final _714.Solution1 SOLUTION_1 = new _714.Solution1();

    @Test
    public void test11() {
        assertThat(SOLUTION_1.maxProfit(new int[] {1, 3, 2, 8, 4, 9}, 2)).isEqualTo(8);
    }

    @Test
    public void test12() {
        assertThat(SOLUTION_1.maxProfit(new int[] {1, 3, 7, 5, 10, 3}, 3)).isEqualTo(6);
    }
}
