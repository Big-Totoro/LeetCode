package io.bigtotoro;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/maximum-69-number/">1323. Maximum 69 Number</a>
 */

public class _1323 {
    public static class Solution1 {
        public int maximum69Number (int num) {
            int n = num;
            int max = 0;
            List<Integer> array = new ArrayList<>();

            while (n > 0) {
                array.add(n % 10);

                n /= 10;
            }

            boolean flag = false;
            for (int i = array.size() - 1; i >= 0; --i) {
                if ((array.get(i) == 6) && (flag == false)) {
                    array.set(i, 9);
                    flag = true;
                }

                max += array.get(i);

                if (i > 0) {
                    max *= 10;
                }
            }

            return max;
        }
    }

    public static class Solution2 {
        public int maximum69Number (int num) {
            int max = 0;
            int n = num;

            while (n > 0) {

            }

            return max;
        }
    }
}
