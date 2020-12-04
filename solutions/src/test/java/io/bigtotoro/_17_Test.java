package io.bigtotoro;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class _17_Test {

    private static _17.Solution1 solution1 = new _17.Solution1();

    @Test
    public void test11() {
        assertThat(solution1.letterCombinations("23"))
            .containsExactlyInAnyOrder("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf");
    }

    @Test
    public void test12() {
        assertThat(solution1.letterCombinations("")).isEqualTo(List.of());
    }

    @Test
    public void test13() {
        assertThat(solution1.letterCombinations("2"))
            .containsExactlyInAnyOrder("a", "b", "c");
    }
}
