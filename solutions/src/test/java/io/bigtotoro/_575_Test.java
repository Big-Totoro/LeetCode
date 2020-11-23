package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _575_Test {

    private static _575.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _575.Solution1();
    }

    @Test
    public void test11() {
        assertThat(solution1.distributeCandies(new int[] {1, 1, 2, 2, 3, 3}))
                .isEqualTo(3);
    }

    @Test
    public void test12() {
        assertThat(solution1.distributeCandies(new int[] {1, 1, 2, 3}))
                .isEqualTo(2);
    }

    @Test
    public void test13() {
        assertThat(solution1.distributeCandies(new int[] {6, 6, 6, 6}))
                .isEqualTo(1);
    }

    @Test
    public void test14() {
        assertThat(solution1.distributeCandies(new int[] {1, 11}))
                .isEqualTo(1);
    }
}
