package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _1486_Test {

    private static _1486.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1486.Solution1();
    }

    @Test
    public void test11() {
        assertThat(solution1.xorOperation(5, 0)).isEqualTo(8);
    }

    @Test
    public void test12() {
        assertThat(solution1.xorOperation(4, 3)).isEqualTo(8);
    }

    @Test
    public void test13() {
        assertThat(solution1.xorOperation(1, 7)).isEqualTo(7);
    }

    @Test
    public void test14() {
        assertThat(solution1.xorOperation(10, 5)).isEqualTo(2);
    }

}
