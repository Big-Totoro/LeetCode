package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _283_Test {

    private static _283.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _283.Solution1();
    }

    @Test
    public void test11() {
        int[] array = {0, 1, 0, 3, 12};
        solution1.moveZeroes(array);
        assertThat(array).isEqualTo(new int[] {1, 3, 12, 0, 0});
    }
}
