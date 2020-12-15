package io.bigtotoro;

/**
 * <a href="https://leetcode.com/problems/fixed-point/">1064. Fixed Point</a>
 */

public class _1064 {

    public static class Solution1 {
        public int fixedPoint(int[] A) {
            if (A[0] > 0 || A[A.length - 1] < A.length - 1) {
                return -1;
            }

            int result = Integer.MAX_VALUE;
            int l = 0;
            int r = A.length - 1;
            while (l <= r) {
                int mid = l + (r - l) / 2;
                if (A[mid] > mid) {
                    r = mid - 1;
                } else if (A[mid] < mid) {
                    l = mid + 1;
                } else {
                    result = Math.min(result, mid);
                    r = mid - 1;
                }
            }

            return result == Integer.MAX_VALUE ? -1 : result;
        }
    }
}
