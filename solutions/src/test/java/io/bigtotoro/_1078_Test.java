package io.bigtotoro;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _1078_Test {

    private static final _1078.Solution1 SOLUTION_1 = new _1078.Solution1();

    @Test
    public void test11() {
        assertThat(SOLUTION_1.findOcurrences("alice is a good girl she is a good student", "a", "good"))
            .isEqualTo(new String[] {"girl", "student"});
    }

    @Test
    public void test12() {
        assertThat(SOLUTION_1.findOcurrences("we will we will rock you", "we", "will"))
            .isEqualTo(new String[] {"we", "rock"});
    }
}
