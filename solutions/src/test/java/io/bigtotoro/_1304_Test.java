package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class _1304_Test {

    private static _1304.Solution1 solution1;
    private static _1304.Solution2 solution2;

    @BeforeClass
    public static void setup() {
        solution1 = new _1304.Solution1();
        solution2 = new _1304.Solution2();
    }

    @Test
    public void test11() {
        assertThat(Arrays.stream(solution1.sumZero(5)).sum()).isEqualTo(0);
        assertThat(Arrays.stream(solution2.sumZero(5)).sum()).isEqualTo(0);
    }

    @Test
    public void test12() {
        assertThat(Arrays.stream(solution1.sumZero(3)).sum()).isEqualTo(0);
        assertThat(Arrays.stream(solution2.sumZero(3)).sum()).isEqualTo(0);
    }

    @Test
    public void test13() {
        assertThat(Arrays.stream(solution1.sumZero(1)).sum()).isEqualTo(0);
        assertThat(Arrays.stream(solution2.sumZero(1)).sum()).isEqualTo(0);
    }

    @Test
    public void test14() {
        assertThat(Arrays.stream(solution1.sumZero(4)).sum()).isEqualTo(0);
        assertThat(Arrays.stream(solution2.sumZero(4)).sum()).isEqualTo(0);
    }
}
