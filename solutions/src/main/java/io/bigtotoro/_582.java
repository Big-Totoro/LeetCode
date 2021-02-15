package io.bigtotoro;

import java.util.*;

/**
 * <a href="https://leetcode.com/problems/kill-process/">582. Kill Process</a>
 */

public class _582 {

    public static class Solution1 {

        public List<Integer> killProcess(List<Integer> pid, List<Integer> ppid, int kill) {
            if (kill == 0) {
                return pid;
            }

            Map<Integer, Set<Integer>> graph = new HashMap<>();
            for (int i = 0; i < ppid.size(); ++i) {
                Set<Integer> parent = graph.getOrDefault(ppid.get(i), new HashSet<>());
                parent.add(pid.get(i));
                graph.put(ppid.get(i), parent);
            }

            List<Integer> result = new ArrayList<>();
            dfs(graph, kill, result);

            return result;
        }

        private void dfs(Map<Integer, Set<Integer>> graph, int kill, List<Integer> result) {
            result.add(kill);

            if (!graph.containsKey(kill)) {
                return;
            }

            for (Integer p : graph.get(kill)) {
                dfs(graph, p, result);
            }
        }
    }
}
