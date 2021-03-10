package io.bigtotoro;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _12_Test {

    private static final _12.Solution1 SOLUTION_1 = new _12.Solution1();

    @Test
    public void test11() {
        assertThat(SOLUTION_1.intToRoman(3)).isEqualTo("III");
    }

    @Test
    public void test12() {
        assertThat(SOLUTION_1.intToRoman(4)).isEqualTo("IV");
    }

    @Test
    public void test13() {
        assertThat(SOLUTION_1.intToRoman(9)).isEqualTo("IX");
    }

    @Test
    public void test14() {
        assertThat(SOLUTION_1.intToRoman(58)).isEqualTo("LVIII");
    }

    @Test
    public void test15() {
        assertThat(SOLUTION_1.intToRoman(1994)).isEqualTo("MCMXCIV");
    }
}
