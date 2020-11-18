package io.bigtotoro;

import java.util.Objects;

/**
 * <a href="https://leetcode.com/problems/univalued-binary-tree/">965. Univalued Binary Tree</a>
 */

public class _965 {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
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
        public boolean isUnivalTree(TreeNode root) {
            if (root == null) {
                return true;
            }

            boolean expected = (root.left == null) || root.val == root.left.val;
            expected = expected && (root.right == null ||  (root.val == root.right.val));
            if (expected == false) {
                return false;
            }

            return expected && isUnivalTree(root.left) && isUnivalTree(root.right);
        }
    }
}
