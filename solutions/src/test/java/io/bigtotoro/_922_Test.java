package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _922_Test {

    private static _922.Solution1 solution1;
    private static _922.Solution2 solution2;

    @BeforeClass
    public static void setup() {
        solution1 = new _922.Solution1();
        solution2 = new _922.Solution2();
    }

    @Test
    public void test11() {
        assertThat(solution1.sortArrayByParityII(new int[] { 4, 2, 5, 7 }))
                .isEqualTo(new int[] { 4, 5, 2, 7 });
    }

    @Test
    public void test21() {
        assertThat(solution2.sortArrayByParityII(new int[] { 4, 2, 5, 7 }))
                .isEqualTo(new int[] { 4, 5, 2, 7 });
    }
}
