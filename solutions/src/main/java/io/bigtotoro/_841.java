package io.bigtotoro;

import java.util.List;
import java.util.Stack;

/**
 * <a href="https://leetcode.com/problems/keys-and-rooms/">841. Keys and Rooms</a>
 */

public class _841 {

    public static class Solution1 {
        public boolean canVisitAllRooms(List<List<Integer>> rooms) {
            boolean[] visited = new boolean[rooms.size()];
            visited[0] = true;

            Stack<Integer> stack = new Stack<>();
            stack.push(0);

            while (!stack.isEmpty()) {
                int room = stack.pop();
                for (Integer door : rooms.get(room)) {
                    if (!visited[door]) {
                        visited[door] = true;
                        stack.push(door);
                    }
                }
            }

            for (Boolean v : visited) {
                if (!v) {
                    return false;
                }
            }

            return true;
        }
    }
}
