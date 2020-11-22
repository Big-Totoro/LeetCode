package io.bigtotoro;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/find-common-characters/">1002. Find Common Characters</a>
 */

public class _1002 {

    public static class Solution1 {
        public List<String> commonChars(String[] A) {
            final int ALPHABET_SIZE = 26;
            List<String> result = new ArrayList<>();
            int[] intersection = new int[ALPHABET_SIZE];

            for (int i = 0; i < intersection.length; i++) {
                intersection[i] = Integer.MAX_VALUE;
            }

            for (String s : A) {
                int[] temp = new int[ALPHABET_SIZE];
                for (int i = 0; i < s.length(); ++i) {
                    temp[s.charAt(i) - 'a']++;
                }

                for (int i = 0; i < intersection.length; ++i) {
                    intersection[i] = Math.min(intersection[i], temp[i]);
                }
            }

            for (int i = 0; i < intersection.length; ++i) {
                while (intersection[i] > 0) {
                    result.add(String.valueOf((char)(i + 'a')));
                    intersection[i]--;
                }
            }

            return result;
        }
    }
}
