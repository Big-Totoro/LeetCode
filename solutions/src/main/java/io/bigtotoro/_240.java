package io.bigtotoro;

/**
 * <a href="https://leetcode.com/problems/search-a-2d-matrix-ii/">240. Search a 2D Matrix II</a>
 */

public class _240 {

    public static class Solution1 {
        public boolean searchMatrix(int[][] matrix, int target) {
            if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
                return false;
            }

            int r = matrix.length - 1;
            int c = 0;
            while (r >= 0 && c < matrix[0].length) {
                if (matrix[r][c] > target) {
                    r--;
                } else if (r >= 0 && c < matrix[0].length && matrix[r][c] < target) {
                    c++;
                } else {
                    return true;
                }
            }

            return false;
        }
    }
}
