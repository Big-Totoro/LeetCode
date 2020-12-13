package io.bigtotoro;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _1196_Test {

    private static _1196.Solution1 solution1 = new _1196.Solution1();

    @Test
    public void test11() {
        assertThat(solution1.maxNumberOfApples(new int[] {100, 200, 150, 1000})).isEqualTo(4);
    }

    @Test
    public void test12() {
        assertThat(solution1.maxNumberOfApples(new int[] {900, 950, 800, 1000, 700, 800})).isEqualTo(5);
    }
}