package io.bigtotoro;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * <a href="https://leetcode.com/problems/linked-list-cycle-ii/">142. Linked List Cycle II</a>
 */

public class _142 {

    public static class ListNode {
        int val;
        _142.ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }

        ListNode(int x, _142.ListNode next) {
            val = x;
            this.next = next;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            _142.ListNode listNode = (_142.ListNode) o;
            return val == listNode.val;
        }

        @Override
        public int hashCode() {
            return Objects.hash(val);
        }
    }

    public static class Solution1 {
        public ListNode detectCycle(_142.ListNode head) {
            Set<ListNode> set = new HashSet<>();
            while (head != null) {
                if (!set.add(head)) {
                    return head;
                }
                head = head.next;
            }

            return null;
        }
    }

    /**
     * Floyd's Tortoise and Hare algorithm
     */
    public static class Solution2 {
        public ListNode detectCycle(_142.ListNode head) {
            ListNode tortoise = head;
            ListNode hare = head;

            /**
             * Looking for the cycle.
             */
            boolean cycle = false;
            while (hare != null && hare.next != null) {
                tortoise = tortoise.next;
                hare = hare.next.next;
                if (tortoise == hare) {
                    cycle = true;
                    break;
                }
            }

            /**
             * Move the tortoise to the beginning of the list and then move tortoise and hare step by step further
             * until they meet. The point of meet will be the first cycle element.
             */
            if (cycle) {
                hare = head;
                while (hare != tortoise) {
                    hare = hare.next;
                    tortoise = tortoise.next;
                }
            } else {
                return null;
            }

            return hare;
        }
    }
}
