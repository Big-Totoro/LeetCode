package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

public class _1374_Test {

    private static _1374.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1374.Solution1();
    }

    @Test
    public void test11() {
        System.out.println(solution1.generateTheString(1));
    }

    @Test
    public void test12() {
        System.out.println(solution1.generateTheString(2));
    }

    @Test
    public void test13() {
        System.out.println(solution1.generateTheString(3));
    }

    @Test
    public void test14() {
        System.out.println(solution1.generateTheString(4));
    }

    @Test
    public void test15() {
        System.out.println(solution1.generateTheString(5));
    }

    @Test
    public void test16() {
        System.out.println(solution1.generateTheString(17));
    }

    @Test
    public void test17() {
        System.out.println(solution1.generateTheString(82));
    }
}