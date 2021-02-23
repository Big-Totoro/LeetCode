package io.bigtotoro;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/find-the-celebrity/">277. Find the Celebrity</a>
 */

public class _277 {

    /**
     * Nonfunctional stub
     */
    public static class Relation {
        public boolean knows(int i, int j) {
            return true;
        }
    }

    public static class Solution extends Relation {
        public int findCelebrity(int n) {
            Map<Integer, Integer> inConnections = new HashMap<>();
            Map<Integer, Integer> outConnections = new HashMap<>();
            for (int i = 0; i < n; ++i) {
                for (int j = 0; j < n; ++j) {
                    if (knows(i, j)) {
                        outConnections.put(i, outConnections.getOrDefault(i, 0) + 1);
                        inConnections.put(j, inConnections.getOrDefault(j, 0) + 1);
                    }
                }
            }

            for (Map.Entry<Integer, Integer> e : inConnections.entrySet()) {
                if (e.getValue() == n && outConnections.getOrDefault(e.getKey(), 0) == 1) {
                    return e.getKey();
                }
            }

            return -1;
        }
    }
}
