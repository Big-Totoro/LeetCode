package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class _1002_Test {

    private static _1002.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1002.Solution1();
    }

    @Test
    public void test11() {
        assertThat(solution1.commonChars(new String[] {"bella", "label", "roller"}))
                .isEqualTo(List.of("e", "l", "l"));
    }

    @Test
    public void test12() {
        assertThat(solution1.commonChars(new String[] {"cool", "lock", "cook"}))
                .isEqualTo(List.of("c", "o"));
    }

    @Test
    public void test13() {
        assertThat(solution1.commonChars(new String[] {"acabcddd", "bcbdbcbd", "baddbadb", "cbdddcac", "aacbcccd",
                "ccccddda", "cababaab", "addcaccd"}))
                .isEqualTo(List.of());
    }
}
