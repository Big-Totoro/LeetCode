package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _804_Test {

    private static _804.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _804.Solution1();
    }

    @Test
    public void test1() {
        assertThat(solution1.uniqueMorseRepresentations(new String[] {"gin", "zen", "gig", "msg"})).isEqualTo(2);
    }
}
