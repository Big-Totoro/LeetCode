package io.bigtotoro;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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

    public static class Solution2 {
        public List<String> binaryTreePaths(TreeNode root) {
            if (root == null) {
                return List.of();
            }

            List<String> result = new ArrayList<>();
            Queue<TreeNode> nodeQueue = new LinkedList<>();
            Queue<String> pathQueue = new LinkedList<>();
            nodeQueue.offer(root);
            pathQueue.offer(Integer.toString(root.val));

            while (!nodeQueue.isEmpty()) {
                TreeNode topNode = nodeQueue.poll();
                String pathNode = pathQueue.poll();

                if (topNode.left == null && topNode.right == null) {
                    result.add(pathNode);
                }
                if (topNode.left != null) {
                    nodeQueue.offer(topNode.left);
                    pathQueue.offer(pathNode + "->" + topNode.left.val);
                }
                if (topNode.right != null) {
                    nodeQueue.offer(topNode.right);
                    pathQueue.offer(pathNode + "->" + topNode.right.val);
                }
            }

            return result;
        }
    }
}
