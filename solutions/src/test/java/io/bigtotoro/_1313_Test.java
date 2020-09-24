package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _1313_Test {

    private static _1313.Solution1 solution1;
    private static _1313.Solution2 solution2;

    @BeforeClass
    public static void setup() {
        solution1 = new _1313.Solution1();
        solution2 = new _1313.Solution2();
    }

    @Test
    public void test11() {
        assertThat(solution1.decompressRLElist(new int[] {1, 2, 3, 4})).isEqualTo(new int[] {2, 4, 4, 4});
    }

    @Test
    public void test12() {
        assertThat(solution1.decompressRLElist(new int[] {1, 1, 2, 3})).isEqualTo(new int[] {1, 3, 3});
    }

    @Test
    public void test21() {
        assertThat(solution2.decompressRLElist(new int[] {1, 2, 3, 4})).isEqualTo(new int[] {2, 4, 4, 4});
    }

    @Test
    public void test22() {
        assertThat(solution2.decompressRLElist(new int[] {1, 1, 2, 3})).isEqualTo(new int[] {1, 3, 3});
    }
}
