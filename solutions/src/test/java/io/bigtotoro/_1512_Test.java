package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _1512_Test {

    private static _1512.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1512.Solution1();
    }

    @Test
    public void test1() {
        assertThat(solution1.numIdenticalPairs(new int[] {1, 2, 3, 1, 1, 3})).isEqualTo(4);
    }

    @Test
    public void test2() {
        assertThat(solution1.numIdenticalPairs(new int[] {1, 1, 1, 1})).isEqualTo(6);
    }

    @Test
    public void test3() {
        assertThat(solution1.numIdenticalPairs(new int[] {1, 2, 3})).isEqualTo(0);
    }
}