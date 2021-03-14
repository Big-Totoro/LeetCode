package io.bigtotoro;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _1721_Test {

    private static final _1721.Solution1 SOLUTION_1 = new _1721.Solution1();

    @Test
    public void test11() {
        assertThat(SOLUTION_1.swapNodes(new _1721.ListNode(1, new _1721.ListNode(2, new _1721.ListNode(3,
                new _1721.ListNode(4, new _1721.ListNode(5))))), 2));
    }
}
