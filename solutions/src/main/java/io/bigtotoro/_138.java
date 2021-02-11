package io.bigtotoro;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/copy-list-with-random-pointer/">138. Copy List with Random Pointer</a>
 */

public class _138 {

    public static class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }

        public Node(int val, Node next, Node random) {
            this.val = val;
            this.next = next;
            this.random = random;
        }
    }

    public static class Solution1 {
        public Node copyRandomList(Node head) {
            if (head == null) {
                return head;
            }

            Map<Node, Node> map = new HashMap<>();
            Node node = head;
            Node dummy = new Node(-1);
            Node newHead = dummy;
            while (node != null) {
                if (map.containsKey(node)) {
                    dummy.next = map.get(node);
                } else {
                    dummy.next = new Node(node.val);
                    map.put(node, dummy.next);
                }
                node = node.next;
                dummy = dummy.next;
            }

            node = head;
            dummy = newHead;
            while (node != null) {
                if (map.containsKey(node.random)) {
                    dummy.next.random = map.get(node.random);
                }

                node = node.next;
                dummy = dummy.next;
            }

            return newHead.next;
        }
    }
}
