package io.bigtotoro;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/height-checker/">1051. Height Checker</a>
 */

public class _1051 {
    public static class Solution1 {
        public int heightChecker(int[] heights) {
            int counter = 0;
            int[] heights2 = heights.clone();

            Arrays.sort(heights);

            for (int i = 0; i < heights.length; ++i) {
                if (heights[i] != heights2[i]) {
                    ++counter;
                }
            }

            return counter;
        }
    }

    public static class Solution2 {
        public int heightChecker(int[] heights) {
            if (heights.length < 1) {
                return 0;
            }
            int[] heights2 = heights.clone();
            int counter = 0;

            sort(heights);

            for (int i = 0; i < heights.length; ++i) {
                if (heights[i] != heights2[i]) {
                    ++counter;
                }
            }

            return counter;
        }

        public void sort(int[] array) {
            sort(array, 0, array.length - 1);
        }

        private void sort(int[] array, int l, int r) {
            if (r - l < 1) {
                return;
            }

            int p = choosePivot(array, l, r);
            int j = partition(array, l, r, p);
            sort(array, l, j - 1);
            sort(array, j + 1, r);
        }

        private int choosePivot(int[] array, int l, int r) {
            return l + (r - l) / 2;
        }

        private int partition(int[] array, int l, int r, int pivot) {
            swap(array, pivot, l);

            int i = l + 1;
            int p = array[l];

            for (int j = l + 1; j <= r; ++j) {
                if (array[j] < p) {
                    swap(array, i, j);
                    i++;
                }
            }

            swap(array, l, i - 1);

            return i - 1;
        }

        private void swap(int[] array, int l, int r) {
            int temp = array[l];
            array[l] = array[r];
            array[r] = temp;
        }
    }
}
