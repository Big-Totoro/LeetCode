package io.bigtotoro;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * <a href="https://leetcode.com/problems/reverse-words-in-a-string-iii/">557. Reverse Words in a String III</a>
 */

public class _557 {
    public static class Solution1 {
        public String reverseWords(String s) {
            int head = 0;
            char[] result = new char[s.length()];

            for (int i = 0; i < s.length(); ++i) {
                if ((s.charAt(i) == ' ') || (i == s.length() - 1)) {
                    int tail = i;

                    if (s.charAt(i) == ' ') {
                        tail = i - 1;
                        result[i] = ' ';
                    }

                    while (head <= tail) {
                        char temp = s.charAt(head);
                        result[head++] = s.charAt(tail);
                        result[tail--] = temp;
                    }
                    head = i + 1;
                }
            }

            return new String(result);
        }
    }

    public static class Solution2 {
        public String reverseWords(String s) {
            return Arrays.stream(s.split(" "))
                    .map(w -> new StringBuilder(w).reverse())
                    .collect(Collectors.joining(" "));
        }
    }
}
