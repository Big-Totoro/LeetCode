package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class _1431_Test {

    private static _1431.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1431.Solution1();
    }

    @Test
    public void test1() {
        assertThat(solution1.kidsWithCandies(new int[] {2, 3, 5, 1, 3}, 3))
                .isEqualTo(List.of(true, true, true, false, true));
    }

    @Test
    public void test2() {
        assertThat(solution1.kidsWithCandies(new int[] {4, 2, 1, 1, 2}, 1))
                .isEqualTo(List.of(true, false, false, false, false));
    }

    @Test
    public void test3() {
        assertThat(solution1.kidsWithCandies(new int[] {12, 1, 12}, 10))
                .isEqualTo(List.of(true, false, true));
    }
}
