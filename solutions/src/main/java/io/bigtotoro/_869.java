package io.bigtotoro;

import java.util.Arrays;
import java.util.HashSet;

/**
 * <a href="https://leetcode.com/problems/reordered-power-of-2/">869. Reordered Power of 2</a>
 */

public class _869 {

    public static class Solution1 {

        public boolean reorderedPowerOf2(int N) {
            char[] value1 = String.valueOf(N).toCharArray();
            Arrays.sort(value1);

            for (int i = 0; i < 30; ++i) {
                char[] value2 = String.valueOf(1 << i).toCharArray();
                Arrays.sort(value2);
                if (Arrays.equals(value1, value2)) {
                    return true;
                }
            }

            return false;
        }
    }
}
