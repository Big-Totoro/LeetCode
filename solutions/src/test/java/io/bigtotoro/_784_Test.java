package io.bigtotoro;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _784_Test {

    private static final _784.Solution1 SOLUTION_1 = new _784.Solution1();

    @Test
    public void test11() {
        assertThat(SOLUTION_1.letterCasePermutation("a1b2"))
                .containsExactlyInAnyOrder("a1b2", "a1B2", "A1b2", "A1B2");
    }

    @Test
    public void test12() {
        assertThat(SOLUTION_1.letterCasePermutation("3z4"))
                .containsExactlyInAnyOrder("3z4", "3Z4");
    }

    @Test
    public void test13() {
        assertThat(SOLUTION_1.letterCasePermutation("12345"))
                .containsExactlyInAnyOrder("12345");
    }

    @Test
    public void test14() {
        assertThat(SOLUTION_1.letterCasePermutation("0"))
                .containsExactlyInAnyOrder("0");
    }
}
