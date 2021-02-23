package io.bigtotoro;

import org.junit.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class _524_Test {

    private static final _524.Solution1 SOLUTION_1 = new _524.Solution1();

    @Test
    public void test11() {
        assertThat(SOLUTION_1.findLongestWord("abpcplea", Arrays.asList("ale", "apple", "monkey", "plea")))
            .isEqualTo("apple");
    }

    @Test
    public void test12() {
        assertThat(SOLUTION_1.findLongestWord("abpcplea", Arrays.asList("a", "b", "c")))
            .isEqualTo("a");
    }
}
