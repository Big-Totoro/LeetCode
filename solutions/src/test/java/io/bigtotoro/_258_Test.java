package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _258_Test {

    private static _258.Solution1 solution1;
    private static _258.Solution2 solution2;

    @BeforeClass
    public static void setup() {
        solution1 = new _258.Solution1();
        solution2 = new _258.Solution2();
    }

    @Test
    public void test11() {
        assertThat(solution1.addDigits(38)).isEqualTo(2);
    }

    @Test
    public void test21() {
        assertThat(solution2.addDigits(38)).isEqualTo(2);
    }
}