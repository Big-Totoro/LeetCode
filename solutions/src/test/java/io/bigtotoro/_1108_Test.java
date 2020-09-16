package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

public class _1108_Test {

    private static _1108.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1108.Solution1();
    }

    @Test
    public void test1() {
        assert(solution1.defangIPaddr("1.1.1.1").equals("1[.]1[.]1[.]1"));
    }

    @Test
    public void test2() {
        assert(solution1.defangIPaddr("255.100.50.0").equals("255[.]100[.]50[.]0"));
    }
}
