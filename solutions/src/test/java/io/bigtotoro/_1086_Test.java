package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _1086_Test {

    private static _1086.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1086.Solution1();
    }

    @Test
    public void test1() {
        assertThat(solution1.highFive(new int[][] {
                {1, 91},
                {1, 92},
                {2, 93},
                {2, 97},
                {1, 60},
                {2, 77},
                {1, 65},
                {1, 87},
                {1, 100},
                {2, 100},
                {2,76}
        })).isEqualTo(new int[][] {
                {1, 87},
                {2, 88}
        });
    }
}
