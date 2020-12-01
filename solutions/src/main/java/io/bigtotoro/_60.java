package io.bigtotoro;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * <a href="https://leetcode.com/problems/permutation-sequence/">60. Permutation Sequence</a>
 */

public class _60 {
    /**
     * https://en.wikipedia.org/wiki/Factorial_number_system
     */
    public static class Solution1 {

        public String getPermutation(int n, int k) {
            List<Integer> array = IntStream.rangeClosed(1, n).mapToObj(Integer::valueOf).collect(Collectors.toList());
            List<Integer> factoradicNumber = toFactoradic(n, k - 1);

            StringBuilder builder = new StringBuilder();
            for (Integer v : factoradicNumber) {
                builder.append(array.get(v));
                array.remove(v.intValue());
            }

            return builder.toString();
        }

        private LinkedList<Integer> toFactoradic(int n, int k) {
            LinkedList<Integer> result = new LinkedList<>();

            int i = 1;
            while (k > 0) {
                result.addFirst(k % i);
                k /= i;
                i++;
            }

            while (result.size() < n) {
                result.addFirst(0);
            }

            return result;
        }
    }
}
