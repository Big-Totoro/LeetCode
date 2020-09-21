package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _1165_Test {

    private static _1165.Solution1 solution1;
    private static _1165.Solution2 solution2;

    @BeforeClass
    public static void setup() {
        solution1 = new _1165.Solution1();
        solution2 = new _1165.Solution2();
    }

    @Test
    public void test11() {
        assertThat(solution1.calculateTime("abcdefghijklmnopqrstuvwxyz", "cba")).isEqualTo(4);
    }

    @Test
    public void test12() {
        assertThat(solution1.calculateTime("pqrstuvwxyzabcdefghijklmno", "leetcode")).isEqualTo(73);
    }

    @Test
    public void test21() {
        assertThat(solution2.calculateTime("abcdefghijklmnopqrstuvwxyz", "cba")).isEqualTo(4);
    }

    @Test
    public void test22() {
        assertThat(solution2.calculateTime("pqrstuvwxyzabcdefghijklmno", "leetcode")).isEqualTo(73);
    }
}
