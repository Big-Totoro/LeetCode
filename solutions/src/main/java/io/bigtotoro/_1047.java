package io.bigtotoro;

import java.util.Stack;

/**
 * <a href="https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/">1047. Remove All Adjacent Duplicates In String</a>
 */

public class _1047 {
    public static class Solution1 {
        public String removeDuplicates(String S) {
            int i = 0;
            StringBuilder builder = new StringBuilder(S);

            while(i < builder.length()) {
                if (builder.length() >= 2) {
                    if (i < builder.length() - 1 && builder.charAt(i) == builder.charAt(i + 1)) {
                        builder.replace(i, i + 2, "");
                        i = 0;
                        continue;
                    }
                } else {
                    break;
                }
                i++;
            }

            return builder.toString();
        }
    }

    public static class Solution2 {
        public String removeDuplicates(String S) {
            if (S.length() < 2) {
                return S;
            }

            Stack<Character> stack = new Stack<>();

            for (int i = 0; i < S.length(); ++i) {
                if (!stack.empty() && S.charAt(i) == stack.peek()) {
                    stack.pop();
                    continue;
                }
                stack.push(S.charAt(i));
            }

            StringBuilder builder = new StringBuilder();
            while (!stack.empty()) {
                builder.insert(0, stack.pop());
            }

            return builder.toString();
        }
    }

    public static class Solution3 {
        public String removeDuplicates(String S) {
            if (S.length() < 2) {
                return S;
            }

            StringBuilder builder = new StringBuilder();

            for (int i = 0; i < S.length(); ++i) {
                if (builder.length() > 0 && S.charAt(i) == builder.charAt(builder.length() - 1)) {
                    builder.deleteCharAt(builder.length() - 1);
                    continue;
                }
                builder.append(S.charAt(i));
            }

            return builder.toString();
        }
    }
}
