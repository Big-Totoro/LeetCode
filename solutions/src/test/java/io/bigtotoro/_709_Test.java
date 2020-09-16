package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _709_Test {

    private static _709.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _709.Solution1();
    }

    @Test
    public void test1() {
        assertThat(solution1.toLowerCase("Hello")).isEqualTo("hello");
    }

    @Test
    public void test2() {
        assertThat(solution1.toLowerCase("here")).isEqualTo("here");
    }

    @Test
    public void test3() {
        assertThat(solution1.toLowerCase("LOVELY")).isEqualTo("lovely");
    }
}
