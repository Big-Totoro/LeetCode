package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _561_Test {

    private static _561.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _561.Solution1();
    }

    @Test
    public void test11() {
        assertThat(solution1.arrayPairSum(new int[] {1, 4, 3, 2})).isEqualTo(4);
    }
}
