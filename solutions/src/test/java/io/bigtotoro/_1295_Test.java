package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _1295_Test {

    private static _1295.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1295.Solution1();
    }

    @Test
    public void test11() {
        assertThat(solution1.findNumbers(new int[] {12, 345, 2, 6, 7896})).isEqualTo(2);
    }

    @Test
    public void test12() {
        assertThat(solution1.findNumbers(new int[] {555, 901, 482, 1771})).isEqualTo(1);
    }
}
