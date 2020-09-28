package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _1389_Test {

    private static _1389.Solution1 solution1;
    private static _1389.Solution2 solution2;

    @BeforeClass
    public static void setup() {
        solution1 = new _1389.Solution1();
        solution2 = new _1389.Solution2();
    }

    @Test
    public void test11() {
        assertThat(solution1.createTargetArray(new int[] {0, 1, 2, 3, 4}, new int[] {0, 1, 2, 2, 1}))
                .isEqualTo(new int[] {0, 4, 1, 3, 2});
    }

    @Test
    public void test12() {
        assertThat(solution1.createTargetArray(new int[] {1, 2, 3, 4, 0}, new int[] {0, 1, 2, 3, 0}))
                .isEqualTo(new int[] {0, 1, 2, 3, 4});
    }

    @Test
    public void test13() {
        assertThat(solution1.createTargetArray(new int[] {1}, new int[] {0}))
                .isEqualTo(new int[] {1});
    }

    @Test
    public void test21() {
        assertThat(solution2.createTargetArray(new int[] {0, 1, 2, 3, 4}, new int[] {0, 1, 2, 2, 1}))
                .isEqualTo(new int[] {0, 4, 1, 3, 2});
    }

    @Test
    public void test22() {
        assertThat(solution2.createTargetArray(new int[] {1, 2, 3, 4, 0}, new int[] {0, 1, 2, 3, 0}))
                .isEqualTo(new int[] {0, 1, 2, 3, 4});
    }

    @Test
    public void test23() {
        assertThat(solution2.createTargetArray(new int[] {1}, new int[] {0}))
                .isEqualTo(new int[] {1});
    }
}
