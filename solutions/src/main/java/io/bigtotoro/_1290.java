package io.bigtotoro;

/**
 * <a href="https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/">1290. Convert Binary Number in a Linked List to Integer</a>
 */

public class _1290 {
    public static class Solution1 {
        public static class ListNode {
            int val;
            ListNode next;
            ListNode() {}
            ListNode(int val) { this.val = val; }
            ListNode(int val, ListNode next) { this.val = val; this.next = next; }
        }

        public int getDecimalValue(ListNode head) {
            int result = head.val;

            while (head.next != null) {
                result <<= 1;
                result |= head.next.val;

                head = head.next;
            }

            return result;
        }
    }
}
