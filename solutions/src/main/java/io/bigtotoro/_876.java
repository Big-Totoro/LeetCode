package io.bigtotoro;

/**
 * <a href="https://leetcode.com/problems/middle-of-the-linked-list/">Middle of the Linked List</a>
 */

public class _876 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static class Solution1 {
        public ListNode middleNode(ListNode head) {
            if ((head == null) || (head.next == null)) {
                return head;
            }

            ListNode fast = head;
            ListNode slow = head;

            while ((fast != null) && (fast.next != null)) {
                slow = slow.next;
                fast = fast.next.next;
            }

            return slow;
        }
    }
}