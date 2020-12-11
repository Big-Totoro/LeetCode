package io.bigtotoro;

/**
 * <a href="https://leetcode.com/problems/print-immutable-linked-list-in-reverse/">1265. Print Immutable Linked List in Reverse</a>
 */

 interface ImmutableListNode {
     void printValue(); // print the value of this node.
     ImmutableListNode getNext(); // return the next node.
 };

public class _1265 {
    public static class Solution1 {
        public void printLinkedListInReverse(ImmutableListNode head) {
            if (head == null) {
                return;
            }

            printLinkedListInReverse(head.getNext());
            head.printValue();
        }
    }
}
