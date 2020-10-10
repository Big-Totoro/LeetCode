package io.bigtotoro;

import java.util.Stack;

/**
 * <a href="https://leetcode.com/problems/range-sum-of-bst/">938. Range Sum of BST</a>
 */

public class _938 {
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
    }

    public static class Solution1 {
        public int rangeSumBST(TreeNode root, int L, int R) {
            return bfs(root, L, R);
        }

        private int bfs(TreeNode root, int L, int R) {
            if (root == null) {
                return 0;
            }

            int sum = 0;
            Stack<TreeNode> stack = new Stack<>();
            stack.push(root);

            while (!stack.empty()) {
                TreeNode top = stack.pop();
                if (top != null) {
                    if ((top.val >= L) && (top.val <= R)) {
                        sum += top.val;
                    }
                    if ((top.left != null) && (top.val >= L)) {
                        stack.push(top.left);
                    }
                    if ((top.right != null) && (top.val <= R)) {
                        stack.push(top.right);
                    }
                }
            }

            return sum;
        }
    }

    public static class Solution2 {
        private int sum;

        public int rangeSumBST(TreeNode root, int L, int R) {
            dfs(root, L, R);

            return sum;
        }

        private void dfs(TreeNode root, int L, int R) {
            if (root != null) {
                if ((root.val >= L) && (root.val <= R)) {
                    sum += root.val;
                    dfs(root.right, L, R);
                    dfs(root.left, L, R);
                } else if (root.val < L) {
                    dfs(root.right, L, R);
                } else {
                    dfs(root.left, L, R);
                }
            }
        }
    }
}