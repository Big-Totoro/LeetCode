package io.bigtotoro;

/**
 * <a href="https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/">496. Find N Unique Integers Sum up to Zero</a>
 */

public class _1304 {
    public static class Solution1 {
        public int[] sumZero(int n) {
            if (n == 1) {
                return new int[] {0};
            }

            int[] result = new int[n];
            if (n % 2 > 0) {
                result[n / 2] = 0;
            }
            int h = 0;
            int t = n - 1;

            while (h < t) {
                result[h++] = h;
                result[t--] = -h;
            }

            return result;
        }
    }

    public static class Solution2 {
        public int[] sumZero(int n) {
            int[] result = new int[n];

            for (int i = 0; i < n - 1; i += 2) {
                result[i] = i + 1;
                result[i + 1] = -result[i];
            }

            return result;
        }
    }
}
