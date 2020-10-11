package io.bigtotoro;

import java.util.Objects;
import java.util.Stack;

/**
 * <a href="https://leetcode.com/problems/merge-two-binary-trees/">617. Merge Two Binary Trees</a>
 */

public class _617 {
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

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            TreeNode treeNode = (TreeNode) o;
            return val == treeNode.val;
        }

        @Override
        public int hashCode() {
            return Objects.hash(val);
        }
    }

    public static class Solution1 {
        public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
            if (t1 == null) {
                return t2;
            }

            if (t2 == null) {
                return t1;
            }

            t1.val += t2.val;

            mergeTrees(t1.left, t2.left);
            mergeTrees(t1.right, t2.right);

            return t1;
        }
    }

    public static class Solution2 {
        public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
            Stack<TreeNode[]> stack = new Stack<>();
            stack.push(new TreeNode[] {t1, t2});
            while (!stack.empty()) {
                TreeNode[] top = stack.pop();
                if ((top[0] == null) || (top[1] == null)) {
                    continue;
                }

                top[0].val += top[1].val;

                if (top[0].left == null) {
                    top[0].left = top[1].left;
                } else {
                    stack.push(new TreeNode[] {top[0].left, top[1].left});
                }
                if (top[0].right == null) {
                    top[0].right = top[1].right;
                } else {
                    stack.push(new TreeNode[] {top[0].right, top[0].right});
                }
            }

            return t1;
        }
    }
}
