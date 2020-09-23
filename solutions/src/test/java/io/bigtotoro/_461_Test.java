package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _461_Test {

    private static _461.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _461.Solution1();
    }

    @Test
    public void test1() {
        assertThat(solution1.hammingDistance(1, 4))
                .isEqualTo(2);
    }

    @Test
    public void test2() {
        assertThat(solution1.hammingDistance(93, 73))
                .isEqualTo(2);
    }
}
