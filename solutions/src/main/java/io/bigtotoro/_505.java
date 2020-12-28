package io.bigtotoro;

/**
 * <a href="https://leetcode.com/problems/the-maze-ii/">505. The Maze II</a>
 */

public class _505 {

    public static class Solution1 {

        private int minDistance = Integer.MAX_VALUE;
        public int shortestDistance(int[][] maze, int[] start, int[] destination) {
            dfs(maze, start, destination);

            return 1;
        }

        private void dfs(int[][] maze, int[] start, int[] destination) {
        }
    }
}
