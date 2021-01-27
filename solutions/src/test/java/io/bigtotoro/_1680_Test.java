package io.bigtotoro;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _1680_Test {

    private static final _1680.Solution1 SOLUTION_1 = new _1680.Solution1();

    @Test
    public void test11() {
        assertThat(SOLUTION_1.concatenatedBinary(1)).isEqualTo(1);
    }

    @Test
    public void test12() {
        assertThat(SOLUTION_1.concatenatedBinary(3)).isEqualTo(27);
    }

    @Test
    public void test13() {
        assertThat(SOLUTION_1.concatenatedBinary(12)).isEqualTo(505379714);
    }
}
