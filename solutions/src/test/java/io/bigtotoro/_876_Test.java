package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _876_Test {

    private static _876.Solution1 solution1;

    private static _876.ListNode head1;
    private static _876.ListNode head2;

    @BeforeClass
    public static void setup() {
        solution1 = new _876.Solution1();

        head1 = new _876.ListNode(1,
                new _876.ListNode(2,
                        new _876.ListNode(3,
                                new _876.ListNode(4,
                                        new _876.ListNode(5)
                                )
                        )
                )
        );
        head2 = new _876.ListNode(1,
                new _876.ListNode(2,
                        new _876.ListNode(3,
                                new _876.ListNode(4,
                                        new _876.ListNode(5,
                                                new _876.ListNode(6)
                                        )
                                )
                        )
                )
        );
    }

    @Test
    public void test11() {
        assertThat(solution1.middleNode(head1)).isEqualTo(head1.next.next);
    }

    @Test
    public void test12() {
        assertThat(solution1.middleNode(head2)).isEqualTo(head2.next.next.next);
    }
}