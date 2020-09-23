package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _1342_Test {

    private static _1342.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1342.Solution1();
    }

    @Test
    public void test1() {
        assertThat(solution1.numberOfSteps(14))
                .isEqualTo(6);
    }

    @Test
    public void test2() {
        assertThat(solution1.numberOfSteps(8))
                .isEqualTo(4);
    }

    @Test
    public void test3() {
        assertThat(solution1.numberOfSteps(123))
                .isEqualTo(12);
    }
}