package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _500_Test {

    private static _500.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _500.Solution1();
    }

    @Test
    public void test11() {
        assertThat(solution1.findWords(new String[] {
                "Hello", "Alaska", "Dad", "Peace"
        })).isEqualTo(new String[] {"Alaska", "Dad"});
    }
}
