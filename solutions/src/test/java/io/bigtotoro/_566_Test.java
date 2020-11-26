package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _566_Test {

    private static _566.Solution1 solution1;
    private static _566.Solution2 solution2;

    @BeforeClass
    public static void setup() {
        solution1 = new _566.Solution1();
        solution2 = new _566.Solution2();
    }

    @Test
    public void test11() {
        assertThat(solution1.matrixReshape(new int[][] {{1, 2}, {3, 4}}, 1, 4))
                .isEqualTo(new int[][] {{1, 2, 3, 4}});
    }

    @Test
    public void test21() {
        assertThat(solution2.matrixReshape(new int[][] {{1, 2}, {3, 4}}, 1, 4))
                .isEqualTo(new int[][] {{1, 2, 3, 4}});
    }
}
