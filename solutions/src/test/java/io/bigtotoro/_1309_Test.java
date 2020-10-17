package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _1309_Test {

    private static _1309.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1309.Solution1();
    }

    @Test
    public void test11() {
        assertThat(solution1.freqAlphabets("10#11#12")).isEqualTo("jkab");
    }

    @Test
    public void test12() {
        assertThat(solution1.freqAlphabets("1326#")).isEqualTo("acz");
    }
}