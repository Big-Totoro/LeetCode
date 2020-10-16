package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _266_Test {

    private static _266.Solution1 solution1;
    private static _266.Solution2 solution2;

    @BeforeClass
    public static void setup() {
        solution1 = new _266.Solution1();
        solution2 = new _266.Solution2();
    }

    @Test
    public void test11() {
        assertThat(solution1.canPermutePalindrome("aaa")).isEqualTo(true);
        assertThat(solution2.canPermutePalindrome("aaa")).isEqualTo(true);
    }

    @Test
    public void test12() {
        assertThat(solution1.canPermutePalindrome("aab")).isEqualTo(true);
        assertThat(solution2.canPermutePalindrome("aab")).isEqualTo(true);
    }

    @Test
    public void test13() {
        assertThat(solution1.canPermutePalindrome("carerac")).isEqualTo(true);
        assertThat(solution2.canPermutePalindrome("carerac")).isEqualTo(true);
    }

    @Test
    public void test14() {
        assertThat(solution1.canPermutePalindrome("code")).isEqualTo(false);
        assertThat(solution2.canPermutePalindrome("code")).isEqualTo(false);
    }
}
