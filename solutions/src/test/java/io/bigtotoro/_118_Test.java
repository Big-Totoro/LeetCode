package io.bigtotoro;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class _118_Test {

    private static _118.Solution1 solution1 = new _118.Solution1();

    @Test
    public void test11() {
        assertThat(solution1.generate(5))
            .isEqualTo(List.of(
                    List.of(1),
                    List.of(1, 1),
                    List.of(1, 2, 1),
                    List.of(1, 3, 3, 1),
                    List.of(1, 4, 6, 4, 1)
            ));
    }
}
