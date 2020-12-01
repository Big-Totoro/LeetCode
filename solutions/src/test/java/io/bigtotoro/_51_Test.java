package io.bigtotoro;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class _51_Test {

    private static _51.Solution1 solution1 = new _51.Solution1();

    @Test
    public void test11() {
        assertThat(solution1.solveNQueens(4)).containsExactlyInAnyOrder(
                List.of(".Q..", "...Q", "Q...", "..Q."),
                List.of("..Q.", "Q...", "...Q", ".Q..")
        );
    }

    @Test
    public void test12() {
        assertThat(solution1.solveNQueens(1)).isEqualTo(List.of(List.of("Q")));
    }
}
