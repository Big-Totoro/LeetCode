package io.bigtotoro;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _71_Test {

    private static final _71.Solution1 SOLUTION_1 = new _71.Solution1();

    @Test
    public void test11() {
        assertThat(SOLUTION_1.simplifyPath("/home/")).isEqualTo("/home");
    }

    @Test
    public void test12() {
        assertThat(SOLUTION_1.simplifyPath("/../")).isEqualTo("/");
    }

    @Test
    public void test13() {
        assertThat(SOLUTION_1.simplifyPath("/home//foo/")).isEqualTo("/home/foo");
    }

    @Test
    public void test14() {
        assertThat(SOLUTION_1.simplifyPath("/a/./b/../../c/")).isEqualTo("/c");
    }
}
