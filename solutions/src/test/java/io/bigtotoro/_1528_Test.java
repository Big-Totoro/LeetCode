package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _1528_Test {

    private static _1528.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1528.Solution1();
    }

    @Test
    public void test1() {
        assertThat(solution1.restoreString("codeleet", new int[] {4, 5, 6, 7, 0, 2, 1, 3})).isEqualTo("leetcode");
    }

    @Test
    public void test2() {
        assertThat(solution1.restoreString("abc", new int[] {0, 1, 2})).isEqualTo("abc");
    }

    @Test
    public void test3() {
        assertThat(solution1.restoreString("aiohn", new int[] {3, 1, 4, 2, 0})).isEqualTo("nihao");
    }

    @Test
    public void test4() {
        assertThat(solution1.restoreString("aaiougrt", new int[] {4, 0, 2, 6, 7, 3, 1, 5})).isEqualTo("arigatou");
    }

    @Test
    public void test5() {
        assertThat(solution1.restoreString("art", new int[] {1, 0, 2})).isEqualTo("rat");
    }
}
