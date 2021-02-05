package io.bigtotoro;

import java.util.Deque;
import java.util.LinkedList;

/**
 * <a href="https://leetcode.com/problems/simplify-path/">71. Simplify Path</a>
 */

public class _71 {
    public static class Solution1 {
        public String simplifyPath(String path) {
            String[] paths = path.split("/");
            Deque<String> stack = new LinkedList<>();
            for (String component : paths) {
                if (component.equals("..")) {
                    if (!stack.isEmpty()) {
                        stack.pop();
                    }
                } else if (!component.equals(".") && !component.isEmpty()) {
                    stack.push(component);
                }
            }

            if (stack.isEmpty()) {
                return "/";
            }

            StringBuilder builder = new StringBuilder(stack.size() + 1);
            while (!stack.isEmpty()) {
                builder.append("/");
                builder.append(stack.pollLast());
            }

            return builder.toString();
        }
    }
}
