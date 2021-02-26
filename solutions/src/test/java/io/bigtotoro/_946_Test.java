package io.bigtotoro;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _946_Test {

    private static final _946.Solution1 SOLUTION_1 = new _946.Solution1();

    @Test
    public void test11() {
        assertThat(SOLUTION_1.validateStackSequences(new int[] {1, 2, 3, 4, 5}, new int[] {4, 5, 3, 2, 1})).isTrue();
    }

    @Test
    public void test12() {
        assertThat(SOLUTION_1.validateStackSequences(new int[] {1, 2, 3, 4, 5}, new int[] {4, 3, 5, 1, 5})).isFalse();
    }
}
