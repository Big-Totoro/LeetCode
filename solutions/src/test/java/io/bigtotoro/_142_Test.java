package io.bigtotoro;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _142_Test {

    private static _142.Solution1 solution1 = new _142.Solution1();
    private static _142.Solution2 solution2 = new _142.Solution2();

    @Test
    public void test11() {
        _142.ListNode head = new _142.ListNode(3);
        _142.ListNode node = new _142.ListNode(2);
        head.next = node;
        node.next = new _142.ListNode(0, new _142.ListNode(-4, node));
        assertThat(solution1.detectCycle(head)).isEqualTo(new _142.ListNode(2));
    }

    @Test
    public void test12() {
        _142.ListNode head = new _142.ListNode(1);
        assertThat(solution1.detectCycle(head)).isEqualTo(null);
    }

    @Test
    public void test21() {
        _142.ListNode head = new _142.ListNode(3);
        _142.ListNode node = new _142.ListNode(2);
        head.next = node;
        node.next = new _142.ListNode(0, new _142.ListNode(-4, node));
        assertThat(solution2.detectCycle(head)).isEqualTo(new _142.ListNode(2));
    }

    @Test
    public void test22() {
        _142.ListNode head = new _142.ListNode(1);
        assertThat(solution2.detectCycle(head)).isEqualTo(null);
    }
}
