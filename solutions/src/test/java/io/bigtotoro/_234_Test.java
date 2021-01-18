package io.bigtotoro;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _234_Test {

    @Test
    public void test11() {
        _234.Solution1 solution1 = new _234.Solution1();
        assertThat(solution1.isPalindrome(new _234.ListNode(1, new _234.ListNode(2)))).isFalse();
    }
    @Test
    public void test12() {
        _234.Solution1 solution1 = new _234.Solution1();
        assertThat(solution1.isPalindrome(
                new _234.ListNode(1,
                    new _234.ListNode(2,
                            new _234.ListNode(2,
                                    new _234.ListNode(1)
                            )
                    )
                )
        )).isTrue();
    }

    @Test
    public void test13() {
        _234.Solution1 solution1 = new _234.Solution1();
        assertThat(solution1.isPalindrome(
                new _234.ListNode(1,
                        new _234.ListNode(0,
                                new _234.ListNode(0)
                        )
                )
        )).isFalse();
    }
}
