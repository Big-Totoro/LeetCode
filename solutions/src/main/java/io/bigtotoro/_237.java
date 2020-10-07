package io.bigtotoro;

/**
 * <a href="https://leetcode.com/problems/delete-node-in-a-linked-list/">237. Delete Node in a Linked List</a>
 */

public class _237 {
    public static class ListNode {
        int val;
        ListNode next;

        public ListNode(int x) { val = x; }
    }

    public static class Solution1 {
        public void deleteNode(ListNode node) {
            node.val = node.next.val;
            node.next = node.next.next;
        }
    }
}
