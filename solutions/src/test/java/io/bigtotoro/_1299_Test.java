package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _1299_Test {

    private static _1299.Solution1 solution1;
    private static _1299.Solution2 solution2;

    @BeforeClass
    public static void setup() {
        solution1 = new _1299.Solution1();
        solution2 = new _1299.Solution2();
    }

    @Test
    public void test11() {
        assertThat(solution1.replaceElements(new int[] { 17, 18, 5, 4, 6, 1 }))
                .isEqualTo(new int[] { 18, 6, 6, 6, 1, -1 });
    }

    @Test
    public void test21() {
        assertThat(solution2.replaceElements(new int[] { 17, 18, 5, 4, 6, 1 }))
                .isEqualTo(new int[] { 18, 6, 6, 6, 1, -1 });
    }
}
