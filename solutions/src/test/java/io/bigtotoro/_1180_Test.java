package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _1180_Test {

    private static _1180.Solution1 solution1;
    private static _1180.Solution2 solution2;

    @BeforeClass
    public static void setup() {
        solution1 = new _1180.Solution1();
        solution2 = new _1180.Solution2();
    }

    @Test
    public void test11() {
        assertThat(solution1.countLetters("aaaba")).isEqualTo(8);
        assertThat(solution2.countLetters("aaaba")).isEqualTo(8);
    }

    @Test
    public void test12() {
        assertThat(solution1.countLetters("aaaaaaaaaa")).isEqualTo(55);
        assertThat(solution2.countLetters("aaaaaaaaaa")).isEqualTo(55);
    }
}
