package io.bigtotoro;

/**
 * <a href="https://leetcode.com/problems/maximum-depth-of-binary-tree/">104. Maximum Depth of Binary Tree</a>
 */

public class _104 {
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
    }

    public static class Solution1 {
        public int depth;

        public int maxDepth(TreeNode root) {
            bfs(root);
            return depth;
        }

        private void bfs(TreeNode root) {

        }
    }

    public static class Solution2 {
        public int depth;

        public int maxDepth(TreeNode root) {
            return depth;
        }

        private void dfs(TreeNode root) {

        }
    }
}