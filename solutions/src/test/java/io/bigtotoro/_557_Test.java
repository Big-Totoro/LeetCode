package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _557_Test {

    private static _557.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _557.Solution1();
    }

    @Test
    public void test11() {
        assertThat(solution1.reverseWords("Let's take LeetCode contest")).isEqualTo("s'teL ekat edoCteeL tsetnoc");
    }
}
