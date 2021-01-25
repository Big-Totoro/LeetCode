package io.bigtotoro;

import java.util.Arrays;
import java.util.Objects;

/**
 * <a href="https://leetcode.com/problems/merge-k-sorted-lists/">23. Merge k Sorted Lists</a>
 */

public class _23 {

    public static class ListNode {
        int val;
        _23.ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, _23.ListNode next) { this.val = val; this.next = next; }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            _23.ListNode listNode = (_23.ListNode) o;
            return val == listNode.val;
        }

        @Override
        public int hashCode() {
            return Objects.hash(val);
        }
    }

    public static class Solution1 {
        public ListNode mergeKLists(ListNode[] lists) {
            if (lists == null || lists.length == 0) {
                return null;
            }

            ListNode result = merge(lists);

            return result;
        }

        private ListNode merge(ListNode[] linkedLists) {
            if (linkedLists.length < 2) {
                return linkedLists[0];
            }
            int mid = linkedLists.length / 2;

            ListNode[] left = Arrays.copyOfRange(linkedLists, 0, mid);
            ListNode[] right = Arrays.copyOfRange(linkedLists, mid, linkedLists.length);

            ListNode leftList = merge(left);
            ListNode rightList = merge(right);

            return combine(leftList, rightList);
        }

        private ListNode combine(ListNode left, ListNode right) {
            ListNode leftNode = left;
            ListNode rightNode = right;
            ListNode resultHead = null;
            ListNode result = null;
            while (leftNode != null && rightNode != null) {
                if (leftNode.val < rightNode.val) {
                    if (resultHead == null) {
                        resultHead = new ListNode(leftNode.val);
                        result = resultHead;
                    } else {
                        result.next = new ListNode(leftNode.val);
                        result = result.next;
                    }
                    leftNode = leftNode.next;
                } else {
                    if (resultHead == null) {
                        resultHead = new ListNode(rightNode.val);
                        result = resultHead;
                    } else {
                        result.next = new ListNode(rightNode.val);
                        result = result.next;
                    }
                    rightNode = rightNode.next;
                }
            }

            while (leftNode != null) {
                if (resultHead == null) {
                    resultHead = new ListNode(leftNode.val);
                    result = resultHead;
                    leftNode = leftNode.next;
                    continue;
                }
                result.next = new ListNode(leftNode.val);
                leftNode = leftNode.next;
                result = result.next;
            }

            while (rightNode != null) {
                if (resultHead == null) {
                    resultHead = new ListNode(rightNode.val);
                    result = resultHead;
                    rightNode = rightNode.next;
                    continue;
                }
                result.next = new ListNode(rightNode.val);
                rightNode = rightNode.next;
                result = result.next;
            }

            return resultHead;
        }
    }
}