package io.bigtotoro;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class _582_Test {

    private static final _582.Solution1 SOLUTION_1 = new _582.Solution1();

    @Test
    public void test11() {
        assertThat(SOLUTION_1.killProcess(List.of(1, 3, 10, 5), List.of(3, 0, 5, 3), 5))
            .isEqualTo(List.of(5, 10));
    }
}
