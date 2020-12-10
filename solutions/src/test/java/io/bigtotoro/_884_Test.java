package io.bigtotoro;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _884_Test {

    private static _884.Solution1 solution1 = new _884.Solution1();

    @Test
    public void test11() {
        assertThat(solution1.uncommonFromSentences("this apple is sweet", "this apple is sour"))
            .isEqualTo(new String[] {"sweet", "sour"});
    }

    @Test
    public void test12() {
        assertThat(solution1.uncommonFromSentences("apple apple", "banana"))
            .isEqualTo(new String[] {"banana"});
    }

    @Test
    public void test13() {
        assertThat(solution1.uncommonFromSentences("s z z z s", "s z ejt"))
            .isEqualTo(new String[] {"ejt"});
    }
}
