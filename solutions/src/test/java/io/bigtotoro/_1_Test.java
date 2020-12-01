package io.bigtotoro;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _1_Test {

    private static _1.Solution1 solution1 = new _1.Solution1();

    @Test
    public void test11() {
        assertThat(solution1.twoSum(new int[] {2, 7, 11, 15}, 9)).isEqualTo(new int[] {0, 1});
    }

    @Test
    public void test12() {
        assertThat(solution1.twoSum(new int[] {3, 2, 4}, 6)).isEqualTo(new int[] {1, 2});
    }

    @Test
    public void test13() {
        assertThat(solution1.twoSum(new int[] {3, 3}, 6)).isEqualTo(new int[] {0, 1});
    }
}
