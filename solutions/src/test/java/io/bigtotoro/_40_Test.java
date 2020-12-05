package io.bigtotoro;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class _40_Test {

    private _40.Solution1 solution1 = new _40.Solution1();

    @Test
    public void test11() {
        assertThat(solution1.combinationSum2(new int[] {10, 1, 2, 7, 6, 1, 5}, 8))
            .isEqualTo(List.of(
                List.of(1, 1, 6),
                List.of(1, 2, 5),
                List.of(1, 7),
                List.of(2, 6)
            ));
    }

    @Test
    public void test12() {
        assertThat(solution1.combinationSum2(new int[] {2, 5, 2, 1, 2}, 5))
            .isEqualTo(List.of(
                List.of(1, 2, 2),
                List.of(5)
            ));
    }
}
