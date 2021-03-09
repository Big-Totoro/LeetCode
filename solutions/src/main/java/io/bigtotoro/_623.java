package io.bigtotoro;

import java.util.LinkedList;
import java.util.Queue;

/**
 * <a href="https://leetcode.com/problems/add-one-row-to-tree/">623. Add One Row to Tree</a>
 */

public class _623 {

    public static class Solution1 {
        public _872.TreeNode addOneRow(_872.TreeNode root, int v, int d) {
            if (d == 1) {
                _872.TreeNode node = new _872.TreeNode(v);
                node.left = root;
                return node;
            }

            int level = 1;
            Queue<_872.TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            while (level < d - 1) {
                int size = queue.size();
                for (int i = 0; i < size; ++i) {
                    _872.TreeNode currentNode = queue.poll();
                    if (currentNode.left != null) {
                        queue.offer(currentNode.left);
                    }
                    if (currentNode.right != null) {
                        queue.offer(currentNode.right);
                    }
                }
                ++level;
            }

            while (!queue.isEmpty()) {
                _872.TreeNode currentNode = queue.poll();
                _872.TreeNode temp = currentNode.left;
                currentNode.left = new _872.TreeNode(v);
                currentNode.left.left = temp;

                temp = currentNode.right;
                currentNode.right = new _872.TreeNode(v);
                currentNode.right.right = temp;
            }

            return root;
        }
    }
}
