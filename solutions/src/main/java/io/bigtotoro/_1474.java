package io.bigtotoro;

import java.util.Objects;

/**
 * <a href="https://leetcode.com/problems/delete-n-nodes-after-m-nodes-of-a-linked-list/">1474. Delete N Nodes After M Nodes of a Linked List</a>
 */

public class _1474 {

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
        public ListNode deleteNodes(ListNode head, int m, int n) {
            ListNode prev = head;
            ListNode node = head;

            while (node != null) {
                int mCounter = m;
                int nCounter = n;

                while (node != null && mCounter > 0) {
                    prev = node;
                    node = node.next;
                    --mCounter;
                }
                while (node != null && nCounter > 0) {
                    node = node.next;
                    --nCounter;
                }

                prev.next = node;
            }

            return head;        }
    }
}
