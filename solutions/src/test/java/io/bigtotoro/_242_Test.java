package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _242_Test {

    private static _242.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _242.Solution1();
    }

    @Test
    public void test11() {
        assertThat(solution1.isAnagram("anagram", "nagaram")).isEqualTo(true);
    }

    @Test
    public void test12() {
        assertThat(solution1.isAnagram("rat", "car")).isEqualTo(false);
    }
}
