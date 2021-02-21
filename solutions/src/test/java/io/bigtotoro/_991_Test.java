package io.bigtotoro;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _991_Test {

    private static final _991.Solution1 SOLUTION_1 = new _991.Solution1();

    @Test
    public void test11() {
        assertThat(SOLUTION_1.brokenCalc(2, 3)).isEqualTo(2);
    }

    @Test
    public void test12() {
        assertThat(SOLUTION_1.brokenCalc(5, 8)).isEqualTo(2);
    }

    @Test
    public void test13() {
        assertThat(SOLUTION_1.brokenCalc(3, 10)).isEqualTo(3);
    }

    @Test
    public void test14() {
        assertThat(SOLUTION_1.brokenCalc(1024, 1)).isEqualTo(1023);
    }
}
