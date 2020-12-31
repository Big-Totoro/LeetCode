package io.bigtotoro;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class _1441_Test {

    private static final _1441.Solution1 SOLUTION_1 = new _1441.Solution1();

    @Test
    public void test11() {
        assertThat(SOLUTION_1.buildArray(new int[] {1, 3}, 3)).containsSequence("Push", "Push", "Pop", "Push");
    }

    @Test
    public void test12() {
        assertThat(SOLUTION_1.buildArray(new int[] {1, 2, 3}, 3)).isEqualTo(List.of("Push", "Push", "Push"));
    }

    @Test
    public void test13() {
        assertThat(SOLUTION_1.buildArray(new int[] {1, 2}, 4)).isEqualTo(List.of("Push", "Push"));
    }

    @Test
    public void test14() {
        assertThat(SOLUTION_1.buildArray(new int[] {2, 3, 4}, 4))
                .isEqualTo(List.of("Push", "Pop", "Push", "Push", "Push"));
    }
}
