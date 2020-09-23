package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _1470_Test {

    private static _1470.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1470.Solution1();
    }

    @Test
    public void test1() {
        assertThat(solution1.shuffle(new int[] {2, 5, 1, 3, 4, 7}, 3)).isEqualTo(new int[] {2, 3, 5, 4, 1, 7});
    }

    @Test
    public void test2() {
        assertThat(solution1.shuffle(new int[] {1, 2, 3, 4, 4, 3, 2, 1}, 4)).isEqualTo(new int[] {1, 4, 2, 3, 3, 2, 4, 1});
    }

    @Test
    public void test3() {
        assertThat(solution1.shuffle(new int[] {1, 1, 2, 2}, 2)).isEqualTo(new int[] {1, 2, 1, 2});
    }
}
