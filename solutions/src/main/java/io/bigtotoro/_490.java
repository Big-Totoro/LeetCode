package io.bigtotoro;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * <a href="https://leetcode.com/problems/the-maze/">490. The Maze</a>
 */

public class _490 {

    public static class Solution1 {
        public boolean hasPath(int[][] maze, int[] start, int[] destination) {
            int[][] distances = new int[maze.length][maze[0].length];
            for (int i = 0; i < maze.length; ++i) {
                Arrays.fill(distances[i], Integer.MAX_VALUE);
            }
            distances[start[0]][start[1]] = 0;

            bfs(maze, start[0], start[1], distances);

            return (distances[destination[0]][destination[1]] == Integer.MAX_VALUE) ? false : true;
        }

        private void bfs(int[][] maze, int startX, int startY, int[][] distances) {
            final Integer[][] directions = new Integer[][] {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
            Queue<Integer[]> queue = new LinkedList<>();
            queue.offer(new Integer[] {startX, startY});

            while (!queue.isEmpty()) {
                Integer[] top = queue.poll();
                startX = top[0];
                startY = top[1];

                for (Integer[] direction : directions) {
                    int x = startX + direction[0];
                    int y = startY + direction[1];

                    int steps = 0;
                    while (isValid(maze, x, y) && maze[x][y] == 0) {
                        x += direction[0];
                        y += direction[1];
                        ++steps;
                    }

                    x -= direction[0];
                    y -= direction[1];
                    if (isValid(maze, x, y) && distances[x][y] > distances[x][y] + steps) {
                        distances[x][y] = distances[startX][startY] + steps;
                        queue.offer(new Integer[]{x, y});
                    }
                }
            }
        }

        private boolean isValid(int[][] maze, int x, int y) {
            return x >= 0 && y >= 0 && x < maze.length && y < maze[0].length;
        }
    }
}
