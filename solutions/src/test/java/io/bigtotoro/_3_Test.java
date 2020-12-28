package io.bigtotoro;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _3_Test {

    private static final _3.Solution1 SOLUTION_1 = new _3.Solution1();

    @Test
    public void test11() {
        assertThat(SOLUTION_1.lengthOfLongestSubstring("abcabcbb")).isEqualTo(3);
    }

    @Test
    public void test12() {
        assertThat(SOLUTION_1.lengthOfLongestSubstring("bbbbb")).isEqualTo(1);
    }

    @Test
    public void test13() {
        assertThat(SOLUTION_1.lengthOfLongestSubstring("pwwkew")).isEqualTo(3);
    }

    @Test
    public void test14() {
        assertThat(SOLUTION_1.lengthOfLongestSubstring("")).isEqualTo(0);
    }
}
