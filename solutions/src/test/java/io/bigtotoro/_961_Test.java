package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _961_Test {

    private static _961.Solution1 solution1;
    private static _961.Solution2 solution2;

    @BeforeClass
    public static void setup() {
        solution1 = new _961.Solution1();
        solution2 = new _961.Solution2();
    }

    @Test
    public void test11() {
        assertThat(solution1.repeatedNTimes(new int[] {1, 2, 3, 3})).isEqualTo(3);
    }

    @Test
    public void test12() {
        assertThat(solution1.repeatedNTimes(new int[] {2, 1, 2, 5, 3, 2})).isEqualTo(2);
    }

    @Test
    public void test13() {
        assertThat(solution2.repeatedNTimes(new int[] {5, 1, 5, 2, 5, 3, 5, 4})).isEqualTo(5);
    }

    @Test
    public void test21() {
        assertThat(solution2.repeatedNTimes(new int[] {1, 2, 3, 3})).isEqualTo(3);
    }

    @Test
    public void test22() {
        assertThat(solution2.repeatedNTimes(new int[] {2, 1, 2, 5, 3, 2})).isEqualTo(2);
    }

    @Test
    public void test23() {
        assertThat(solution2.repeatedNTimes(new int[] {5, 1, 5, 2, 5, 3, 5, 4})).isEqualTo(5);
    }

}
