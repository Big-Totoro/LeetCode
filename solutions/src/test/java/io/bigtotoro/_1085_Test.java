package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _1085_Test {

    private static _1085.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1085.Solution1();
    }

    @Test
    public void test11() {
        assertThat(solution1.sumOfDigits(new int[] {34, 23, 1, 24, 75, 33, 54, 8})).isEqualTo(0);
    }

    @Test
    public void test12() {
        assertThat(solution1.sumOfDigits(new int[] {99, 77, 33, 66, 55})).isEqualTo(1);
    }

    @Test
    public void test13() {
        assertThat(solution1.sumOfDigits(new int[] {89, 93, 84, 87, 17, 4, 92, 26, 99, 29, 100, 85, 82, 52, 76, 27,
                40, 69, 21, 92, 89, 36})).isEqualTo(1);
    }
}
