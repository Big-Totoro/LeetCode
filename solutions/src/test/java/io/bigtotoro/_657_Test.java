package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _657_Test {

    private static _657.Solution1 solution1;
    private static _657.Solution2 solution2;

    @BeforeClass
    public static void setup() {
        solution1 = new _657.Solution1();
        solution2 = new _657.Solution2();
    }

    @Test
    public void test11() {
        assertThat(solution1.judgeCircle("UD")).isEqualTo(true);
    }

    @Test
    public void test12() {
        assertThat(solution1.judgeCircle("LL")).isEqualTo(false);
    }

    @Test
    public void test13() {
        assertThat(solution1.judgeCircle("RRDD")).isEqualTo(false);
    }

    @Test
    public void test14() {
        assertThat(solution1.judgeCircle("LDRRLRUULR")).isEqualTo(false);
    }

    @Test
    public void test21() {
        assertThat(solution2.judgeCircle("UD")).isEqualTo(true);
    }

    @Test
    public void test22() {
        assertThat(solution2.judgeCircle("LL")).isEqualTo(false);
    }

    @Test
    public void test23() {
        assertThat(solution2.judgeCircle("RRDD")).isEqualTo(false);
    }

    @Test
    public void test24() {
        assertThat(solution2.judgeCircle("LDRRLRUULR")).isEqualTo(false);
    }
}
