package io.bigtotoro;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * <a href="https://leetcode.com/problems/find-all-the-lonely-nodes/">1469. Find All The Lonely Nodes</a>
 */

public class _1469 {
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
        public List<Integer> getLonelyNodes(TreeNode root) {
            List<Integer> result = new ArrayList<>();

            dfs(result, root);

            return result;
        }
    }

    private static void dfs(List<Integer> result, TreeNode root) {
        if (root == null) {
            return;
        }

        if (root.right != null && root.left != null) {
            dfs(result, root.left);
            dfs(result, root.right);
        } else if (root.left != null) {
            dfs(result, root.left);
            result.add(root.left.val);
        } else if (root.right != null) {
            dfs(result, root.right);
            result.add(root.right.val);
        }
    }

    public static class Solution2 {
        public List<Integer> getLonelyNodes(TreeNode root) {
            if (root == null) {
                return List.of();
            }
            List<Integer> result = new ArrayList<>();
            Stack<TreeNode> stack = new Stack<>();

            stack.push(root);
            while (!stack.empty()) {
                TreeNode top = stack.pop();

                if (top.left != null) {
                    stack.push(top.left);
                    if (top.right == null) {
                        result.add(top.left.val);
                    }
                }

                if (top.right != null) {
                    stack.push(top.right);
                    if (top.left == null) {
                        result.add(top.right.val);
                    }
                }
            }

            return result;
        }
    }
}
