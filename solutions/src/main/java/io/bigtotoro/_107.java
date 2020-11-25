package io.bigtotoro;

import java.util.*;

/**
 * <a href="https://leetcode.com/problems/binary-tree-level-order-traversal-ii/">107. Binary Tree Level Order Traversal II</a>
 */

public class _107 {

    public static class TreeNode {
        int val;
        _107.TreeNode left;
        _107.TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, _107.TreeNode left, _107.TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static class Solution1 {
        public List<List<Integer>> levelOrderBottom(TreeNode root) {
            if (root == null) {
                return List.of();
            }
            List<List<Integer>> result = new ArrayList<>();

            result.add(List.of(root.val));
            traverse(root, 0, result);

            Collections.reverse(result);

            return result;
        }

        private void traverse(TreeNode root, int level, List<List<Integer>> result) {
            if (root == null) {
                return;
            }

            if ((result.size() <= level + 1) && (root.left != null || root.right != null)) {
                List<Integer> nodes = new ArrayList<>();
                result.add(nodes);
            }
            if (root.left != null) {
                result.get(level + 1).add(root.left.val);
            }
            if (root.right != null) {
                result.get(level + 1).add(root.right.val);
            }
            traverse(root.left, level + 1, result);
            traverse(root.right, level + 1, result);
        }
    }

    public static class Solution2 {
        public List<List<Integer>> levelOrderBottom(TreeNode root) {
            if (root == null) {
                return List.of();
            }
            LinkedList<List<Integer>> result = new LinkedList<>();
            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            while (!queue.isEmpty()) {
                int size = queue.size();
                List<Integer> level = new ArrayList<>();
                for (int i = 0; i < size; ++i) {
                    TreeNode top = queue.poll();
                    level.add(top.val);

                    if (top.left != null) {
                        queue.offer(top.left);
                    }
                    if (top.right != null) {
                        queue.offer(top.right);
                    }
                }
                result.addFirst(level);
            }

            return result;
        }
    }
}
