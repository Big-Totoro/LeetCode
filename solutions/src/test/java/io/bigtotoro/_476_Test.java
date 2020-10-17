package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _476_Test {

    private static _476.Solution1 solution1;
    private static _476.Solution2 solution2;
    private static _476.Solution3 solution3;

    @BeforeClass
    public static void setup() {
        solution1 = new _476.Solution1();
        solution2 = new _476.Solution2();
        solution3 = new _476.Solution3();
    }

    @Test
    public void test11() {
        assertThat(solution1.findComplement(5)).isEqualTo(2);
        assertThat(solution2.findComplement(5)).isEqualTo(2);
        assertThat(solution3.findComplement(5)).isEqualTo(2);
    }

    @Test
    public void test12() {
        assertThat(solution1.findComplement(1)).isEqualTo(0);
        assertThat(solution2.findComplement(1)).isEqualTo(0);
        assertThat(solution3.findComplement(1)).isEqualTo(0);
    }

    @Test
    public void test13() {
        assertThat(solution1.findComplement(870)).isEqualTo(153);
        assertThat(solution2.findComplement(870)).isEqualTo(153);
        assertThat(solution3.findComplement(870)).isEqualTo(153);
    }
}
