package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _243_Test {

    private static _243.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _243.Solution1();
    }

    @Test
    public void test11() {
        assertThat(solution1.shortestDistance(new String[] {
                "practice", "makes", "perfect", "coding", "makes"
        }, "coding", "practice")).isEqualTo(3);
    }

    @Test
    public void test12() {
        assertThat(solution1.shortestDistance(new String[] {
                "practice", "makes", "perfect", "coding", "makes"
        }, "makes", "coding")).isEqualTo(1);
    }

    @Test
    public void test13() {
        assertThat(solution1.shortestDistance(new String[] {
                "a", "c", "b", "a"
        }, "a", "b")).isEqualTo(1);
    }
}
