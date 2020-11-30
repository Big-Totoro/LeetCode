package io.bigtotoro;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class _46_Test {

    private _46.Solution1 solution1 = new _46.Solution1();

    @Test
    public void test11() {
        assertThat(solution1.permute(new int[] {1, 2, 3})).containsExactlyInAnyOrder(
                List.of(1, 2, 3),
                List.of(1, 3, 2),
                List.of(2, 1, 3),
                List.of(2, 3 ,1),
                List.of(3, 1, 2),
                List.of(3, 2, 1)
        );
    }

    @Test
    public void test12() {
        assertThat(solution1.permute(new int[] {0, 1})).containsExactlyInAnyOrder(
                List.of(0, 1),
                List.of(1, 0)
        );
    }

    @Test
    public void test13() {
        assertThat(solution1.permute(new int[] {1})).containsExactlyInAnyOrder(
                List.of(1)
        );
    }
}