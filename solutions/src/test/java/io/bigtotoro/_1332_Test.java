package io.bigtotoro;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _1332_Test {

    private static final _1332.Solution1 SOLUTION_1 = new _1332.Solution1();

    @Test
    public void test11() {
        assertThat(SOLUTION_1.removePalindromeSub("ababa")).isEqualTo(1);
    }

    @Test
    public void test12() {
        assertThat(SOLUTION_1.removePalindromeSub("abb")).isEqualTo(2);
    }

    @Test
    public void test13() {
        assertThat(SOLUTION_1.removePalindromeSub("baabb")).isEqualTo(2);
    }

    @Test
    public void test14() {
        assertThat(SOLUTION_1.removePalindromeSub("")).isEqualTo(0);
    }
}
