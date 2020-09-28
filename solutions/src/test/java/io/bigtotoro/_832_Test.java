package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _832_Test {

    private static _832.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _832.Solution1();
    }

    @Test
    public void test1() {
        assertThat(solution1.flipAndInvertImage(new int[][] {
                {1, 1, 0},
                {1, 0, 1},
                {0, 0, 0}
        })).isEqualTo(new int[][] {
                {1, 0, 0},
                {0, 1, 0},
                {1, 1, 1}
        });
    }

    @Test
    public void test2() {
        assertThat(solution1.flipAndInvertImage(new int[][] {
                {1, 1, 0, 0},
                {1, 0, 0, 1},
                {0, 1, 1, 1},
                {1, 0, 1, 0}
        })).isEqualTo(new int[][] {
                {1, 1, 0, 0},
                {0, 1, 1, 0},
                {0, 0, 0, 1},
                {1, 0, 1, 0}
        });
    }
}
