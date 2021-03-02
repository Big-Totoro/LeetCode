package io.bigtotoro;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _645_Test {

    private static final _645.Solution1 SOLUTION_1 = new _645.Solution1();

    @Test
    public void test11() {
        assertThat(SOLUTION_1.findErrorNums(new int[] {1, 2, 2, 4})).isEqualTo(new int[] {2, 3});
    }

    @Test
    public void test12() {
        assertThat(SOLUTION_1.findErrorNums(new int[] {1, 1})).isEqualTo(new int[] {1, 2});
    }
}
