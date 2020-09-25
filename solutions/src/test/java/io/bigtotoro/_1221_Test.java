package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _1221_Test {
    private static _1221.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1221.Solution1();
    }

    @Test
    public void test1() {
        assertThat(solution1.balancedStringSplit("RLRRLLRLRL")).isEqualTo(4);
    }

    @Test
    public void test2() {
        assertThat(solution1.balancedStringSplit("RLLLLRRRLR")).isEqualTo(3);
    }

    @Test
    public void test3() {
        assertThat(solution1.balancedStringSplit("LLLLRRRR")).isEqualTo(1);
    }

    @Test
    public void test4() {
        assertThat(solution1.balancedStringSplit("RLRRRLLRLL")).isEqualTo(2);
    }
}
