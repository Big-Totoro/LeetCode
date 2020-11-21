package io.bigtotoro;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * <a href="https://leetcode.com/problems/n-ary-tree-preorder-traversal/">589. N-ary Tree Preorder Traversal</a>
 */

public class _589 {
    public static class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    public static class Solution1 {
        public List<Integer> preorder(Node root) {
            if (root == null) {
                return new ArrayList<>();
            }

            List<Integer> result = new ArrayList<>();
            preorder(root, result);

            return result;
        }

        private void preorder(Node root, List<Integer> result) {
            if (root == null) {
                return;
            }

            result.add(root.val);
            for (Node node : root.children) {
                preorder(node, result);
            }
        }
    }

    public static class Solution2 {
        public List<Integer> preorder(Node root) {
            if (root == null) {
                return new ArrayList<>();
            }

            Stack<Node> stack = new Stack<>();
            List<Integer> result = new ArrayList<>();
            stack.push(root);
            while(!stack.empty()) {
                Node top = stack.pop();
                result.add(top.val);
                for (int i = top.children.size() - 1; i >= 0; --i) {
                    stack.push(top.children.get(i));
                }
            }

            return result;
        }
    }
}
