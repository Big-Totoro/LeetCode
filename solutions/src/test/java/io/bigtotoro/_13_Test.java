package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _13_Test {

    private static _13.Solution1 solution1;
    private static _13.Solution2 solution2;

    @BeforeClass
    public static void setup() {
        solution1 = new _13.Solution1();
        solution2 = new _13.Solution2();
    }

    @Test
    public void test11() {
        assertThat(solution1.romanToInt("III")).isEqualTo(3);
    }

    @Test
    public void test12() {
        assertThat(solution1.romanToInt("IV")).isEqualTo(4);
    }

    @Test
    public void test13() {
        assertThat(solution1.romanToInt("IX")).isEqualTo(9);
    }

    @Test
    public void test14() {
        assertThat(solution1.romanToInt("LVIII")).isEqualTo(58);
    }

    @Test
    public void test15() {
        assertThat(solution1.romanToInt("MCMXCIV")).isEqualTo(1994);
    }

    @Test
    public void test16() {
        assertThat(solution1.romanToInt("CMXCIV")).isEqualTo(994);
    }

    @Test
    public void test21() {
        assertThat(solution2.romanToInt("III")).isEqualTo(3);
    }

    @Test
    public void test22() {
        assertThat(solution2.romanToInt("IV")).isEqualTo(4);
    }

    @Test
    public void test23() {
        assertThat(solution2.romanToInt("IX")).isEqualTo(9);
    }

    @Test
    public void test24() {
        assertThat(solution2.romanToInt("LVIII")).isEqualTo(58);
    }

    @Test
    public void test25() {
        assertThat(solution2.romanToInt("MCMXCIV")).isEqualTo(1994);
    }

    @Test
    public void test26() {
        assertThat(solution2.romanToInt("CMXCIV")).isEqualTo(994);
    }
}