package io.bigtotoro;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _796_Test {

    private static final _796.Solution1 SOLUTION_1 = new _796.Solution1();

    @Test
    public void test11() {
        assertThat(SOLUTION_1.rotateString("abcde", "cdeab")).isTrue();
    }

    @Test
    public void test12() {
        assertThat(SOLUTION_1.rotateString("abcde", "abced")).isFalse();
    }
}
