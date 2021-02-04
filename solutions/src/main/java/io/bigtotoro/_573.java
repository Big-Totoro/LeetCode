package io.bigtotoro;

/**
 * <a href="https://leetcode.com/problems/squirrel-simulation/">573. Squirrel Simulation</a>
 */

public class _573 {
    public static class Solution1 {
        public int minDistance(int height, int width, int[] tree, int[] squirrel, int[][] nuts) {
            int[] fromNutsToTreeDistance = new int[nuts.length];
            int[] fromSquirrelToNutsDistance = new int[nuts.length];
            int nutsToTree = 0;

            for (int i = 0; i < nuts.length; ++i) {
                fromNutsToTreeDistance[i] = Math.abs(nuts[i][0] - tree[0]) + Math.abs(nuts[i][1] - tree[1]);
                fromSquirrelToNutsDistance[i] = Math.abs(squirrel[0] - nuts[i][0]) + Math.abs(squirrel[1] - nuts[i][1]);
                nutsToTree += 2 * fromNutsToTreeDistance[i];
            }

            int minDistance = Integer.MAX_VALUE;
            for (int i = 0; i < nuts.length; ++i) {
                int distance = nutsToTree + fromSquirrelToNutsDistance[i] - fromNutsToTreeDistance[i];
                minDistance = Math.min(minDistance, distance);
            }

            return minDistance;
        }
    }
}