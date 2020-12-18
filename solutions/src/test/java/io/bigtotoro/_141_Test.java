package io.bigtotoro;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _141_Test {

    private static _141.Solution1 solution1 = new _141.Solution1();

    @Test
    public void test11() {
        _141.ListNode head = new _141.ListNode(3);
        _141.ListNode node = new _141.ListNode(2);
        head.next = node;
        node.next = new _141.ListNode(0, new _141.ListNode(-4, node));
        assertThat(solution1.hasCycle(head)).isTrue();
    }

    @Test
    public void test12() {
        _141.ListNode head = new _141.ListNode(1);
        assertThat(solution1.hasCycle(head)).isFalse();
    }
}