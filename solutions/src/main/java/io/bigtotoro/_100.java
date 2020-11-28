package io.bigtotoro;

/**
 * <a href="https://leetcode.com/problems/same-tree/">100. Same Tree</a>
 */

public class _100 {

    public static class TreeNode {
        int val;
        _100.TreeNode left;
        _100.TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, _100.TreeNode left, _100.TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static class Solution1 {
        public boolean isSameTree(TreeNode p, TreeNode q) {
            if (p == null && q == null) {
                return true;
            } else if (p == null || q == null) {
                return false;
            }

            if (p.val != q.val) {
                return false;
            }

            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
    }
}
