package io.bigtotoro;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _83_Test {

    private static final _83.Solution1 SOLUTION_1 = new _83.Solution1();

    @Test
    public void test11() {
        assertThat(SOLUTION_1.deleteDuplicates(
                new _83.ListNode(1,
                        new _83.ListNode(1,
                                new _83.ListNode(2)
                        )
                )
        )).isEqualTo(new _83.ListNode(1, new _83.ListNode(2)));
    }

    @Test
    public void test12() {
        assertThat(SOLUTION_1.deleteDuplicates(
                new _83.ListNode(1,
                        new _83.ListNode(1,
                                new _83.ListNode(2,
                new _83.ListNode(3,
                        new _83.ListNode(3)
                )
                                )
                        )
                )
        )).isEqualTo(new _83.ListNode(1, new _83.ListNode(2, new _83.ListNode(3))));
    }

    @Test
    public void test13() {
        assertThat(SOLUTION_1.deleteDuplicates(
                new _83.ListNode(1,
                        new _83.ListNode(1,
                                new _83.ListNode(1)
                        )
                )
        )).isEqualTo(new _83.ListNode(1));
    }
}
