package io.bigtotoro;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _820_Test {

    private static final _820.Solution1 SOLUTION_1 = new _820.Solution1();

    @Test
    public void test11() {
        assertThat(SOLUTION_1.minimumLengthEncoding(new String[]{"time", "me", "bell"})).isEqualTo(10);
    }

    @Test
    public void test12() {
        assertThat(SOLUTION_1.minimumLengthEncoding(new String[]{"t"})).isEqualTo(2);
    }
}
