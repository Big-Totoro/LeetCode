package io.bigtotoro;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _1673_Test {

    private static final _1673.Solution1 SOLUTION_1 = new _1673.Solution1();

    @Test
    public void test11() {
        assertThat(SOLUTION_1.mostCompetitive(new int[] {3, 5, 2, 6}, 2)).isEqualTo(new int[] {2, 6});
    }

    @Test
    public void test12() {
        assertThat(SOLUTION_1.mostCompetitive(new int[] {2, 4, 3, 3, 5, 4, 9, 6}, 4))
                .isEqualTo(new int[] {2, 3, 3, 4});
    }
}
