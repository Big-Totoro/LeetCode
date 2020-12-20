package io.bigtotoro;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/the-k-weakest-rows-in-a-matrix/">1337. The K Weakest Rows in a Matrix</a>
 */

public class _1337 {

    public static class Solution1 {
        public int[] kWeakestRows(int[][] mat, int k) {
        if (mat.length == 0 || mat[0].length == 0) {
            return new int[0];
        }

        /**
         * Do the binary search
         */
        int[][] map = new int[mat.length][2];
        for (int i = 0; i < mat.length; i++) {
            int l = 0;
            int r = mat[i].length;
            while (l < r) {
                int mid = l + (r - l) / 2;
                if (mat[i][mid] == 1) {
                    l = mid + 1;
                } else {
                    r = mid;
                }
            }

            // Put in the 'map' a number of '1's and the row index in the mat
            map[i] = new int[] {l, i};
        }

        Arrays.sort(map, (v1, v2) -> v1[0] - v2[0]);

        int[] result = new int[k];
        for (int i = 0; i < k; ++i) {
            result[i] = map[i][1];
        }

        return result;
        }
    }
}
