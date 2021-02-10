package io.bigtotoro;

/**
 * <a href="https://leetcode.com/problems/convert-bst-to-greater-tree/">538. Convert BST to Greater Tree</a>
 */

public class _538 {

    public static class TreeNode {
        int val;
        _538.TreeNode left;
        _538.TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, _538.TreeNode left, _538.TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static class Solution1 {

        private int sum = 0;

        public TreeNode convertBST(TreeNode root) {
            if (root == null) {
                return root;
            }

            convertBST(root.right);
            sum += root.val;
            root.val = sum;
            convertBST(root.left);

            return root;
        }
    }
}
