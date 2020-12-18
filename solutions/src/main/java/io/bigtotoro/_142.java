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
        public ListNode hasCycle(_142.ListNode head) {
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
}
