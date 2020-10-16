package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _349_Test {

    private static _349.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _349.Solution1();
    }

    @Test
    public void test11() {
        assertThat(solution1.intersection(new int[] {1, 2, 2, 1}, new int[] {2, 2})).isEqualTo(new int[] {2});
    }

    @Test
    public void test12() {
        assertThat(solution1.intersection(new int[] {4, 9, 5}, new int[] {9, 4, 9, 8, 4})).isEqualTo(new int[] {9, 4});
    }

    @Test
    public void test13() {
        assertThat(solution1.intersection(new int[] {}, new int[] {1, 1})).isEqualTo(new int[] {});
    }

    @Test
    public void test14() {
        assertThat(solution1.intersection(new int[] {1}, new int[] {1})).isEqualTo(new int[] {1});
    }
}