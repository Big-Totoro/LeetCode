package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/contains-duplicate/">217. Contains Duplicate</a>
 */

public class _217_Test {

    private static _217.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _217.Solution1();
    }

    @Test
    public void test11() {
        assertThat(solution1.containsDuplicate(new int[] {1, 2, 3, 1})).isEqualTo(true);
    }

    @Test
    public void test12() {
        assertThat(solution1.containsDuplicate(new int[] {1, 2, 3, 4})).isEqualTo(false);
    }

    @Test
    public void test13() {
        assertThat(solution1.containsDuplicate(new int[] {1, 1, 1, 3, 3, 4, 3, 2, 4, 2})).isEqualTo(true);
    }
}
