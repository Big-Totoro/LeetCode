package io.bigtotoro;

import java.util.HashSet;
import java.util.Set;

/**
 * <a href="https://leetcode.com/problems/happy-number/">202. Happy Number</a>
 */

public class _202 {

    public static class Solution1 {
        public boolean isHappy(int n) {
            if (n == 1) {
                return true;
            }

            int value = n;
            int sum = 0;
            if (n > 1 && n < 10) {
                value = n * n;
            }
            Set<Integer> set = new HashSet<>();
            while (sum != 1) {
                sum = getSum(value);
                if (sum == 0) {
                    break;
                } else if (sum == 1) {
                    return true;
                }
                value = sum;
                if (!set.add(value)) {
                    return false;
                }
            }

            return false;
        }

        private int getSum(int n) {
            int value = n;
            int remainder = 0;
            int sum = 0;

            while (value > 0) {
                remainder = value % 10;
                value /= 10;
                sum += remainder * remainder;
            }

            return sum;
        }
    }
}
