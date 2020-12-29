package io.bigtotoro;

import java.util.LinkedList;
import java.util.Queue;

/**
 * <a href="https://leetcode.com/problems/the-maze/">490. The Maze</a>
 */

public class _490 {

    public static class Solution1 {
        public boolean hasPath(int[][] maze, int[] start, int[] destination) {
            return bfs(maze, start[0], start[1], destination);
        }

        private boolean bfs(int[][] maze, int startX, int startY, int[] destination) {
            final Integer[][] directions = new Integer[][] {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
            boolean[][] visited = new boolean[maze.length][maze[0].length];
            visited[startX][startY] = true;
            Queue<Integer[]> queue = new LinkedList<>();
            queue.offer(new Integer[] {startX, startY});

            while (!queue.isEmpty()) {
                Integer[] top = queue.poll();
                startX = top[0];
                startY = top[1];

                if (startX == destination[0] && startY == destination[1]) {
                    return true;
                }

                for (Integer[] direction : directions) {
                    int x = startX + direction[0];
                    int y = startY + direction[1];

                    while (isValid(maze, x, y) && maze[x][y] == 0) {
                        x += direction[0];
                        y += direction[1];
                    }

                    x -= direction[0];
                    y -= direction[1];
                    if (isValid(maze, x, y) && !visited[x][y]) {
                        visited[x][y] = true;
                        queue.offer(new Integer[]{x, y});
                    }
                }
            }

            return false;
        }

        private boolean isValid(int[][] maze, int x, int y) {
            return x >= 0 && y >= 0 && x < maze.length && y < maze[0].length;
        }
    }
}
