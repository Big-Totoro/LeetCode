package io.bigtotoro;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _5_Test {

    private static _5.Solution1 solution1 = new _5.Solution1();

    @Test
    public void test11() {
        assertThat(solution1.longestPalindrome("babad")).isEqualTo("bab");
    }

    @Test
    public void test12() {
        assertThat(solution1.longestPalindrome("cbbd")).isEqualTo("bb");
    }

    @Test
    public void test13() {
        assertThat(solution1.longestPalindrome("a")).isEqualTo("a");
    }

    @Test
    public void test14() {
        assertThat(solution1.longestPalindrome("ac")).isEqualTo("a");
    }
}
