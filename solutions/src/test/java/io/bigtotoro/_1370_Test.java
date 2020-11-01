package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _1370_Test {

    private static _1370.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1370.Solution1();
    }

    @Test
    public void test11() {
        assertThat(solution1.sortString("aaaabbbbcccc")).isEqualTo("abccbaabccba");
    }

    @Test
    public void test12() {
        assertThat(solution1.sortString("rat")).isEqualTo("art");
    }

    @Test
    public void test13() {
        assertThat(solution1.sortString("leetcode")).isEqualTo("cdelotee");
    }

    @Test
    public void test14() {
        assertThat(solution1.sortString("ggggggg")).isEqualTo("ggggggg");
    }

    @Test
    public void test15() {
        assertThat(solution1.sortString("spo")).isEqualTo("ops");
    }
}