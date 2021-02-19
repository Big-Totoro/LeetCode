package io.bigtotoro;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * <a href="https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses/">1249. Minimum Remove to Make Valid Parentheses</a>
 */

public class _1249 {

    public static class Solution1 {
        public String minRemoveToMakeValid(String s) {
            if (s.length() == 0) {
                return s;
            }

            Stack<Integer> stack = new Stack<>();
            StringBuilder builder = new StringBuilder();
            Set<Integer> toRemove = new HashSet<>();
            for (int i = 0; i < s.length(); ++i) {
                if (s.charAt(i) == '(') {
                    stack.push(i);
                } else if (s.charAt(i) == ')') {
                    if (stack.isEmpty()) {
                        toRemove.add(i);
                    } else {
                        stack.pop();
                    }
                }
            }

            toRemove.addAll(stack);

            for (int i = 0; i < s.length(); ++i) {
                if (toRemove.contains(i)) {
                    continue;
                }
                builder.append(s.charAt(i));
            }

            return builder.toString();
        }
    }
}
