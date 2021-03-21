package io.bigtotoro;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _869_Test {

    private static final _869.Solution1 SOLUTION_1 = new _869.Solution1();

    @Test
    public void test11() {
        assertThat(SOLUTION_1.reorderedPowerOf2(1)).isTrue();
    }

    @Test
    public void test12() {
        assertThat(SOLUTION_1.reorderedPowerOf2(10)).isFalse();
    }

    @Test
    public void test13() {
        assertThat(SOLUTION_1.reorderedPowerOf2(16)).isTrue();
    }

    @Test
    public void test14() {
        assertThat(SOLUTION_1.reorderedPowerOf2(24)).isFalse();
    }

    @Test
    public void test15() {
        assertThat(SOLUTION_1.reorderedPowerOf2(46)).isTrue();
    }
}
