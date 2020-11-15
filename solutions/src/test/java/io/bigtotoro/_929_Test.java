package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _929_Test {

    private static _929.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _929.Solution1();
    }

    @Test
    public void test11() {
        assertThat(solution1.numUniqueEmails(new String[] {
                "test.email+alex@leetcode.com",
                "test.e.mail+bob.cathy@leetcode.com",
                "testemail+david@lee.tcode.com"
        })).isEqualTo(2);
    }

    @Test
    public void test12() {
        assertThat(solution1.numUniqueEmails(new String[] {
                "testemail@leetcode.com",
                "testemail1@leetcode.com",
                "testemail+david@lee.tcode.com"
        })).isEqualTo(2);
    }
}
