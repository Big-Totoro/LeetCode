package io.bigtotoro;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _9_Test {

    private static final _9.Solution1 SOLUTION_1 = new _9.Solution1();

    @Test
    public void test11() {
        assertThat(SOLUTION_1.isPalindrome(121)).isTrue();
    }

    @Test
    public void test12() {
        assertThat(SOLUTION_1.isPalindrome(-121)).isFalse();
    }

    @Test
    public void test13() {
        assertThat(SOLUTION_1.isPalindrome(10)).isFalse();
    }

    @Test
    public void test14() {
        assertThat(SOLUTION_1.isPalindrome(-101)).isFalse();
    }
}
