package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class _811_Test {

    private static _811.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _811.Solution1();
    }

    @Test
    public void test11() {
        assertThat(solution1.subdomainVisits(new String[] {"9001 discuss.leetcode.com"}))
                .isEqualTo(List.of("9001 com", "9001 leetcode.com", "9001 discuss.leetcode.com"));
    }

    @Test
    public void test12() {
        assertThat(solution1.subdomainVisits(new String[] {
                "900 google.mail.com",
                "50 yahoo.com",
                "1 intel.mail.com",
                "5 wiki.org"}
                ))
                .isEqualTo(List.of(
                        "951 com",
                        "900 google.mail.com",
                        "5 org",
                        "1 intel.mail.com",
                        "5 wiki.org",
                        "901 mail.com",
                        "50 yahoo.com"
                ));
    }
}
