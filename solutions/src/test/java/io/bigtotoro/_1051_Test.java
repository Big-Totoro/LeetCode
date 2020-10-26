package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _1051_Test {

    private static _1051.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1051.Solution1();
    }

    @Test
    public void test11() {
        assertThat(solution1.heightChecker(new int[] { 1, 1, 4, 2, 1, 3 }))
                .isEqualTo(3);
    }

    @Test
    public void test12() {
        assertThat(solution1.heightChecker(new int[] { 5, 1, 2, 3, 4 }))
                .isEqualTo(5);
    }

    @Test
    public void test13() {
        assertThat(solution1.heightChecker(new int[] { 1, 2, 3, 4, 5 }))
                .isEqualTo(0);
    }
}
