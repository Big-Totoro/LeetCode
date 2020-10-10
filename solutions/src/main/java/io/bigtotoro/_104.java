package io.bigtotoro;

import java.util.Stack;

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
        private int depth;

        public int maxDepth(TreeNode root) {
            iteration(root);
            return depth;
        }

        private void iteration(TreeNode root) {
            if (root != null) {
                Stack<TreeNode> stack = new Stack<>();
                Stack<Integer> depths = new Stack<>();
                stack.push(root);
                depths.push(1);
                while (!stack.empty()) {
                    TreeNode top = stack.pop();
                    Integer current = depths.pop();
                    if (top != null) {
                        depth = Math.max(depth, current);

                        stack.push(top.left);
                        stack.push(top.right);
                        depths.push(current + 1);
                        depths.push(current + 1);
                    }
                }
            }
        }
    }

    public static class Solution2 {
        public int maxDepth(TreeNode root) {
            if (root == null) {
                return 0;
            }

            int left = maxDepth(root.left);
            int right = maxDepth(root.right);

            return Math.max(left, right) + 1;
        }
    }
}