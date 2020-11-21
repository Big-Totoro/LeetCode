package io.bigtotoro;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/n-ary-tree-postorder-traversal/">590. N-ary Tree Postorder Traversal</a>
 */

public class _590 {

    public static class Node {
        public int val;
        public List<_590.Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<_590.Node> _children) {
            val = _val;
            children = _children;
        }
    }

    public static class Solution1 {
        public List<Integer> postorder(_590.Node root) {
            if (root == null) {
                return new ArrayList<>();
            }

            List<Integer> result = new ArrayList<>();
            postorder(root, result);

            return result;
        }

        private void postorder(_590.Node root, List<Integer> result) {
            if (root == null) {
                return;
            }

            for (_590.Node node : root.children) {
                postorder(node, result);
            }
            result.add(root.val);
        }
    }

    public static class Solution2 {

        public List<Integer> postorder(_590.Node root) {
            if (root == null) {
                return new ArrayList<>();
            }

            LinkedList<Node> stack = new LinkedList<>();
            LinkedList<Integer> result = new LinkedList<>();
            stack.add(root);
            while(!stack.isEmpty()) {
                _590.Node top = stack.pollLast();
                result.addFirst(top.val);
                stack.addAll(top.children);
            }

            return result;
        }
    }
}
