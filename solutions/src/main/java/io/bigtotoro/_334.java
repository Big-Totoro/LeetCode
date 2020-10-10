package io.bigtotoro;

import java.util.List;

/**
 * <a href="https://leetcode.com/problems/nested-list-weight-sum/">334. Nested List Weight Sum</a>
 */

public class _334 {
    public interface NestedInteger {
        // @return true if this NestedInteger holds a single integer, rather than a nested list.
        boolean isInteger();
        // @return the single integer that this NestedInteger holds, if it holds a single integer
        // Return null if this NestedInteger holds a nested list
        Integer getInteger();
        // Set this NestedInteger to hold a single integer.
        void setInteger(int value);
        // Set this NestedInteger to hold a nested list and adds a nested integer to it.
        void add(NestedInteger ni);
        // @return the nested list that this NestedInteger holds, if it holds a nested list
        // Return null if this NestedInteger holds a single integer
        List<NestedInteger> getList();
    }

    public static class Solution1 {
        private int sum;

        public int depthSum(List<NestedInteger> nestedList) {
            dfs(nestedList, 1);

            return sum;
        }

        private void dfs(List<NestedInteger> nestedList, int level) {
            for (NestedInteger n : nestedList) {
                if (n.isInteger()) {
                    sum += n.getInteger() * level;
                } else {
                    dfs(n.getList(), level + 1);
                }
            }
        }
    }
}
