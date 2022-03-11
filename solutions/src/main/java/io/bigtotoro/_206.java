package io.bigtotoro;

/**
 * <a href="https://leetcode.com/problems/reverse-linked-list/">206. Reverse Linked List</a>
 */

public class _206 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static class Solution1 {
        public ListNode reverseList(ListNode head) {
            if (head == null) {
                return null;
            }

            ListNode prev = null;
            ListNode current = head;

            while (current != null) {
                ListNode temp = current.next;
                current.next = prev;
                prev = current;
                current = temp;
            }

            return prev;
        }
    }

    public static class Solution2 {
        public ListNode reverseList(ListNode head) {
            if (head == null) {
                return null;
            }

            return reverse(null, head);
        }

        private ListNode reverse(ListNode prev, ListNode current) {
            if (current == null) {
                return prev;
            }

            ListNode next = current.next;
            current.next = prev;

            return reverse(current, next);
        }
    }
}
