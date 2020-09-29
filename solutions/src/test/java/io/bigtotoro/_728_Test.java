package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class _728_Test {

    private static _728.Solution1 solution1;
    private static _728.Solution2 solution2;

    @BeforeClass
    public static void setup() {
        solution1 = new _728.Solution1();
        solution2 = new _728.Solution2();
    }

    @Test
    public void test11() {
        assertThat(solution1.selfDividingNumbers(1, 22))
                .isEqualTo(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22));
    }

    @Test
    public void test21() {
        assertThat(solution2.selfDividingNumbers(1, 22))
                .isEqualTo(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22));
    }
}
