package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class _739_Test {
    private static _739.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _739.Solution1();
    }

    @Test
    public void test11() {
        assertThat(solution1.dailyTemperatures(new int[] { 73,74,75,71,69,72,76,73 }))
                .isEqualTo(new int[] { 1, 1, 4, 2, 1, 1, 0, 0 });
    }

    @Test
    public void test12() {
        assertThat(solution1.dailyTemperatures(new int[] { 30, 40, 50, 60 }))
                .isEqualTo(new int[] { 1, 1, 1, 0 });
    }

    @Test
    public void test13() {
        assertThat(solution1.dailyTemperatures(new int[] { 30, 60, 90 }))
                .isEqualTo(new int[] { 1, 1, 0 });
    }
}
