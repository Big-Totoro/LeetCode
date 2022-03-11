package io.bigtotoro;

import com.sun.source.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;
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
        private int sum = 0;

        public int rangeSumBST(TreeNode root, int L, int R) {
            return bfs(root, L, R);
        }

        private int bfs(TreeNode root, int L, int R) {
            if (root == null) {
                return 0;
            }

            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            while (!queue.isEmpty()) {
                TreeNode top = queue.poll();
                if (top.val >= L && top.val <= R) {
                    sum += top.val;
                }
                if (top.left != null) {
                    queue.add(top.left);
                }
                if (top.right != null) {
                    queue.add(top.right);
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
            if (root == null) {
                return;
            }

            if (root.val >= L && root.val <= R) {
                sum += root.val;
            }

            dfs(root.left, L, R);
            dfs(root.right, L, R);
        }
    }
}