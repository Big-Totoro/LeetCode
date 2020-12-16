package io.bigtotoro;

/**
 * <a href="https://leetcode.com/problems/find-the-town-judge/">997. Find the Town Judge</a>
 */

public class _997 {

    public static class Solution1 {

        public int findJudge(int N, int[][] trust) {
            if (trust.length < N - 1) {
                return -1;
            }

            int[] outdegreeArray = new int[N + 1];
            int[] indegreeArray = new int[N + 1];
            for (int node = 0; node < trust.length; node++) {
                int src = trust[node][0];
                int dst = trust[node][1];

                outdegreeArray[src]++;
                indegreeArray[dst]++;
            }

            for (int node = 1; node <= N; ++node) {
                if (indegreeArray[node] == N - 1 && outdegreeArray[node] == 0) {
                    return node;
                }
            }

            return -1;
        }
    }
}
