package io.bigtotoro;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _125_Test {

    private _125.Solution1 solution1 = new _125.Solution1();

    @Test
    public void test11() {
        assertThat(solution1.isPalindrome("A man, a plan, a canal: Panama")).isTrue();
    }

    @Test
    public void test12() {
        assertThat(solution1.isPalindrome("race a car")).isFalse();
    }

    @Test
    public void test13() {
        assertThat(solution1.isPalindrome(" ")).isTrue();
    }
}
