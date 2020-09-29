package io.bigtotoro;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/self-dividing-numbers/">728. Self Dividing Numbers</a>
 */

public class _728 {
    public static class Solution1 {
        public List<Integer> selfDividingNumbers(int left, int right) {
            List<Integer> result = new ArrayList<>(right - left);

NEXT:       for (int i = left; i <= right; ++i) {
                int n = i;
                while (n > 0) {
                    int k = n % 10;
                    if (k == 0 || i % k > 0) {
                        continue NEXT;
                    }
                    n /= 10;
                }
                result.add(i);
            }

            return result;
        }
    }

    public static class Solution2 {
        private boolean isDivided(int num) {
            int n = num;
            while (n > 0) {
                int k = n % 10;

                if (k == 0 || num % k > 0) {
                    return false;
                }
                n /= 10;
            }

            return true;
        }

        public List<Integer> selfDividingNumbers(int left, int right) {
            List<Integer> result = new ArrayList<>(right - left);

            for (int i = left; i <= right; ++i) {
                if (isDivided(i)) {
                    result.add(i);
                }
            }

            return result;
        }
    }
}
