package io.bigtotoro;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _387_Test {

    private static final _387.Solution1 SOLUTION_1 = new _387.Solution1();

    @Test
    public void test11() {
        assertThat(SOLUTION_1.firstUniqChar("leetcode")).isEqualTo(0);
    }

    @Test
    public void test12() {
        assertThat(SOLUTION_1.firstUniqChar("loveleetcode")).isEqualTo(2);
    }

    @Test
    public void test13() {
        assertThat(SOLUTION_1.firstUniqChar("")).isEqualTo(-1);
    }

    @Test
    public void test14() {
        assertThat(SOLUTION_1.firstUniqChar("aa")).isEqualTo(-1);
    }
}
