package io.bigtotoro;

import java.util.Stack;

/**
 * <a href="https://leetcode.com/problems/sum-of-root-to-leaf-binary-numbers/">Sum of Root To Leaf Binary Numbers</a>
 */

public class _1022 {

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
        private int treeResult = 0;

        public int sumRootToLeaf(TreeNode root) {
            if (root == null) {
                return 0;
            }

            treeResult = 0;
            sum(root, 0);

            return treeResult;
        }

        private void sum(TreeNode root, int value) {
            if (root == null) {
                return;
            }

            value = (value << 1) | root.val;

            if (root.left == null && root.right == null) {
                treeResult += value;
            }
            sum(root.left, value);
            sum(root.right, value);
        }
    }

    public static class Solution2 {
        public static class Pair<U extends TreeNode, V extends Number> {
            private U root;
            private V number;

            public Pair(U root, V number) {
                this.root = root;
                this.number = number;
            }

            public static <U extends TreeNode, V extends Number> Pair<U, V> valueOf(U root, V number) {
                return new Pair<>(root, number);
            }

            public U getRoot() {
                return root;
            }

            public V getNumber() {
                return number;
            }
        }

        public int sumRootToLeaf(TreeNode root) {
            if (root == null) {
                return 0;
            }

            int treeResult = 0;
            int result = 0;
            Stack<Pair<TreeNode, Integer>> stack = new Stack<>();
            stack.push(Pair.valueOf(root, 0));
            while (!stack.empty()) {
                Pair<TreeNode, Integer> top = stack.pop();
                TreeNode node = top.getRoot();
                result = top.getNumber();

                result = (result << 1) | node.val;

                if (node.left != null) {
                    stack.push(Pair.valueOf(node.left, result));
                }
                if (node.right != null) {
                    stack.push(Pair.valueOf(node.right, result));
                }
                if (node.left == null && node.right == null) {
                    treeResult += result;
                }
            }

            return treeResult;
        }
    }
}
