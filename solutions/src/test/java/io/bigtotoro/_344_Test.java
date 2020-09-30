package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _344_Test {

    private static _344.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _344.Solution1();
    }

    @Test
    public void test1() {
        char[] line = {'h', 'e', 'l', 'l', 'o'};
        solution1.reverseString(line);
        assertThat(line).isEqualTo(new char[] {'h', 'e', 'l', 'l', 'o'});
    }

    @Test
    public void test2() {
        char[] line = {'H', 'a', 'n', 'n', 'a', 'h'};
        solution1.reverseString(line);
        assertThat(line).isEqualTo(new char[] {'h', 'a', 'n', 'n', 'a', 'H'});
    }
}
