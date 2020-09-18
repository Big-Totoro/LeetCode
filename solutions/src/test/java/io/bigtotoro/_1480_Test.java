package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _1480_Test {

    private static _1480.Solution1 solution1;
    private static _1480.Solution2 solution2;

    @BeforeClass
    public static void setup() {
        solution1 = new _1480.Solution1();
        solution2 = new _1480.Solution2();
    }

    @Test
    public void test11() {
        assertThat(solution1.runningSum(new int[] {1,2,3,4}).equals(new int[] {1,3,6,10}));
    }

    @Test
    public void test12() {
        assertThat(solution1.runningSum(new int[] {1,1,1,1,1} ).equals(new int[] {1,2,3,4,5}));
    }

    @Test
    public void test13() {
        assertThat(solution1.runningSum(new int[] {3,1,2,10,1} ).equals(new int[] {3,4,6,16,17}));
    }

    @Test
    public void test21() {
        assertThat(solution2.runningSum(new int[] {1,2,3,4}).equals(new int[] {1,3,6,10}));
    }

    @Test
    public void test22() {
        assertThat(solution2.runningSum(new int[] {1,1,1,1,1} ).equals(new int[] {1,2,3,4,5}));
    }

    @Test
    public void test23() {
        assertThat(solution2.runningSum(new int[] {3,1,2,10,1} ).equals(new int[] {3,4,6,16,17}));
    }
}
