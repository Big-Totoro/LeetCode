package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

public class _1119_Test {

    private static _1119.Solution1 solution1;
    private static _1119.Solution2 solution2;

    @BeforeClass
    public static void setup() {
        solution1 = new _1119.Solution1();
        solution2 = new _1119.Solution2();
    }

    @Test
    public void test11() {
        assert(solution1.removeVowels("leetcodeisacommunityforcoders").equals("ltcdscmmntyfrcdrs"));
    }

    @Test
    public void test12() {
        assert(solution1.removeVowels("aeiou").equals(""));
    }

    @Test
    public void test21() {
        assert(solution2.removeVowels("leetcodeisacommunityforcoders").equals("ltcdscmmntyfrcdrs"));
    }

    @Test
    public void test22() {
        assert(solution2.removeVowels("aeiou").equals(""));
    }
}
