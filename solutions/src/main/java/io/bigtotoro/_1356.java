package io.bigtotoro;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _1356 {

    public static class Solution1 {
        public int[] sortByBits(int[] arr) {
            if (arr.length == 0) {
                return new int[0];
            }

            List<Integer> list = Arrays.stream(arr).boxed().sorted((a, b) -> {
                int bitsA = Integer.bitCount(a);
                int bitsB = Integer.bitCount(b);
                if (bitsA == bitsB) {
                    return Integer.compare(a, b);
                }

                return Integer.compare(bitsA, bitsB);
            }).collect(Collectors.toList());

            int[] result = new int[arr.length];
            for (int i = 0; i < result.length; ++i) {
                result[i] = list.get(i);
            }

            return result;
        }
    }
}
