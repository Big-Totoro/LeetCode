package io.bigtotoro;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/find-anagram-mappings/">760. Find Anagram Mappings</a>
 */

public class _760 {
    public static class Solution1 {
        /**
         * Time: O(n^2)
         * Space: O(n)
         */
        public int[] anagramMappings(int[] A, int[] B) {
            int[] mapping = new int[A.length];

            for (int i = 0; i < A.length; ++i) {
                for (int j = 0; j < B.length; ++j) {
                    if (A[i] == B[j]) {
                        mapping[i] = j;
                        break;
                    }
                }
            }

            return mapping;
        }
    }

    public static class  Solution2 {
        /**
         * Time: O(2*n)
         * Space: O(n)
         */
        public int[] anagramMappings(int[] A, int[] B) {
            int[] mapping = new int[A.length];
            Map<Integer, Integer> map = new HashMap<>(A.length);

            for (int i = 0; i < B.length; ++i) {
                map.putIfAbsent(B[i], i);
            }

            for (int i = 0; i < A.length; ++i) {
                mapping[i] = map.get(A[i]);
            }

            return mapping;
        }
    }
}
