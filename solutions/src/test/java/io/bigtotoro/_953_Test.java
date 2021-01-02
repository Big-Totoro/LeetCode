package io.bigtotoro;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _953_Test {

    private static final _953.Solution1 SOLUTION_1 = new _953.Solution1();

    @Test
    public void test11() {
        assertThat(SOLUTION_1.isAlienSorted(new String[]{"hello", "leetcode"}, "hlabcdefgijkmnopqrstuvwxyz"))
            .isTrue();
    }

    @Test
    public void test12() {
        assertThat(SOLUTION_1.isAlienSorted(new String[]{"word", "world", "row"}, "worldabcefghijkmnpqstuvxyz"))
            .isFalse();
    }

    @Test
    public void test13() {
        assertThat(SOLUTION_1.isAlienSorted(new String[]{"apple", "app"}, "abcdefghijklmnopqrstuvwxyz"))
            .isFalse();
    }

    @Test
    public void test14() {
        assertThat(SOLUTION_1.isAlienSorted(new String[]{"fxasxpc", "dfbdrifhp", "nwzgs", "cmwqriv", "ebulyfyve",
                "miracx", "sxckdwzv", "dtijzluhts", "wwbmnge", "qmjwymmyox"}, "zkgwaverfimqxbnctdplsjyohu"))
            .isFalse();
    }

    @Test
    public void test15() {
        assertThat(SOLUTION_1.isAlienSorted(new String[]{"kuvp", "q"}, "ngxlkthsjuoqcpavbfdermiywz"))
            .isTrue();
    }
}
