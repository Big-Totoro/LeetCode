package io.bigtotoro;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * <a href="https://leetcode.com/problems/number-of-distinct-islands/">694. Number of Distinct Islands</a>
 */

public class _694 {

    public static class Solution1 {

        private final Map<Character, Integer[]> directions = new LinkedHashMap<>() {{
            put('L', new Integer[] {0, -1});
            put('R', new Integer[] {0, 1});
            put('D', new Integer[] {1, 0});
            put('U', new Integer[] {-1, 0});
        }};

        private final String END_OF_ISLAND = "E";
        private final int LAND = 1;
        private final int WATER = 0;

        public int numDistinctIslands(int[][] grid) {
            if (grid.length == 0 || grid[0].length == 0) {
                return 0;
            }

            Set<String> distinctIslands = new HashSet<>();

            for (int r = 0; r < grid.length; r++) {
                for (int c = 0; c < grid[0].length; c++) {
                    if (grid[r][c] == 1) {
                        StringBuilder builder = new StringBuilder();
                        dfs(grid, r, c, builder);
                        distinctIslands.add(builder.toString());
                    }
                };
            }

            return distinctIslands.size();
        }

        private void dfs(int[][] grid, int row, int col, StringBuilder builder) {
            if (grid[row][col] == 0) {
                return;
            }

            grid[row][col] = WATER;

            for (var direction : directions.entrySet()) {
                int r = row + direction.getValue()[0];
                int c = col + direction.getValue()[1];
                if (isValid(grid, r, c) && grid[r][c] == LAND) {
                    builder.append(direction.getKey());

                    dfs(grid, r, c, builder);
                }
            }
            builder.append(END_OF_ISLAND);
        }

        private boolean isValid(int[][] grid, int row, int col) {
            return row >= 0 && col >= 0 && row < grid.length && col < grid[0].length;
        }
    }
}

