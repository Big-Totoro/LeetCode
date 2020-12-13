package io.bigtotoro;

/**
 * <a href="https://leetcode.com/problems/how-many-apples-can-you-put-into-the-basket/">1196. How Many Apples Can You Put into the Basket</a>
 */

public class _1196 {
    public static class Solution1 {
        public int maxNumberOfApples(int[] arr) {
            if (arr.length == 0) {
                return 0;
            }

            sort(arr);

            int counter = 0;
            int result = 0;
            for (int i = 0; i < arr.length; ++i) {
                if (result + arr[i] <= 5000) {
                    result += arr[i];
                    ++counter;
                }
            }

            return counter;
        }

        private void sort(int[] array) {
            sort(array, 0, array.length - 1);
        }

        private void sort(int[] array, int l, int r) {
            if (l > r) {
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
