package io.bigtotoro;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _22_Test {

    private _22.Solution1 solution1 = new _22.Solution1();

    @Test
    public void test11() {
        assertThat(solution1.generateParenthesis(3))
            .containsExactlyInAnyOrder("((()))", "(()())", "(())()", "()(())", "()()()");
    }

    @Test
    public void test12() {
        assertThat(solution1.generateParenthesis(1))
            .containsExactlyInAnyOrder("()");
    }
}
