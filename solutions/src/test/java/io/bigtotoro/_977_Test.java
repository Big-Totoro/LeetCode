package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _977_Test {

    private static _977.Solution1 solution1;
    private static _977.Solution2 solution2;

    @BeforeClass
    public static void setup() {
        solution1 = new _977.Solution1();
        solution2 = new _977.Solution2();
    }

    @Test
    public void test11() {
        assertThat(solution1.sortedSquares(new int[] {-4, -1, 0, 3, 10})).isEqualTo(new int[] {0, 1, 9, 16, 100});
        assertThat(solution2.sortedSquares(new int[] {-4, -1, 0, 3, 10})).isEqualTo(new int[] {0, 1, 9, 16, 100});
    }

    @Test
    public void test12() {
        assertThat(solution1.sortedSquares(new int[] {-7, -3, 2, 3, 11})).isEqualTo(new int[] {4, 9, 9, 49, 121});
        assertThat(solution2.sortedSquares(new int[] {-7, -3, 2, 3, 11})).isEqualTo(new int[] {4, 9, 9, 49, 121});
    }

    @Test
    public void test13() {
        assertThat(solution1.sortedSquares(new int[] {-2, 0})).isEqualTo(new int[] {0, 4});
        assertThat(solution2.sortedSquares(new int[] {-2, 0})).isEqualTo(new int[] {0, 4});
    }
}
