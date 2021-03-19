package io.bigtotoro;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _376_Test {

    private static final _376.Solution1 SOLUTION_1 = new _376.Solution1();

    @Test
    public void test11() {
        assertThat(SOLUTION_1.wiggleMaxLength(new int[] {1, 7, 4, 9, 2, 5})).isEqualTo(6);
    }

    @Test
    public void test12() {
        assertThat(SOLUTION_1.wiggleMaxLength(new int[] {1, 17, 5, 10, 13, 15, 10, 5, 16, 8})).isEqualTo(7);
    }

    @Test
    public void test13() {
        assertThat(SOLUTION_1.wiggleMaxLength(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9})).isEqualTo(2);
    }

    @Test
    public void test14() {
        assertThat(SOLUTION_1.wiggleMaxLength(new int[] {0, 0, 0})).isEqualTo(1);
    }
}
