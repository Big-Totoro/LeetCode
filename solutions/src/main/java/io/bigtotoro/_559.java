package io.bigtotoro;

import java.util.List;

/**
 * <a href="https://leetcode.com/problems/maximum-depth-of-n-ary-tree/">559. Maximum Depth of N-ary Tree</a>
 */

public class _559 {
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
        public int maxDepth(Node root) {
            if (root == null) {
                return 0;
            }

            int depth = 0;

            depth += inDepth(root);

            return depth;
        }

        private int inDepth(Node node) {
            if (node == null) {
                return 0;
            }

            int depth = 0;

            if  (node.children != null) {
                for (Node n : node.children) {
                    depth = Math.max(depth, inDepth(n));
                }
            }

            return 1 + depth;
        }
    }
}
