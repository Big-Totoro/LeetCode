package io.bigtotoro;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _23_Test {

    private static final _23.Solution1 SOLUTION_1 = new _23.Solution1();

    @Test
    public void test11() {
        assertThat(SOLUTION_1.mergeKLists(
                new _23.ListNode[]{
                new _23.ListNode(1, new _23.ListNode(5, new _23.ListNode(5))),
                new _23.ListNode(1, new _23.ListNode(3, new _23.ListNode(4))),
                new _23.ListNode(2, new _23.ListNode(6))
        })).isEqualTo(
                new _23.ListNode(1,
                        new _23.ListNode(1,
                                new _23.ListNode(2,
                                        new _23.ListNode(3,
                                                new _23.ListNode(4,
                                                        new _23.ListNode(4,
                                                                new _23.ListNode(5,
                                                                        new _23.ListNode(6)
                                                                )
                                                        )
                                                )
                                        )
                                )
                        )
                )
        );
    }

    @Test
    public void test12() {
        assertThat(SOLUTION_1.mergeKLists(new _23.ListNode[]{}))
            .isEqualTo(null);
    }

    @Test
    public void test13() {
        assertThat(SOLUTION_1.mergeKLists(new _23.ListNode[]{null, new _23.ListNode(1)}))
            .isEqualTo(new _23.ListNode(1));
    }
}
