package io.bigtotoro;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/leaf-similar-trees/">872. Leaf-Similar Trees</a>
 */

public class _872 {
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
        public boolean leafSimilar(TreeNode root1, TreeNode root2) {
            List<Integer> array1 = new ArrayList<>();
            List<Integer> array2 = new ArrayList<>();

            compare(root1, array1);
            compare(root2, array2);

            boolean result = array1.equals(array2);

            return result;
        }

        private void compare(TreeNode root, List<Integer> array) {
            if (root == null) {
                return;
            }

            if (root.left == null && root.right == null) {
                array.add(root.val);
            }
            compare(root.left, array);
            compare(root.right, array);
        }
    }
}
