package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _1323_Test {

    private static _1323.Solution1 solution1;
    private static _1323.Solution2 solution2;

    @BeforeClass
    public static void setup() {
        solution1 = new _1323.Solution1();
        solution2 = new _1323.Solution2();
    }

    @Test
    public void test11() {
        assertThat(solution1.maximum69Number(9669)).isEqualTo(9969);
    }

    @Test
    public void test12() {
        assertThat(solution1.maximum69Number(9996)).isEqualTo(9999);
    }

    @Test
    public void test13() {
        assertThat(solution1.maximum69Number(9999)).isEqualTo(9999);
    }

    @Test
    public void test21() {
        assertThat(solution2.maximum69Number(9669)).isEqualTo(9969);
    }

    @Test
    public void test22() {
        assertThat(solution2.maximum69Number(9996)).isEqualTo(9999);
    }

    @Test
    public void test23() {
        assertThat(solution2.maximum69Number(9999)).isEqualTo(9999);
    }
}
