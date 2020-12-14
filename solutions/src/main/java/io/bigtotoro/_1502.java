package io.bigtotoro;

/**
 * <a href="https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/">1502. Can Make Arithmetic Progression From Sequence</a>
 */

public class _1502 {

    public static class Solution1 {
        public boolean canMakeArithmeticProgression(int[] arr) {
            if (arr.length == 0) {
                return false;
            }

            sort(arr);

            int diff = Math.abs(arr[0] - arr[1]);
            for (int i = 2; i < arr.length; ++i) {
                if (Math.abs(arr[i - 1] - arr[i]) != diff) {
                    return false;
                }
            }

            return true;
        }

        private void sort(int[] arr) {
            sort(arr, 0, arr.length - 1);
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

        private int partition(int[] array, int l, int r, int pivot) {
            swap(array, l, pivot);

            int p = array[l];
            int i = l + 1;
            for (int j = l + 1; j <= r; ++j) {
                if (array[j] < p) {
                    swap(array, i, j);
                    i++;
                }
            }
            swap(array, l, i - 1);

            return i - 1;
        }

        private int choosePivot(int[] array, int l, int r) {
            return l + (r - l) / 2;
        }

        private void swap(int[] array, int l, int r) {
            int temp = array[l];
            array[l] = array[r];
            array[r] = temp;
        }
    }
}
