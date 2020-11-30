package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _999_Test {

    private static _999.Solution1 solution1 = new _999.Solution1();

    private static char[][] test1;
    private static char[][] test2;
    private static char[][] test3;

    @BeforeClass
    public static void setup() {
        test1 = new char[][] {
                {'.','.','.','.','.','.','.','.'},
                {'.','.','.','p','.','.','.','.'},
                {'.','.','.','R','.','.','.','p'},
                {'.','.','.','.','.','.','.','.'},
                {'.','.','.','.','.','.','.','.'},
                {'.','.','.','p','.','.','.','.'},
                {'.','.','.','.','.','.','.','.'},
                {'.','.','.','.','.','.','.','.'}
        };
        test2 = new char[][] {
                {'.','.','.','.','.','.','.','.'},
                {'.','p','p','p','p','p','.','.'},
                {'.','p','p','B','p','p','.','.'},
                {'.','p','B','R','B','p','.','.'},
                {'.','p','p','B','p','p','.','.'},
                {'.','p','p','p','p','p','.','.'},
                {'.','.','.','.','.','.','.','.'},
                {'.','.','.','.','.','.','.','.'}
        };
        test3 = new char[][] {
                {'.','.','.','.','.','.','.','.'},
                {'.','.','.','p','.','.','.','.'},
                {'.','.','.','p','.','.','.','.'},
                {'p','p','.','R','.','p','B','.'},
                {'.','.','.','.','.','.','.','.'},
                {'.','.','.','B','.','.','.','.'},
                {'.','.','.','p','.','.','.','.'},
                {'.','.','.','.','.','.','.','.'}
        };
    }

    @Test
    public void test11() {
        assertThat(solution1.numRookCaptures(test1)).isEqualTo(3);
    }

    @Test
    public void test12() {
        assertThat(solution1.numRookCaptures(test2)).isEqualTo(0);
    }

    @Test
    public void test13() {
        assertThat(solution1.numRookCaptures(test3)).isEqualTo(3);
    }
}
