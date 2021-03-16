package io.bigtotoro;

import java.util.Objects;

/**
 * <a href="https://leetcode.com/problems/swapping-nodes-in-a-linked-list/">1721. Swapping Nodes in a Linked List</a>
 */

public class _1721 {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ListNode listNode = (ListNode) o;
            return val == listNode.val;
        }

        @Override
        public int hashCode() {
            return Objects.hash(val);
        }
    }

    public static class Solution1 {
        public ListNode swapNodes(ListNode head, int k) {
            if (head == null) {
                return head;
            }

            ListNode dummy = new ListNode(0, head);
            ListNode slow = dummy;
            ListNode fast = dummy;
            int n = k;

            while (n > 0) {
                fast = fast.next;
                n--;
            }
            ListNode left = fast;

            while (fast != null) {
                slow = slow.next;
                fast = fast.next;
            }

            int temp = left.val;
            left.val = slow.val;
            slow.val = temp;

            return head;
        }
    }
}
