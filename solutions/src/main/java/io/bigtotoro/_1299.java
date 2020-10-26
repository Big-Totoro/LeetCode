package io.bigtotoro;

/**
 * <a href="https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/">Replace Elements with Greatest Element on Right Side</a>
 */

public class _1299 {
    /**
     * T: O(n^2)
     * S: O(n)
     */
    public static class Solution1 {
        public int[] replaceElements(int[] arr) {
            int[] result = new int[arr.length];

            int max = Integer.MIN_VALUE;
            int maxIndex = -1;
            for (int i = 0; i < arr.length; ++i) {
                if (i >= maxIndex) {
                    max = Integer.MIN_VALUE;
                    maxIndex = -1;
                    for (int j = i + 1; j < arr.length; ++j) {
                        if (max < arr[j]) {
                            max = arr[j];
                            maxIndex = j;
                        }
                    }
                }

                result[i] = max;
            }

            result[arr.length - 1] = -1;

            return result;
        }
    }

    /**
     * T: O(n)
     * S: O(1)
     */
    public static class Solution2 {
        public int[] replaceElements(int[] arr) {
            int max = -1;
            for (int i = arr.length - 1; i >= 0; --i) {
                int temp = arr[i];
                arr[i] = max;
                max = Math.max(temp, max);
            }

            return arr;
        }
    }
}
