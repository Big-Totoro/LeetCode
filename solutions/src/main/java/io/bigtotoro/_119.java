package io.bigtotoro;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/pascals-triangle-ii/">119. Pascal's Triangle II</a>
 */

public class _119 {

    public static class Solution1 {

        private HashMap<Integer, BigInteger> cache = new HashMap<>();

        public List<Integer> getRow(int rowIndex) {
            List<Integer> result = new ArrayList<>();
            for (int i = 0; i <= rowIndex; ++i) {
                BigInteger C = factorial(rowIndex).divide(factorial(i).multiply(factorial(rowIndex - i)));
                result.add(C.intValue());
            }
            return result;
        }

        private BigInteger factorial(int n) {
            if (n == 0 || n == 1) {
                return BigInteger.ONE;
            }

            if (cache.containsKey(n - 1)) {
                BigInteger cached = cache.get(n - 1).multiply(BigInteger.valueOf(n));
                cache.put(n, cached);

                return cached;
            }

            BigInteger value = factorial(n - 1).multiply(BigInteger.valueOf(n));
            cache.put(n, value);

            return value;
        }
    }
}
