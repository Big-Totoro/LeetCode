package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _171_Test {

    private static _171.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _171.Solution1();
    }

    @Test
    public void test11() {
        assertThat(solution1.titleToNumber("A"))
                .isEqualTo(1);
    }

    @Test
    public void test12() {
        assertThat(solution1.titleToNumber("AB"))
                .isEqualTo(28);
    }

    @Test
    public void test13() {
        assertThat(solution1.titleToNumber("ZY"))
                .isEqualTo(701);
    }
}