package io.bigtotoro;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _856_Test {

    private static final _856.Solution1 SOLUTION_1 = new _856.Solution1();

    @Test
    public void test11() {
        assertThat(SOLUTION_1.scoreOfParentheses("()")).isEqualTo(1);
    }

    @Test
    public void test12() {
        assertThat(SOLUTION_1.scoreOfParentheses("(())")).isEqualTo(2);
    }

    @Test
    public void test13() {
        assertThat(SOLUTION_1.scoreOfParentheses("()()")).isEqualTo(2);
    }

    @Test
    public void test14() {
        assertThat(SOLUTION_1.scoreOfParentheses("(()(()))")).isEqualTo(6);
    }
}
