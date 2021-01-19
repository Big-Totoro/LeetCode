package io.bigtotoro;

import java.util.Objects;

public class _160 {

    public static class ListNode {
        int val;
        _160.ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, _160.ListNode next) { this.val = val; this.next = next; }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            _160.ListNode listNode = (_160.ListNode) o;
            return val == listNode.val;
        }

        @Override
        public int hashCode() {
            return Objects.hash(val);
        }
    }

    public static class Solution1 {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            if (headA == null || headB == null) {
                return null;
            }

            /**
             * Count the list A size
             */
            ListNode node = headA;
            int lenA = 0;
            while (node != null) {
                node = node.next;
                lenA++;
            }

            /**
             * Count the list B size
             */
            node = headB;
            int lenB = 0;
            while (node != null) {
                node = node.next;
                lenB++;
            }

            /**
             * Skip a few first nodes in the longest list to set the start pointer to
             * the equal distance from the end of the lists.
             */
            ListNode startNode1 = (lenA >= lenB) ? headA : headB;
            int counter = Math.abs(lenA - lenB);
            while (counter > 0) {
                startNode1 = startNode1.next;
                counter--;
            }

            /**
             * Set the pointer of the shortest list to the head
             */
            ListNode startNode2 = (lenA < lenB) ? headA : headB;

            while (startNode1 != null && startNode2 != null) {
                if (startNode1 == startNode2) {
                    return startNode1;
                }
                startNode1 = startNode1.next;
                startNode2 = startNode2.next;
            }

            return null;
        }
    }
}
