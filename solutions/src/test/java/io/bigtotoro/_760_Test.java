package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _760_Test {

    private static _760.Solution1 solution1;
    private static _760.Solution2 solution2;

    @BeforeClass
    public static void setup() {
        solution1 = new _760.Solution1();
        solution2 = new _760.Solution2();
    }

    @Test
    public void test1() {
        assertThat(solution1.anagramMappings(
                new int[] {12, 28, 46, 32, 50},
                new int[] {50, 12, 32, 46, 28}
        )).isEqualTo(new int[] {1, 4, 3, 2, 0});
    }

    @Test
    public void test2() {
        assertThat(solution2.anagramMappings(
                new int[] {12, 28, 46, 32, 50},
                new int[] {50, 12, 32, 46, 28}
        )).isEqualTo(new int[] {1, 4, 3, 2, 0});
    }
}
