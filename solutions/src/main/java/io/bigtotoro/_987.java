package io.bigtotoro;

import java.util.*;

/**
 * <a href="https://leetcode.com/problems/vertical-order-traversal-of-a-binary-tree/">987. Vertical Order Traversal of a Binary Tree</a>
 */

public class _987 {

    public static class TreeNode {
        int val;
        _987.TreeNode left;
        _987.TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, _987.TreeNode left, _987.TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    /**
     * Horizontal Distance
     */
    public static class HD implements Comparable<HD> {
        int hd;
        int level;
        TreeNode treeNode;

        public static HD valueOf(int hd, int level, TreeNode treeNode) {
            HD instance = new HD();
            instance.hd = hd;
            instance.level = level;
            instance.treeNode = treeNode;
            return instance;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            HD hd1 = (HD) o;
            return hd == hd1.hd;
        }

        @Override
        public int hashCode() {
            return Objects.hash(hd);
        }

        @Override
        public int compareTo(HD o) {
            if (this.level == o.level) {
                return this.treeNode.val - o.treeNode.val;
            }

            return  o.level - this.level;
        }
    }

    public static class Solution1 {
        public List<List<Integer>> verticalTraversal(TreeNode root) {
            if (root == null) {
                return List.of();
            }

            Map<Integer, List<HD>> map = new TreeMap<>();
            List<HD> hdList = map.getOrDefault(0, new ArrayList<>());
            hdList.add(HD.valueOf(0, 0,  root));
            map.put(0, hdList);

            int level = 0;
            Stack<HD> stack = new Stack<>();
            stack.push(HD.valueOf(0, 0, root));
            while (!stack.isEmpty()) {
                HD top = stack.pop();

                if (top.treeNode.left != null) {
                    int hd = top.hd - 1;
                    stack.push(HD.valueOf(hd, level, top.treeNode.left));
                    hdList = map.getOrDefault(hd, new ArrayList<>());
                    hdList.add(HD.valueOf(hd, level, top.treeNode.left));
                    map.put(hd, hdList);
                }
                if (top.treeNode.right != null) {
                    int hd = top.hd + 1;
                    stack.push(HD.valueOf(hd, level, top.treeNode.right));
                    hdList = map.getOrDefault(hd, new ArrayList<>());
                    hdList.add(HD.valueOf(hd, level, top.treeNode.right));
                    map.put(hd, hdList);
                }
                ++level;
            }

            List<List<Integer>> result = new ArrayList<>();
            for (Map.Entry<Integer, List<HD>> e : map.entrySet()) {
                List<Integer> node = new ArrayList<>();
                e.getValue().sort(Comparator.naturalOrder());
                for (HD hd : e.getValue()) {
                    node.add(hd.treeNode.val);
                }
                result.add(node);
            }

            return result;
        }
    }
}