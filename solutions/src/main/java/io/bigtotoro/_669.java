package io.bigtotoro;

import java.util.Objects;

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
}
