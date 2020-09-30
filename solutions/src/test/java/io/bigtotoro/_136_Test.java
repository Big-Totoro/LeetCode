package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _136_Test {

    private static _136.Solution1 solution1;
    private static _136.Solution2 solution2;

    @BeforeClass
    public static void setup() {
        solution1 = new _136.Solution1();
        solution2 = new _136.Solution2();
    }

    @Test
    public void test11() {
        assertThat(solution1.singleNumber(new int[] {2, 2, 1})).isEqualTo(1);
    }

    @Test
    public void test12() {
        assertThat(solution1.singleNumber(new int[] {4, 1, 2, 1, 2})).isEqualTo(4);
    }

    @Test
    public void test21() {
        assertThat(solution2.singleNumber(new int[] {2, 2, 1})).isEqualTo(1);
    }

    @Test
    public void test22() {
        assertThat(solution2.singleNumber(new int[] {4, 1, 2, 1, 2})).isEqualTo(4);
    }
}
