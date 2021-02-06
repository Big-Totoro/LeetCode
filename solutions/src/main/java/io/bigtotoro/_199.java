package io.bigtotoro;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/binary-tree-right-side-view/">199. Binary Tree Right Side View</a>
 */

public class _199 {

    public static class TreeNode {
        int val;
        _199.TreeNode left;
        _199.TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, _199.TreeNode left, _199.TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static class Solution1 {
        public List<Integer> rightSideView(TreeNode root) {
            if (root == null) {
                return List.of();
            }

            List<Integer> result = new ArrayList<>();
            dfs(root, 0, result);

            return result;
        }

        private void dfs(TreeNode root, int level, List<Integer> result) {
            if (root == null) {
                return;
            }

            if (level == result.size()) {
                result.add(root.val);
            }

            dfs(root.right, level + 1, result);
            dfs(root.left, level + 1, result);
        }
    }
}
