package io.bigtotoro;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * <a href="https://leetcode.com/problems/number-of-islands/">200. Number of Islands</a>
 */

public class _200 {
    /**
     * Based on Count Connection Components, BFS
     * For example, https://www.geeksforgeeks.org/islands-in-a-graph-using-bfs/?ref=lbp
     */
    public static class Solution1 {
        public static class Position {
            private int r;
            private int c;

            public Position(int r, int c) {
                this.r = r;
                this.c = c;
            }

            public static Position valueOf(int r, int c) {
                return new Position(r, c);
            }

            public int getR() {
                return r;
            }

            public int getC() {
                return c;
            }

            @Override
            public String toString() {
                return "[" + r +", " + c + "]";
            }
        }

        public int numIslands(char[][] grid) {
            if (grid.length == 0 || grid[0].length == 0) {
                return 0;
            }

            int numCC = 0;
            boolean[][] visitedList = new boolean[grid.length][grid[0].length];
            for (int r = 0; r < grid.length; ++r) {
                for (int c = 0; c < grid[0].length; ++c) {
                    if (!visitedList[r][c] && grid[r][c] != '0') {
                        numCC++;

                        Queue<Position> queue = new LinkedList<>();
                        queue.offer(Position.valueOf(r, c));
                        while (!queue.isEmpty()) {
                            Position currentPosition = queue.poll();

                            /**
                             * Check the island on the East
                             */
                            if (currentPosition.getC() + 1 < grid[0].length &&
                                    !visitedList[currentPosition.getR()][currentPosition.getC() + 1] &&
                                    grid[currentPosition.getR()][currentPosition.getC() + 1] == '1') {
                                queue.offer(Position.valueOf(currentPosition.getR(), currentPosition.getC() + 1));
                                visitedList[currentPosition.getR()][currentPosition.getC() + 1] = true;
                            }

                            /**
                             * Check the island on the South
                             */
                            if (currentPosition.getR() + 1 < grid.length &&
                                    !visitedList[currentPosition.getR() + 1][currentPosition.getC()] &&
                                    grid[currentPosition.getR() + 1][currentPosition.getC()] == '1') {
                                queue.offer(Position.valueOf(currentPosition.getR() + 1, currentPosition.getC()));
                                visitedList[currentPosition.getR() + 1][currentPosition.getC()] = true;
                            }

                            /**
                             * Check the island on the West
                             */
                            if (currentPosition.getC() - 1 >= 0 &&
                                    !visitedList[currentPosition.getR()][currentPosition.getC() - 1] &&
                                    grid[currentPosition.getR()][currentPosition.getC() - 1] == '1') {
                                queue.offer(Position.valueOf(currentPosition.getR(), currentPosition.getC() - 1));
                                visitedList[currentPosition.getR()][currentPosition.getC() - 1] = true;
                            }

                            /**
                             * Check the island on the North
                             */
                            if (currentPosition.getR() - 1 >= 0 &&
                                    !visitedList[currentPosition.getR() - 1][currentPosition.getC()] &&
                                    grid[currentPosition.getR() - 1][currentPosition.getC()] == '1') {
                                queue.offer(Position.valueOf(currentPosition.getR() - 1, currentPosition.getC()));
                                visitedList[currentPosition.getR() - 1][currentPosition.getC()] = true;
                            }
                        }
                    }
                }
            }

            return numCC;
        }
    }

    public static class Solution2 {

        public int numIslands(char[][] grid) {
            if (grid == null || grid.length == 0) {
                return 0;
            }

            int islands = 0;

            for (int r = 0; r < grid.length; ++r) {
                for (int c = 0; c < grid[0].length; ++c) {
                    if (grid[r][c] == '1') {
                        islands++;
                        dfs(r, c, grid);
                    }
                }
            }

            return islands;
        }

        private void dfs(int r, int c, char[][] grid) {
            if (r < 0 || c < 0 || r > grid.length - 1 || c > grid[0].length - 1 || grid[r][c] == '0') {
                return;
            }

            grid[r][c] = '0';

            dfs(r + 1, c, grid);
            dfs(r, c + 1, grid);
            dfs(r - 1, c, grid);
            dfs(r, c - 1, grid);
        }
    }

    public static class Solution3 {

        public static class Position {
            private int r;
            private int c;

            public static Position valueOf(int r, int c) {
                Position p = new Position();
                p.r = r;
                p.c = c;

                return p;
            }
        }

        public int numIslands(char[][] grid) {
            if (grid == null || grid.length == 0) {
                return 0;
            }

            int islands = 0;

            for (int r = 0; r < grid.length; ++r) {
                for (int c = 0; c < grid[0].length; ++c) {
                    if (grid[r][c] == '1') {
                        ++islands;
                        dfs(r, c, grid);
                    }
                }
            }

            return islands;
        }

        private void dfs(int r, int c, char[][] grid) {
            Stack<Position> stack = new Stack<>();
            stack.push(Position.valueOf(r, c));

            while (!stack.isEmpty()) {
                Position currentPosition = stack.pop();
                if (isIslandPosition(currentPosition, grid) && grid[currentPosition.r][currentPosition.c] == '1') {
                    grid[currentPosition.r][currentPosition.c] = '0';

                    stack.push(Position.valueOf(currentPosition.r + 1, currentPosition.c));
                    stack.push(Position.valueOf(currentPosition.r, currentPosition.c + 1));
                    stack.push(Position.valueOf(currentPosition.r - 1, currentPosition.c));
                    stack.push(Position.valueOf(currentPosition.r, currentPosition.c - 1));
                }
            }
        }

        private boolean isIslandPosition(Position position, char[][] grid) {
            if (position.r < 0 || position.c < 0 || position.r > grid.length - 1 || position.c > grid[0].length - 1) {
                return false;
            }
            return true;
        }
    }
}
