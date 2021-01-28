package io.bigtotoro;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _1663_Test {

    private static final _1663.Solution1 SOLUTION_1 = new _1663.Solution1();

    @Test
    public void test11() {
        assertThat(SOLUTION_1.getSmallestString(3, 27)).isEqualTo("aay");
    }

    @Test
    public void test12() {
        assertThat(SOLUTION_1.getSmallestString(5, 73)).isEqualTo("aaszz");
    }
}
