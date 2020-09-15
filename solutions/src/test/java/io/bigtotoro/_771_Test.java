package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

public class _771_Test {

    private static _771.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _771.Solution1();
    }

    @Test
    public void test1() {
        assert(solution1.numJewelsInStones("aA", "aAAbbbb") == 3);
    }

    @Test
    public void test2() {
        assert(solution1.numJewelsInStones("z", "ZZ") == 0);
    }
}
