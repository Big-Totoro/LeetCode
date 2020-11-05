package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _682_Test {

    private static _682.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _682.Solution1();
    }

    @Test
    public void test11() {
        assertThat(solution1.calPoints(new String[] {"5", "2", "C", "D", "+"})).isEqualTo(30);
    }

    @Test
    public void test12() {
        assertThat(solution1.calPoints(new String[] {"5", "-2", "4", "C", "D", "9", "+", "+"})).isEqualTo(27);
    }

    @Test
    public void test13() {
        assertThat(solution1.calPoints(new String[] {"1"})).isEqualTo(1);
    }
}