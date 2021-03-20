package io.bigtotoro;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class _841_Test {

    private static final _841.Solution1 SOLUTION_1 = new _841.Solution1();

    @Test
    public void test11() {
        assertThat(SOLUTION_1.canVisitAllRooms(List.of(List.of(1), List.of(2), List.of(3), List.of()))).isTrue();
    }

    @Test
    public void test12() {
        assertThat(SOLUTION_1.canVisitAllRooms(List.of(List.of(1, 3), List.of(3, 0, 1), List.of(2), List.of(0))))
                .isFalse();
    }
}
