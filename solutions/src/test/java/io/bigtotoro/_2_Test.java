package io.bigtotoro;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _2_Test {

    private static _2.Solution1 solution1 = new _2.Solution1();

    @Test
    public void test11() {
        assertThat(solution1.addTwoNumbers(
                new _2.ListNode(2, new _2.ListNode(4, new _2.ListNode(3))),
                new _2.ListNode(5, new _2.ListNode(6, new _2.ListNode(4)))
            )
        ).isEqualTo(new _2.ListNode(7, new _2.ListNode(0, new _2.ListNode(8))));
    }

    @Test
    public void test12() {
        assertThat(solution1.addTwoNumbers(
                new _2.ListNode(0),
                new _2.ListNode(0)
            )
        ).isEqualTo(new _2.ListNode(0));
    }

    @Test
    public void test13() {
        assertThat(solution1.addTwoNumbers(
            new _2.ListNode(9,
                    new _2.ListNode(9,
                            new _2.ListNode(9,
                                    new _2.ListNode(9,
                                            new _2.ListNode(9,
                                                    new _2.ListNode(9,
                                                            new _2.ListNode(9)
                                                    )
                                            )
                                    )
                            )
                    )
            ),
            new _2.ListNode(9,
                    new _2.ListNode(9,
                            new _2.ListNode(9,
                                    new _2.ListNode(9)
                                    )
                            )
                    )
            )
        ).isEqualTo(new _2.ListNode(7, new _2.ListNode(0, new _2.ListNode(8))));
    }
}