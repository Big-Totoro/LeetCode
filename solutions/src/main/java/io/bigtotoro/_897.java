package io.bigtotoro;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Stack;

/**
 * <a href="https://leetcode.com/problems/increasing-order-search-tree/">897. Increasing Order Search Tree</a>
 */

public class _897 {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            TreeNode treeNode = (TreeNode) o;
            return val == treeNode.val;
        }

        @Override
        public int hashCode() {
            return Objects.hash(val);
        }
    }

    public static class Solution1 {
        public TreeNode increasingBST(TreeNode root) {
            Stack<TreeNode> stack = new Stack<>();
            TreeNode current = root;
            TreeNode newRoot = null;
            TreeNode prev = null;

            while (!stack.empty() || current != null) {
                while (current != null) {
                    stack.push(current);
                    current = current.left;
                }

                current = stack.pop();
                if (newRoot == null) {
                    newRoot = current;
                }

                if (prev != null) {
                    prev.right = current;
                    current.left = null;
                }

                prev = current;
                current = current.right;
            }

            return newRoot;
        }
    }

    public static class Solution2 {
        public TreeNode increasingBST(TreeNode root) {
            if (root == null) {
                return null;
            }

            List<TreeNode> array = new ArrayList<>();
            traverse(root, array);

            TreeNode newRoot = array.get(0);
            TreeNode node = newRoot;
            for(int i = 1; i < array.size(); ++i) {
                node.right = array.get(i);
                node.left = null;
                node = node.right;
            }

            return newRoot;
        }

        public void traverse(TreeNode root, List<TreeNode> array) {
            if (root == null) {
                return;
            }

            traverse(root.left, array);
            array.add(root);
            traverse(root.right, array);
        }
    }
}