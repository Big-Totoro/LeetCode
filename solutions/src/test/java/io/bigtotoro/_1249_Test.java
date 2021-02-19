package io.bigtotoro;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _1249_Test {

    private static final _1249.Solution1 SOLUTION_1 = new _1249.Solution1();

    @Test
    public void test11() {
        assertThat(SOLUTION_1.minRemoveToMakeValid("lee(t(c)o)de)")).isEqualTo("lee(t(c)o)de");
    }

    @Test
    public void test12() {
        assertThat(SOLUTION_1.minRemoveToMakeValid("a)b(c)d")).isEqualTo("ab(c)d");
    }

    @Test
    public void test13() {
        assertThat(SOLUTION_1.minRemoveToMakeValid("))((")).isEqualTo("");
    }

    @Test
    public void test14() {
        assertThat(SOLUTION_1.minRemoveToMakeValid("(a(b(c)d)")).isEqualTo("a(b(c)d)");
    }
}
