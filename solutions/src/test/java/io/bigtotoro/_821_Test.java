package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _821_Test {

    private static _821.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _821.Solution1();
    }

    @Test
    public void test11() {
        assertThat(solution1.shortestToChar("loveleetcode", 'e'))
                .isEqualTo(new int[] {3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0});
    }
}
