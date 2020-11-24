package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

public class _509_Test {

    private static _509.Solution1 solution1;
    private static _509.Solution2 solution2;

    @BeforeClass
    public static void setup() {
        solution1 = new _509.Solution1();
        solution2 = new _509.Solution2();
    }

    @Test
    public void test11() {
        assert(solution1.fib(0) == 0);
    }

    @Test
    public void test12() {
        assert(solution1.fib(1) == 1);
    }

    @Test
    public void test13() {
        assert(solution1.fib(2) == 1);
    }

    @Test
    public void test14() {
        assert(solution1.fib(3) == 2);
    }

    @Test
    public void test15() {
        assert(solution1.fib(4) == 3);
    }

    @Test
    public void test16() {
        assert(solution1.fib(24) == 46368);
    }

    @Test
    public void test21() {
        assert(solution2.fib(0) == 0);
    }

    @Test
    public void test22() {
        assert(solution2.fib(1) == 1);
    }

    @Test
    public void test23() {
        assert(solution2.fib(2) == 1);
    }

    @Test
    public void test24() {
        assert(solution2.fib(3) == 2);
    }

    @Test
    public void test25() {
        assert(solution2.fib(4) == 3);
    }

    @Test
    public void test26() {
        assert(solution2.fib(24) == 46368);
    }
}
