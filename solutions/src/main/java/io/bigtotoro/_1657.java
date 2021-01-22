package io.bigtotoro;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/determine-if-two-strings-are-close/">1657. Determine if Two Strings Are Close</a>
 */

public class _1657 {

    public static class Solution1 {
        public boolean closeStrings(String word1, String word2) {
            int[] array1 = new int[26];
            int[] array2 = new int[26];

            for (int i = 0; i < word1.length(); i++) {
                array1[word1.charAt(i) - 'a']++;
            }

            for (int i = 0; i < word2.length(); i++) {
                array2[word2.charAt(i) - 'a']++;
            }

            for (int i = 0; i < 26; ++i) {
                if (array1[i] == array2[i]) {
                    continue;
                }
                if (array1[i] == 0 || array2[i] == 0) {
                    return false;
                }
            }

            Arrays.sort(array1);
            Arrays.sort(array2);

            for (int i = 0; i < array1.length; ++i) {
                if (array1[i] != array2[i]) {
                    return false;
                }
            }

            return true;
        }
    }
}
