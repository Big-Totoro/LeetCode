package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

public class _509_Test {

    private static _509.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _509.Solution1();
    }

    @Test
    public void test1() {
        assert(solution1.fib(0) == 0);
    }

    @Test
    public void test2() {
        assert(solution1.fib(1) == 1);
    }

    @Test
    public void test3() {
        assert(solution1.fib(2) == 1);
    }

    @Test
    public void test4() {
        assert(solution1.fib(3) == 2);
    }

    @Test
    public void test5() {
        assert(solution1.fib(4) == 3);
    }

    @Test
    public void test6() {
        assert(solution1.fib(24) == 46368);
    }
}
