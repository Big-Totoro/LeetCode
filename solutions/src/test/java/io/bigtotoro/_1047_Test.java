package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _1047_Test {

    private static _1047.Solution1 solution1;
    private static _1047.Solution2 solution2;

    @BeforeClass
    public static void setup() {
        solution1 = new _1047.Solution1();
        solution2 = new _1047.Solution2();
    }

    @Test
    public void test11() {
        assertThat(solution1.removeDuplicates("abbaca"))
                .isEqualTo("ca");
    }

    @Test
    public void test21() {
        assertThat(solution2.removeDuplicates("abbaca"))
                .isEqualTo("ca");
    }
}
