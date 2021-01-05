package io.bigtotoro;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _268_Test {

    private static final _268.Solution1 SOLUTION_1 = new _268.Solution1();
    private static final _268.Solution2 SOLUTION_2 = new _268.Solution2();

    @Test
    public void test11() {
        assertThat(SOLUTION_1.missingNumber(new int[] {3, 0, 1})).isEqualTo(2);
        assertThat(SOLUTION_2.missingNumber(new int[] {3, 0, 1})).isEqualTo(2);
    }

    @Test
    public void test12() {
        assertThat(SOLUTION_1.missingNumber(new int[] {0, 1})).isEqualTo(2);
        assertThat(SOLUTION_2.missingNumber(new int[] {0, 1})).isEqualTo(2);
    }

    @Test
    public void test13() {
        assertThat(SOLUTION_1.missingNumber(new int[] {9, 6, 4, 2, 3, 5, 7, 0, 1})).isEqualTo(8);
        assertThat(SOLUTION_2.missingNumber(new int[] {9, 6, 4, 2, 3, 5, 7, 0, 1})).isEqualTo(8);
    }

    @Test
    public void test14() {
        assertThat(SOLUTION_1.missingNumber(new int[] {0})).isEqualTo(1);
        assertThat(SOLUTION_2.missingNumber(new int[] {0})).isEqualTo(1);
    }
}
