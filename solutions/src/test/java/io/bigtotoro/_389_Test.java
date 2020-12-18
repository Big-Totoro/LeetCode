package io.bigtotoro;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _389_Test {

    private static _389.Solution1 solution1 = new _389.Solution1();

    @Test
    public void test11() {
        assertThat(solution1.findTheDifference("abcd", "abcde")).isEqualTo('e');
    }

    @Test
    public void test12() {
        assertThat(solution1.findTheDifference("", "y")).isEqualTo('y');
    }

    @Test
    public void test13() {
        assertThat(solution1.findTheDifference("a", "aa")).isEqualTo('a');
    }

    @Test
    public void test14() {
        assertThat(solution1.findTheDifference("ae", "aea")).isEqualTo('a');
    }
}
