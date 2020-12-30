package io.bigtotoro;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/occurrences-after-bigram/">1078. Occurrences After Bigram</a>
 */

public class _1078 {

    public static class Solution1 {
        public String[] findOcurrences(String text, String first, String second) {
            List<String> result = new ArrayList<>();
            String[] words = text.split(" ");
            for (int i = 0; i < words.length - 2; ++i) {
                if (words[i].equals(first) && words[i + 1].equals(second)) {
                    result.add(words[i + 2]);
                }
            }

            String[] temp = new String[result.size()];
            return result.toArray(temp);
        }
    }
}
