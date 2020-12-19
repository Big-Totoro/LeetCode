package io.bigtotoro;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class _448_Test {

    private static _448.Solution1 solution1 = new _448.Solution1();

    @Test
    public void test11() {
        assertThat(solution1.findDisappearedNumbers(new int[] {4, 3, 2, 7, 8, 2, 3, 1})).isEqualTo(List.of(5, 6));
    }
}
