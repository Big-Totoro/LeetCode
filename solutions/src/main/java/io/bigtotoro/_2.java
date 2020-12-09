package io.bigtotoro;

import org.w3c.dom.NodeList;

import java.util.Objects;

/**
 * <a href="https://leetcode.com/problems/add-two-numbers/">2. Add Two Numbers</a>
 */

public class _2 {

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
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            if (l1 == null || l2 == null) {
                return null;
            }

            ListNode head = null;
            ListNode node = null;
            int carry = 0;
            while (l1 != null && l2 != null) {
                int result = l1.val + l2.val + carry;
                carry = result > 9 ? 1 : 0;
                result = (carry > 0) ? result % 10 : result;
                if (node == null) {
                    node = new ListNode(result);
                    head = node;
                } else {
                    node.next = new ListNode(result);
                    node = node.next;
                }
                l1 = l1.next;
                l2 = l2.next;
            }

            ListNode l = (l1 == null) ? l2 : l1;
            while (l != null) {
                int result = l.val + carry;
                carry = result > 9 ? 1 : 0;
                result = (carry > 0) ? result % 10 : result;
                node.next = new ListNode(result);
                node = node.next;
                l = l.next;
            }

            if (carry > 0) {
                node.next = new ListNode(1);
            }

            return head;
        }
    }
}
