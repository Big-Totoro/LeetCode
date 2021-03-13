package io.bigtotoro;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _1461_Test {

    private static final _1461.Solution1 SOLUTION_1 = new _1461.Solution1();

    @Test
    public void test11() {
        assertThat(SOLUTION_1.hasAllCodes("00110110", 2)).isTrue();
    }

    @Test
    public void test12() {
        assertThat(SOLUTION_1.hasAllCodes("00110", 2)).isTrue();
    }

    @Test
    public void test13() {
        assertThat(SOLUTION_1.hasAllCodes("00110", 1)).isTrue();
    }

    @Test
    public void test14() {
        assertThat(SOLUTION_1.hasAllCodes("0110", 2)).isFalse();
    }

    @Test
    public void test15() {
        assertThat(SOLUTION_1.hasAllCodes("0000000001011100", 4)).isFalse();
    }
}
