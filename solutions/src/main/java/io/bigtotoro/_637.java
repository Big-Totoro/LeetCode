package io.bigtotoro;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * <a href="https://leetcode.com/problems/average-of-levels-in-binary-tree/">637. Average of Levels in Binary Tree</a>
 */

public class _637 {

    public static class Solution1 {
        public List<Double> averageOfLevels(_872.TreeNode root) {
            if (root == null) {
                return List.of(0.0);
            }

            List<Double> result = new ArrayList<>();
            double sum = 0;
            Queue<_872.TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            while (!queue.isEmpty()) {
                int size = queue.size();

                for (int i = 0; i < size; ++i) {
                    _872.TreeNode top = queue.poll();
                    sum += top.val;

                    if (top.left != null) {
                        queue.offer(top.left);
                    }
                    if (top.right != null) {
                        queue.offer(top.right);
                    }
                }

                result.add(sum / size);
                sum = 0.0;
            }

            return result;
        }
    }
}
