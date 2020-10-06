package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _905_Test {

    private static _905.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _905.Solution1();
    }

    @Test
    public void test11() {
        assertThat(solution1.sortArrayByParity(new int[] { 3, 1, 2, 4 }))
                .isEqualTo(new int[] { 2, 4, 1, 3 });
    }
}
