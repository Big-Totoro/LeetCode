package io.bigtotoro;

import java.util.Objects;
import java.util.Stack;

/**
 * <a href="https://leetcode.com/problems/trim-a-binary-search-tree/">669. Trim a Binary Search Tree</a>
 */

public class _669 {
    public static class TreeNode {
        int val;
        _669.TreeNode left;
        _669.TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, _669.TreeNode left, _669.TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            _669.TreeNode treeNode = (_669.TreeNode) o;
            return val == treeNode.val;
        }

        @Override
        public int hashCode() {
            return Objects.hash(val);
        }
    }

    public static class Solution1 {
        public TreeNode trimBST(TreeNode root, int low, int high) {
            if (root == null) {
                return null;
            }

            if (root.val < low) {
                return trimBST(root.right, low, high);
            }
            if (root.val > high) {
                return trimBST(root.left, low, high);
            }

            root.left = trimBST(root.left, low, high);
            root.right = trimBST(root.right, low, high);
            return root;
        }
    }

    public static class Solution2 {
        public TreeNode trimBST(TreeNode root, int low, int high) {
            if (root == null) {
                return null;
            }

            Stack<TreeNode> stack = new Stack<>();

            while (root.val < low || root.val > high) {
                if (root.val < low) {
                    root = root.right;
                }
                if (root.val > high) {
                    root = root.left;
                }
            }

            boolean adjusted = false;
            stack.push(root);
            while (!stack.empty()) {
                TreeNode node = stack.pop();

                if (node.left != null && node.left.val < low) {
                    node.left = node.left.right;
                    adjusted = true;
                }
                if (node.right != null && node.right.val > high) {
                    node.right = node.right.left;
                    adjusted = true;
                }
                if (!adjusted) {
                    if (node.left != null) stack.push(node.left);
                    if (node.right != null) stack.push(node.right);
                } else {
                    stack.push(node);
                }
                adjusted = false;
            }

            return root;
        }
    }
}
