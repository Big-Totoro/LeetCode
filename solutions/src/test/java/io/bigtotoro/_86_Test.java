package io.bigtotoro;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _86_Test {

    private static final _86.Solution1 SOLUTION_1 = new _86.Solution1();

    @Test
    public void test11() {
        assertThat(SOLUTION_1.partition(
                new _86.ListNode(1,
                    new _86.ListNode(4,
                        new _86.ListNode(3,
                                new _86.ListNode(2,
                                        new _86.ListNode(5,
                                                new _86.ListNode(2)
                                        )
                                )
                        )
                    )
                )
        , 3)).isEqualTo(
                new _86.ListNode(1,
                        new _86.ListNode(2,
                                new _86.ListNode(2,
                                        new _86.ListNode(4,
                                                new _86.ListNode(3,
                                                        new _86.ListNode(5)
                                                )
                                        )
                                )
                        )
                )
        );
    }

    @Test
    public void test12() {
        assertThat(SOLUTION_1.partition(
                new _86.ListNode(2,
                    new _86.ListNode(1))
        , 3)).isEqualTo(
                new _86.ListNode(1,
                        new _86.ListNode(2))
        );
    }

    @Test
    public void test13() {
        assertThat(SOLUTION_1.partition(
                new _86.ListNode(1)
        , 0)).isEqualTo(
                new _86.ListNode(1,
                        new _86.ListNode(2))
        );
    }
}
