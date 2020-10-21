package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _496_Test {

    private static _496.Solution1 solution1;
    private static _496.Solution2 solution2;

    @BeforeClass
    public static void setup() {
        solution1 = new _496.Solution1();
        solution2 = new _496.Solution2();
    }

    @Test
    public void test11() {
        assertThat(solution1.nextGreaterElement(new int[] {4, 1, 2}, new int[] {1, 3, 4, 2})).isEqualTo(new int[] {-1, 3, -1});
        assertThat(solution2.nextGreaterElement(new int[] {4, 1, 2}, new int[] {1, 3, 4, 2})).isEqualTo(new int[] {-1, 3, -1});
    }

    @Test
    public void test12() {
        assertThat(solution1.nextGreaterElement(new int[] {2, 4}, new int[] {1, 2, 3, 4})).isEqualTo(new int[] {3, -1});
        assertThat(solution2.nextGreaterElement(new int[] {2, 4}, new int[] {1, 2, 3, 4})).isEqualTo(new int[] {3, -1});
    }
}