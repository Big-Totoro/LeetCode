package io.bigtotoro;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/the-maze-ii/">505. The Maze II</a>
 */

public class _505 {

    public static class Solution1 {

        public int shortestDistance(int[][] maze, int[] start, int[] destination) {
            int[][] distanceMaze = new int[maze.length][maze[0].length];
            for (int i = 0; i < distanceMaze.length; ++i) {
                Arrays.fill(distanceMaze[i], Integer.MAX_VALUE);
            }
            distanceMaze[start[0]][start[1]] = 0;

            dfs(maze, start, distanceMaze);

            return (distanceMaze[destination[0]][destination[1]] == Integer.MAX_VALUE) ? -1 : distanceMaze[destination[0]][destination[1]];
        }

        private void dfs(int[][] maze, int[] start, int[][] distanceMaze) {
            int startRow = start[0];
            int startCol = start[1];
            int[][] directions = new int[][] {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

            for (int[] direction : directions) {
                int row = startRow + direction[0];
                int col = startCol + direction[1];

                int steps = 0;
                while (isValid(maze, row, col) && maze[row][col] == 0) {
                    row += direction[0];
                    col += direction[1];
                    ++steps;
                }

                int cellRow = row - direction[0];
                int cellCol = col - direction[1];
                if (isValid(maze, cellRow, cellCol) && distanceMaze[cellRow][cellCol] > distanceMaze[startRow][startCol] + steps) {
                    distanceMaze[cellRow][cellCol] = distanceMaze[startRow][startCol] + steps;
                    dfs(maze, new int[] {cellRow, cellCol}, distanceMaze);
                }
            }
        }

        private boolean isValid(int[][] maze, int r, int c) {
            return r >= 0 && c >= 0 && r < maze.length && c < maze[0].length;
        }
    }

    public static class Solution2 {

        private int minDistance = Integer.MAX_VALUE;

        public int shortestDistance(int[][] maze, int[] start, int[] destination) {
            dfs(maze, start, destination);

            return 1;
        }

        private void dfs(int[][] maze, int[] start, int[] destination) {
            int[][] directions = new int[][] {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

            for (int[] direction : directions) {
                int x = start[0] + direction[0];
                int y = start[1] + direction[1];

                if (isValid(maze, x, y) && maze[x][y] > 0) {

                }
            }
        }
        private boolean isValid(int[][] maze, int x, int y) {
            return x >= 0 && y >= 0 && x < maze.length && y < maze[0].length;
        }

    }
}
