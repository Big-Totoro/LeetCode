package io.bigtotoro;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _1460_Test {

    private static _1460.Solution1 solution1 = new _1460.Solution1();
    private static _1460.Solution2 solution2 = new _1460.Solution2();

    @Test
    public void test11() {
        assertThat(solution1.canBeEqual(new int[] {1, 2, 3, 4}, new int[] {2, 4, 1, 3})).isEqualTo(true);
        assertThat(solution2.canBeEqual(new int[] {1, 2, 3, 4}, new int[] {2, 4, 1, 3})).isEqualTo(true);
    }

    @Test
    public void test12() {
        assertThat(solution1.canBeEqual(new int[] {1, 12}, new int[] {12, 1})).isEqualTo(true);
        assertThat(solution2.canBeEqual(new int[] {1, 12}, new int[] {12, 1})).isEqualTo(true);
    }

    @Test
    public void test13() {
        assertThat(solution1.canBeEqual(new int[] {7}, new int[] {7})).isEqualTo(true);
        assertThat(solution2.canBeEqual(new int[] {7}, new int[] {7})).isEqualTo(true);
    }

    @Test
    public void test14() {
        assertThat(solution1.canBeEqual(new int[] {3, 7 ,9}, new int[] {3, 7, 11})).isEqualTo(false);
        assertThat(solution2.canBeEqual(new int[] {3, 7 ,9}, new int[] {3, 7, 11})).isEqualTo(false);
    }

    @Test
    public void test15() {
        assertThat(solution1.canBeEqual(new int[] {1, 1, 1, 1, 1}, new int[] {1, 1, 1, 1, 1})).isEqualTo(true);
        assertThat(solution2.canBeEqual(new int[] {1, 1, 1, 1, 1}, new int[] {1, 1, 1, 1, 1})).isEqualTo(true);
    }
}
