package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class _412_Test {

    private static _412.Solution1 solution1;
    private static _412.Solution2 solution2;

    private static List<String> expected;
    @BeforeClass
    public static void setup() {
        solution1 = new _412.Solution1();
        solution2 = new _412.Solution2();

        expected = List.of(
                "1",
                "2",
                "Fizz",
                "4",
                "Buzz",
                "Fizz",
                "7",
                "8",
                "Fizz",
                "Buzz",
                "11",
                "Fizz",
                "13",
                "14",
                "FizzBuzz"
        );
    }

    @Test
    public void test11() {
        assertThat(solution1.fizzBuzz(15)).isEqualTo(expected);
    }

    @Test
    public void test12() {
        assertThat(solution2.fizzBuzz(15)).isEqualTo(expected);
    }
}