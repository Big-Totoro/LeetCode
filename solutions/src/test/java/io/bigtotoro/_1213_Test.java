package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class _1213_Test {

    private static _1213.Solution1 solution1;
    private static _1213.Solution2 solution2;

    @BeforeClass
    public static void setup() {
        solution1 = new _1213.Solution1();
        solution2 = new _1213.Solution2();
    }

    @Test
    public void test11() {
        assertThat(solution1.arraysIntersection(
                new int[] {1, 2, 3, 4, 5},
                new int[] {1, 2, 5 ,7, 9},
                new int[] {1, 3, 4, 5, 8}))
                .isEqualTo(List.of(1, 5));
    }

    @Test
    public void test21() {
        assertThat(solution2.arraysIntersection(
                new int[] {1, 2, 3, 4, 5},
                new int[] {1, 2, 5 ,7, 9},
                new int[] {1, 3, 4, 5, 8}))
                .isEqualTo(List.of(1, 5));
    }
}
