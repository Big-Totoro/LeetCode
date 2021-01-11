package io.bigtotoro;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _443_Test {

    private static final _443.Solution1 SOLUTION_1 = new _443.Solution1();
    private static final _443.Solution2 SOLUTION_2 = new _443.Solution2();

    @Test
    public void test11() {
        assertThat(SOLUTION_1.compress(new char[] {'a', 'a', 'b', 'b', 'c', 'c', 'c'})).isEqualTo(6);
    }

    @Test
    public void test12() {
        assertThat(SOLUTION_1.compress(new char[] {'a'})).isEqualTo(1);
    }

    @Test
    public void test13() {
        assertThat(SOLUTION_1.compress(new char[] {'a','b','b','b','b','b','b','b','b','b','b','b','b'})).isEqualTo(4);
    }

    @Test
    public void test14() {
        assertThat(SOLUTION_1.compress(new char[] {'a','a','a','b','b','a','a'})).isEqualTo(6);
    }

    @Test
    public void test21() {
        assertThat(SOLUTION_2.compress(new char[] {'a', 'a', 'b', 'b', 'c', 'c', 'c'})).isEqualTo(6);
    }

    @Test
    public void test22() {
        assertThat(SOLUTION_2.compress(new char[] {'a'})).isEqualTo(1);
    }

    @Test
    public void test23() {
        assertThat(SOLUTION_2.compress(new char[] {'a','b','b','b','b','b','b','b','b','b','b','b','b'})).isEqualTo(4);
    }

    @Test
    public void test24() {
        assertThat(SOLUTION_2.compress(new char[] {'a','a','a','b','b','a','a'})).isEqualTo(6);
    }
}
