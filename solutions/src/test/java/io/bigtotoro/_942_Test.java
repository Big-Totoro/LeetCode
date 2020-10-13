package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _942_Test {

    private static _942.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _942.Solution1();
    }

    @Test
    public void test11() {
        assertThat(solution1.diStringMatch("IDID")).isEqualTo(new int[] {0, 4, 1, 3, 2});
    }

    @Test
    public void test12() {
        assertThat(solution1.diStringMatch("III")).isEqualTo(new int[] {0, 1, 2, 3});
    }

    @Test
    public void test13() {
        assertThat(solution1.diStringMatch("DDI")).isEqualTo(new int[] {3, 2, 0, 1});
    }
}
