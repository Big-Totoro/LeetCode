package io.bigtotoro;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _413_Test {

    private static final _413.Solution1 SOLUTION_1 = new _413.Solution1();

    @Test
    public void test11() {
        assertThat(SOLUTION_1.numberOfArithmeticSlices(new int[] {1, 2, 3, 4})).isEqualTo(3);
    }
}
