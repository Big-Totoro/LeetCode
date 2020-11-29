package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _167_Test {

    private static _167.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _167.Solution1();
    }

    @Test
    public void test11() {
        assertThat(solution1.twoSum(new int[] {2, 7, 11, 15}, 9)).isEqualTo(new int[] {1, 2});
    }

    @Test
    public void test12() {
        assertThat(solution1.twoSum(new int[] {2, 3, 4}, 6)).isEqualTo(new int[] {1, 3});
    }

    @Test
    public void test13() {
        assertThat(solution1.twoSum(new int[] {-1, 0}, -1)).isEqualTo(new int[] {1, 2});
    }
}
