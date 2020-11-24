package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _1474_Test {

    private static _1474.Solution1 solution1;
    private static _1474.Solution2 solution2;

    private static _1474.ListNode head1;
    private static _1474.ListNode expected1;
    private static _1474.ListNode head2;
    private static _1474.ListNode expected2;
    private static _1474.ListNode head3;
    private static _1474.ListNode expected3;
    private static _1474.ListNode head4;
    private static _1474.ListNode expected4;

    @BeforeClass
    public static void setup() {
        solution1 = new _1474.Solution1();
        solution2 = new _1474.Solution2();

        head1 = new _1474.ListNode(1,
                new _1474.ListNode(2,
                        new _1474.ListNode(3,
                                new _1474.ListNode(4,
                                        new _1474.ListNode(5,
                                                new _1474.ListNode(6,
                                                        new _1474.ListNode(7,
                                                                new _1474.ListNode(8,
                                                                        new _1474.ListNode(9,
                                                                                new _1474.ListNode(10,
                                                                                        new _1474.ListNode(11,
                                                                                                new _1474.ListNode(12,
                                                                                                        new _1474.ListNode(13)
                                                                                                )
                                                                                        )
                                                                                )
                                                                        )
                                                                )
                                                        )
                                                )
                                        )
                                )
                        )
                )
        );

        expected1 = new _1474.ListNode(1,
                new _1474.ListNode(2,
                        new _1474.ListNode(6,
                                new _1474.ListNode(7,
                                        new _1474.ListNode(11,
                                                new _1474.ListNode(12))
                                )
                        )
                )
        );

        head2 = new _1474.ListNode(1,
                new _1474.ListNode(2,
                        new _1474.ListNode(3,
                                new _1474.ListNode(4,
                                        new _1474.ListNode(5,
                                                new _1474.ListNode(6,
                                                        new _1474.ListNode(7,
                                                                new _1474.ListNode(8,
                                                                        new _1474.ListNode(9,
                                                                                new _1474.ListNode(10,
                                                                                        new _1474.ListNode(11)
                                                                                        )
                                                                                )
                                                                        )
                                                                )
                                                        )
                                                )
                                        )
                                )
                        )
                );

        expected2 = new _1474.ListNode(1,
                new _1474.ListNode(5,
                    new _1474.ListNode(9)
                )
            );


        head3 = new _1474.ListNode(1,
                new _1474.ListNode(2,
                        new _1474.ListNode(3,
                                new _1474.ListNode(4,
                                        new _1474.ListNode(5,
                                                new _1474.ListNode(6,
                                                        new _1474.ListNode(7,
                                                                new _1474.ListNode(8,
                                                                        new _1474.ListNode(9,
                                                                                new _1474.ListNode(10,
                                                                                        new _1474.ListNode(11,
                                                                                                new _1474.ListNode(12,
                                                                                                        new _1474.ListNode(13)
                                                                                                )
                                                                                        )
                                                                                )
                                                                        )
                                                                )
                                                        )
                                                )
                                        )
                                )
                        )
                )
        );

        expected3 = new _1474.ListNode(1,
                new _1474.ListNode(2,
                        new _1474.ListNode(3,
                                new _1474.ListNode(5,
                                        new _1474.ListNode(6,
                                                new _1474.ListNode(7,
                                                        new _1474.ListNode(9,
                                                                new _1474.ListNode(10,
                                                                        new _1474.ListNode(11)
                                                                )
                                                        )
                                                )
                                        )
                                )
                        )
                )
        );

        head4 = new _1474.ListNode(9,
                new _1474.ListNode(3,
                        new _1474.ListNode(7,
                                new _1474.ListNode(7,
                                        new _1474.ListNode(9,
                                                new _1474.ListNode(10,
                                                        new _1474.ListNode(8,
                                                                new _1474.ListNode(2)
                                                                )
                                                        )
                                                )
                                        )
                                )
                        )
                );

        expected4 = new _1474.ListNode(9,
                new _1474.ListNode(7,
                        new _1474.ListNode(8)
                        )
                );
    }

    @Test
    public void test11() {
        assertThat(solution1.deleteNodes(head1, 2, 3)).isEqualTo(expected1);
    }

    @Test
    public void test12() {
        assertThat(solution1.deleteNodes(head2, 1, 3)).isEqualTo(expected2);
    }

    @Test
    public void test13() {
        assertThat(solution1.deleteNodes(head3, 3, 1)).isEqualTo(expected3);
    }

    @Test
    public void test14() {
        assertThat(solution1.deleteNodes(head4, 1, 2)).isEqualTo(expected4);
    }


    @Test
    public void test20() {
        _1474.ListNode head = new _1474.ListNode(1, new _1474.ListNode(2));
        assertThat(solution2.deleteNodes(head, 1, 1)).isEqualTo(new _1474.ListNode(1));
    }

    @Test
    public void test21() {
        assertThat(solution2.deleteNodes(head1, 2, 3)).isEqualTo(expected1);
    }

    @Test
    public void test22() {
        assertThat(solution2.deleteNodes(head2, 1, 3)).isEqualTo(expected2);
    }

    @Test
    public void test23() {
        assertThat(solution2.deleteNodes(head3, 3, 1)).isEqualTo(expected3);
    }

    @Test
    public void test24() {
        assertThat(solution2.deleteNodes(head4, 1, 2)).isEqualTo(expected4);
    }
}
