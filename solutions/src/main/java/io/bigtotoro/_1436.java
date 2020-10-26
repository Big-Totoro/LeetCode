package io.bigtotoro;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * <a href="https://leetcode.com/problems/destination-city/">Destination City</a>
 */

public class _1436 {
    /**
     * T: O(n)
     * S: O(n)
     */
    public static class Solution1 {
        public String destCity(List<List<String>> paths) {
            Set<String> sources = new HashSet<>();
            for (List<String> path : paths) {
                sources.add(path.get(0));
            }

            String destination = "";
            for (List<String> path : paths) {
                if (!sources.contains(path.get(1))) {
                    destination += path.get(1);
                }
            }

            return destination;
        }
    }
}
