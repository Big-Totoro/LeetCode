package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _1207_Test {

    private static _1207.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1207.Solution1();
    }

    @Test
    public void test11() {
        assertThat(solution1.uniqueOccurrences(new int[] {1, 2, 2,  1, 1, 3})).isEqualTo(true);
    }

    @Test
    public void test12() {
        assertThat(solution1.uniqueOccurrences(new int[] {1, 2})).isEqualTo(false);
    }

    @Test
    public void test13() {
        assertThat(solution1.uniqueOccurrences(new int[] {-3, 0, 1, -3, 1, 1, 1, -3, 10, 0})).isEqualTo(true);
    }
}
