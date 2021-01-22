package io.bigtotoro;

import java.util.Stack;

/**
 * <a href="https://leetcode.com/problems/find-the-most-competitive-subsequence/">1673. Find the Most Competitive Subsequence</a>
 */

public class _1673 {

    public static class Solution1 {
        public int[] mostCompetitive(int[] nums, int k) {
            Stack<Integer> stack = new Stack<>();
            int steps = nums.length - k;

            for (int i = 0; i < nums.length; ++i) {
                while (!stack.isEmpty() && stack.peek() > nums[i] && steps > 0) {
                    stack.pop();
                    steps--;
                }
                stack.push(nums[i]);
            }

            while (stack.size() > k) {
                stack.pop();
            }

            int[] result = new int[k];
            for (int i = k - 1; i >= 0; --i) {
                result[i] = stack.pop();
            }

            return result;
        }
    }
}
