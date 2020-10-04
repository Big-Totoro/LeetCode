package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _1021_Test {

    private static _1021.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1021.Solution1();
    }

    @Test
    public void test11() {
        assertThat(solution1.removeOuterParentheses("(()())(())")).isEqualTo("()()()");
    }

    @Test
    public void test12() {
        assertThat(solution1.removeOuterParentheses("(()())(())(()(()))")).isEqualTo("()()()()(())");
    }

    @Test
    public void test13() {
        assertThat(solution1.removeOuterParentheses("()()")).isEqualTo("");
    }
}
