package io.bigtotoro;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class _228_Test {
    @Test
    public void test11() {
        _228.Solution solution1 = new _228.Solution();
        assertThat(solution1.summaryRanges(new int[] {0, 1, 2, 4, 5, 7})).isEqualTo(List.of("0->2", "4->5", "7"));
    }

    @Test
    public void test12() {
        _228.Solution solution1 = new _228.Solution();
        assertThat(solution1.summaryRanges(new int[] {0, 2, 3, 4, 6, 8, 9})).isEqualTo(List.of("0", "2->4", "6", "8->9"));
    }
}
