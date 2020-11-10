package io.bigtotoro;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * <a href="https://leetcode.com/problems/goat-latin/">824. Goat Latin</a>
 */

public class _824 {
    public static class Solution1 {
        public String toGoatLatin(String S) {
            if (S.length() == 0) {
                return "";
            }

            StringBuilder builder = new StringBuilder();
            Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
            String[] words = S.split(" ");
            List<String> suffix = new ArrayList<>();

            for (int i = 0; i < words.length; ++i) {
                builder.append("a");
                suffix.add(builder.toString());
            }

            builder = new StringBuilder();

            for (int i = 0; i < words.length; ++i) {
                if (vowels.contains(words[i].toLowerCase().charAt(0))) {
                    builder.append(words[i])
                        .append("ma");
                } else {
                    builder.append(words[i].substring(1))
                        .append(words[i].charAt(0))
                        .append("ma");
                }

                builder.append(suffix.get(i));

                if (i < words.length - 1) {
                    builder.append(" ");
                }
            }

            return builder.toString();
        }
    }
}