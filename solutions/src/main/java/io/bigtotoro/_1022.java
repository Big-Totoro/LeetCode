package io.bigtotoro;

/**
 * <a href="https://leetcode.com/problems/sum-of-root-to-leaf-binary-numbers/">Sum of Root To Leaf Binary Numbers</a>
 */

public class _1022 {

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
        private int treeResult = 0;

        public int sumRootToLeaf(TreeNode root) {
            if (root == null) {
                return 0;
            }

            treeResult = 0;
            sum(root, 0);

            return treeResult;
        }

        private void sum(TreeNode root, int value) {
            if (root == null) {
                return;
            }

            value = (value << 1) | root.val;

            if (root.left == null && root.right == null) {
                treeResult += value;
            }
            sum(root.left, value);
            sum(root.right, value);
        }
    }
}
