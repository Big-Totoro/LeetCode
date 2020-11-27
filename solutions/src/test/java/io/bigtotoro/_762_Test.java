package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _762_Test {

    private static _762.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _762.Solution1();
    }

    @Test
    public void test11() {
        assertThat(solution1.countPrimeSetBits(6, 10)).isEqualTo(4);
    }

    @Test
    public void test12() {
        assertThat(solution1.countPrimeSetBits(10, 15)).isEqualTo(5);
    }
}
