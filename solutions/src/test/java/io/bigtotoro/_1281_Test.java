package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _1281_Test {

    private static _1281.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1281.Solution1();
    }

    @Test
    public void test1() {
        assertThat(solution1.subtractProductAndSum(234))
                .isEqualTo(15);
    }

    @Test
    public void test2() {
        assertThat(solution1.subtractProductAndSum(4421))
                .isEqualTo(21);
    }
}
