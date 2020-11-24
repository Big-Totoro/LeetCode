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
            boolean nextEquals = false;
            if (listNode.next != null && this.next != null) {
                nextEquals = listNode.next.val == this.next.val;
            }
            return val == listNode.val && nextEquals;
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

            return head;
        }
    }

    public static class Solution2 {

        private int mCounter = 0;
        private int nCounter = 0;

        public ListNode deleteNodes(ListNode head, int m, int n) {
            if (head == null) {
                return head;
            }

            mCounter = m;
            walk(head, m, n);

            return head;
        }

        private ListNode walk(ListNode head, int m, int n) {
            if (head == null) {
                return head;
            }

            mCounter--;
            if (mCounter == 0) {
                nCounter = n;
                return remove(head.next, head, m, n);
            }

            return walk(head.next, m, n);
        }

        private ListNode remove(ListNode head, ListNode prev, int m, int n) {
            if (head == null) {
                return head;
            }

            if (nCounter == 0) {
                mCounter = m;
                prev.next = head;
                return walk(head, m, n);
            }
            nCounter--;

            prev.next = null;

            return remove(head.next, prev, m, n);
        }
    }
}
