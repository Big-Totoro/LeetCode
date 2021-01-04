package io.bigtotoro;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _567_Test {

    private static final _567.Solution1 SOLUTION_1 = new _567.Solution1();

    @Test
    public void test11() {
        assertThat(SOLUTION_1.checkInclusion("ab", "eidbaooo")).isTrue();
    }

    @Test
    public void test12() {
        assertThat(SOLUTION_1.checkInclusion("ab", "eidboaoo")).isFalse();
    }

    @Test
    public void test13() {
        assertThat(SOLUTION_1.checkInclusion("adc", "dcda")).isTrue();
    }
}
