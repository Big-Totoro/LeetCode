package io.bigtotoro;

import java.util.Objects;

/**
 * <a href="https://leetcode.com/problems/partition-list/">86. Partition List</a>
 */

public class _86 {

    public static class ListNode {
        int val;
        _86.ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, _86.ListNode next) { this.val = val; this.next = next; }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            _86.ListNode listNode = (_86.ListNode) o;
            return val == listNode.val;
        }

        @Override
        public int hashCode() {
            return Objects.hash(val);
        }
    }

    public static class Solution1 {
        public ListNode partition(ListNode head, int x) {
            if (head == null) {
                return head;
            }

            ListNode left = null;
            ListNode leftHead = null;
            ListNode right = null;
            ListNode rightHead = null;
            ListNode node = head;
            while (node != null) {
                if (node.val < x) {
                    if (left == null) {
                        left = new ListNode(node.val);
                        leftHead = left;
                    } else {
                        left.next = new ListNode(node.val);
                        left = left.next;
                    }
                } else {
                    if (right == null) {
                        right = new ListNode(node.val);
                        rightHead = right;
                    } else {
                        right.next = new ListNode(node.val);
                        right = right.next;
                    }
                }
                node = node.next;
            }

            if (left == null) {
                return rightHead;
            }
            left.next = rightHead;

            return leftHead;
        }
    }
}
