package io.bigtotoro;

import java.util.Objects;

/**
 * <a href="https://leetcode.com/problems/linked-list-cycle/">141. Linked List Cycle</a>
 */

public class _141 {

     public static class ListNode {
         int val;
         ListNode next;
         ListNode(int x) {
             val = x;
             next = null;
         }

         ListNode(int x, ListNode next) {
             val = x;
             this.next = next;
         }

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
        public boolean hasCycle(ListNode head) {
            ListNode fast = head;
            ListNode slow = head;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
                if (slow == fast) {
                    return true;
                }
            }

            return false;
        }
    }
}