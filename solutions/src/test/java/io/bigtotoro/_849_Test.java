package io.bigtotoro;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _849_Test {

    private final _849.Solution1 solution1 = new _849.Solution1();

    @Test
    public void test11() {
        assertThat(solution1.maxDistToClosest(new int[] {1, 0, 0, 0, 1, 0, 1})).isEqualTo(2);
    }

    @Test
    public void test12() {
        assertThat(solution1.maxDistToClosest(new int[] {1, 0, 0, 0})).isEqualTo(3);
    }

    @Test
    public void test13() {
        assertThat(solution1.maxDistToClosest(new int[] {0, 1})).isEqualTo(1);
    }
}
