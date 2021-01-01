package io.bigtotoro;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/cheapest-flights-within-k-stops/">787. Cheapest Flights Within K Stops</a>
 */

public class _257 {
    public static class TreeNode {
        int val;
        _257.TreeNode left;
        _257.TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, _257.TreeNode left, _257.TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static class Solution1 {
        public List<String> binaryTreePaths(TreeNode root) {
            if (root == null) {
                return List.of();
            }

            List<String> result = new ArrayList<>();
            dfs(root, "", result);

            return result;
        }

        private void dfs(TreeNode root, String path, List<String> result) {
            if (root != null) {
                path += Integer.toString(root.val);
                if (root.left == null && root.right == null) {
                    result.add(path);
                } else {
                    path += "->";
                    dfs(root.left, path, result);
                    dfs(root.right, path, result);
                }
            }
        }
    }
}
