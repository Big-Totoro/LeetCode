package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _1365_Test {

    private static _1365.Solution1 solution1;
    private static _1365.Solution2 solution2;

    @BeforeClass
    public static void setup() {
        solution1 = new _1365.Solution1();
        solution2 = new _1365.Solution2();
    }

    @Test
    public void test11() {
        assertThat(solution1.smallerNumbersThanCurrent(new int[] {8, 1, 2, 2, 3})).isEqualTo(new int[] {4, 0, 1, 1, 3});
    }

    @Test
    public void test12() {
        assertThat(solution1.smallerNumbersThanCurrent(new int[] {6, 5, 4, 8})).isEqualTo(new int[] {2, 1, 0, 3});
    }

    @Test
    public void test13() {
        assertThat(solution1.smallerNumbersThanCurrent(new int[] {7, 7, 7, 7})).isEqualTo(new int[] {0, 0, 0, 0});
    }

    @Test
    public void test21() {
        assertThat(solution2.smallerNumbersThanCurrent(new int[] {8, 1, 2, 2, 3})).isEqualTo(new int[] {4, 0, 1, 1, 3});
    }

    @Test
    public void test22() {
        assertThat(solution2.smallerNumbersThanCurrent(new int[] {6, 5, 4, 8})).isEqualTo(new int[] {2, 1, 0, 3});
    }

    @Test
    public void test23() {
        assertThat(solution2.smallerNumbersThanCurrent(new int[] {7, 7, 7, 7})).isEqualTo(new int[] {0, 0, 0, 0});
    }

    @Test
    public void test24() {
        assertThat(solution2.smallerNumbersThanCurrent(new int[] {5, 0, 10, 0, 10, 6})).isEqualTo(new int[] {2, 0, 4, 0, 4, 3});
    }
}
