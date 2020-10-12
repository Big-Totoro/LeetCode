package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _852_Test {

    private static _852.Solution1 solution1;
    private static _852.Solution2 solution2;

    @BeforeClass
    public static void setup() {
        solution1 = new _852.Solution1();
        solution2 = new _852.Solution2();
    }

    @Test
    public void test11() {
        assertThat(solution1.peakIndexInMountainArray(new int[] {0, 1, 0})).isEqualTo(1);
    }

    @Test
    public void test12() {
        assertThat(solution1.peakIndexInMountainArray(new int[] {0, 2, 1, 0})).isEqualTo(1);
    }

    @Test
    public void test13() {
        assertThat(solution1.peakIndexInMountainArray(new int[] {0, 10, 5, 2})).isEqualTo(1);
    }

    @Test
    public void test14() {
        assertThat(solution1.peakIndexInMountainArray(new int[] {3, 4, 5, 1})).isEqualTo(2);
    }

    @Test
    public void test15() {
        assertThat(solution1.peakIndexInMountainArray(new int[] {24, 69, 100, 99, 79, 78, 67, 36, 26, 19})).isEqualTo(2);
    }

    @Test
    public void test21() {
        assertThat(solution2.peakIndexInMountainArray(new int[] {0, 1, 0})).isEqualTo(1);
    }

    @Test
    public void test22() {
        assertThat(solution2.peakIndexInMountainArray(new int[] {0, 2, 1, 0})).isEqualTo(1);
    }

    @Test
    public void test23() {
        assertThat(solution2.peakIndexInMountainArray(new int[] {0, 10, 5, 2})).isEqualTo(1);
    }

    @Test
    public void test24() {
        assertThat(solution2.peakIndexInMountainArray(new int[] {3, 4, 5, 1})).isEqualTo(2);
    }

    @Test
    public void test25() {
        assertThat(solution2.peakIndexInMountainArray(new int[] {24, 69, 100, 99, 79, 78, 67, 36, 26, 19})).isEqualTo(2);
    }
}
