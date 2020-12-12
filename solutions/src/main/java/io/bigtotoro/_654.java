package io.bigtotoro;

/**
 * <a href="https://leetcode.com/problems/maximum-binary-tree/">654. Maximum Binary Tree</a>
 */

public class _654 {

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
        public TreeNode constructMaximumBinaryTree(int[] nums) {
            return construct(nums, 0, nums.length);
        }

        private TreeNode construct(int[] nums, int l, int r) {
            if (l == r) {
                return null;
            }

            int max_i = l;
            for (int i = l; i < r; ++i) {
                if (nums[max_i] < nums[i]) {
                    max_i = i;
                }
            }

            TreeNode root = new TreeNode(nums[max_i]);
            root.left = construct(nums, l, max_i);
            root.right = construct(nums, max_i + 1, r);

            return root;
        }
    }
}
