package io.bigtotoro;

import java.util.Objects;

/**
 * <a href="https://leetcode.com/problems/palindrome-linked-list/">234. Palindrome Linked List</a>
 */

public class _234 {

    public static class ListNode {
        int val;
        _234.ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, _234.ListNode next) { this.val = val; this.next = next; }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            _234.ListNode listNode = (_234.ListNode) o;
            return val == listNode.val;
        }

        @Override
        public int hashCode() {
            return Objects.hash(val);
        }
    }

    public static class Solution1 {

        private boolean isPalindrome = true;

        public boolean isPalindrome(ListNode head) {
            if (head == null) {
                return true;
            }

            helper(head, head);

            return isPalindrome;
        }

        private ListNode helper(ListNode leftNode, ListNode rightNode) {
            if (rightNode == null || !isPalindrome) {
                return leftNode;
            }

            leftNode = helper(leftNode, rightNode.next);
            if (leftNode.val != rightNode.val) {
                isPalindrome = false;
            }

            return leftNode.next;
        }
    }
}
