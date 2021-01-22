package io.bigtotoro;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _1657_Test {

    private static final _1657.Solution1 SOLUTION_1 = new _1657.Solution1();

    @Test
    public void test11() {
        assertThat(SOLUTION_1.closeStrings("abc", "bca")).isTrue();
    }

    @Test
    public void test12() {
        assertThat(SOLUTION_1.closeStrings("a", "aa")).isFalse();
    }

    @Test
    public void test13() {
        assertThat(SOLUTION_1.closeStrings("cabbba", "abbccc")).isTrue();
    }

    @Test
    public void test14() {
        assertThat(SOLUTION_1.closeStrings("cabbba", "aabbss")).isFalse();
    }
}
