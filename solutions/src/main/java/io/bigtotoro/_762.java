package io.bigtotoro;

import java.util.HashSet;
import java.util.Set;

/**
 * <a href="https://leetcode.com/problems/prime-number-of-set-bits-in-binary-representation/">762. Prime Number of Set Bits in Binary Representation</a>
 */

public class _762 {
    public static class Solution1 {

        Set<Integer> cache = new HashSet<>() {{ add(2); add(3); add(5); add(7); add(11); add(13); add(17); add(19);
            add(23); add(29); add(31); }};

        public int countPrimeSetBits(int L, int R) {
            if (L > R || L == R) {
                return 0;
            }
            int count = 0;
            int result = 0;

            for (int i = L; i <= R; i++) {
                count = countOneBits(i);
                if (cache.contains(count) || isPrime(count)) {
                    result++;
                }
            }

            return result;
        }

        private int countOneBits(int number) {
            int count = 0;
            while (number != 0) {
                count += number & 1;
                number >>= 1;
            }

            return count;
        }

        private boolean isPrime(int number) {
            if (number == 1) {
                return false;
            }
            int[] array = {2, 3, 5, 7};
            for (int i = 0; i < array.length; ++i) {
                if (number % array[i] == 0) {
                    return false;
                }
            }

            return true;
        }
    }
}
