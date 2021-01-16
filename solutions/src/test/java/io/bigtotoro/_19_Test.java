package io.bigtotoro;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _19_Test {

    private static final _19.Solution1 SOLUTION_1 = new _19.Solution1();

    @Test
    public void test11() {
        assertThat(SOLUTION_1.removeNthFromEnd(
            new _19.ListNode(1,
                    new _19.ListNode(2,
                            new _19.ListNode(3,
                                    new _19.ListNode(4,
                                            new _19.ListNode(5)
                                    )
                            )
                    )
            ), 2
        )).isEqualTo(
                new _19.ListNode(1,
                        new _19.ListNode(2,
                                new _19.ListNode(3,
                                        new _19.ListNode(5)
                                )
                        )
                )
        );
    }

    @Test
    public void test12() {
        assertThat(SOLUTION_1.removeNthFromEnd(
            new _19.ListNode(1), 1)).isEqualTo(null);
    }

    @Test
    public void test13() {
        assertThat(SOLUTION_1.removeNthFromEnd(
            new _19.ListNode(1, new _19.ListNode(2)), 1)).isEqualTo(new _19.ListNode(1));
    }
}
