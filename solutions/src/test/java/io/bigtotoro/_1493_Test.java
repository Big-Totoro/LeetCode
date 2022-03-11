package io.bigtotoro;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _1493_Test {

    private _1493.Solution1 solution = new _1493.Solution1();

    @Test
    public void test11() {
        assertThat(solution.longestSubarray(new int[] {1, 1, 0, 1})).isEqualTo(3);
    }

    @Test
    public void test12() {
        assertThat(solution.longestSubarray(new int[] {0, 1, 1, 1, 0, 1, 1, 0, 1})).isEqualTo(5);
    }

    @Test
    public void test13() {
        assertThat(solution.longestSubarray(new int[] {1, 1, 1})).isEqualTo(2);
    }
}
