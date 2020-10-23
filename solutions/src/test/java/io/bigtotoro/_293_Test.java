package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class _293_Test {

    private static _293.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _293.Solution1();
    }

    @Test
    public void test11() {
        assertThat(solution1.generatePossibleNextMoves("++++")).isEqualTo(List.of("--++", "+--+", "++--"));
    }

    @Test
    public void test12() {
        assertThat(solution1.generatePossibleNextMoves("++")).isEqualTo(List.of("--"));
    }

    @Test
    public void test13() {
        assertThat(solution1.generatePossibleNextMoves("--")).isEqualTo(List.of());
    }
}