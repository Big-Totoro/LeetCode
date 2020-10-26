package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _1464_Test {

    private static _1464.Solution1 solution1;
    private static _1464.Solution2 solution2;

    @BeforeClass
    public static void setup() {
        solution1 = new _1464.Solution1();
        solution2 = new _1464.Solution2();
    }

    @Test
    public void test11() {
        assertThat(solution1.maxProduct(new int[] { 3, 4, 5, 2 }))
                .isEqualTo(12);
    }

    @Test
    public void test12() {
        assertThat(solution1.maxProduct(new int[] { 1, 5, 4, 5 }))
                .isEqualTo(16);
    }

    @Test
    public void test13() {
        assertThat(solution1.maxProduct(new int[] { 3, 7 }))
                .isEqualTo(12);
    }

    @Test
    public void test21() {
        assertThat(solution2.maxProduct(new int[] { 3, 4, 5, 2 }))
                .isEqualTo(12);
    }

    @Test
    public void test22() {
        assertThat(solution2.maxProduct(new int[] { 1, 5, 4, 5 }))
                .isEqualTo(16);
    }

    @Test
    public void test23() {
        assertThat(solution2.maxProduct(new int[] { 3, 7 }))
                .isEqualTo(12);
    }

    @Test
    public void test24() {
        assertThat(solution2.maxProduct(new int[] { 10, 2, 5, 2 }))
                .isEqualTo(36);
    }
}