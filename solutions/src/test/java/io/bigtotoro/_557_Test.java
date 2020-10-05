package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _557_Test {

    private static _557.Solution1 solution1;
    private static _557.Solution2 solution2;

    @BeforeClass
    public static void setup() {
        solution1 = new _557.Solution1();
        solution2 = new _557.Solution2();
    }

    @Test
    public void test11() {
        assertThat(solution1.reverseWords("Let's take LeetCode contest")).isEqualTo("s'teL ekat edoCteeL tsetnoc");
    }

    @Test
    public void test12() {
        assertThat(solution2.reverseWords("Let's take LeetCode contest")).isEqualTo("s'teL ekat edoCteeL tsetnoc");
    }
}
