package io.bigtotoro;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/build-an-array-with-stack-operations/">1441. Build an Array With Stack Operations</a>
 */

public class _1441 {

    public static class Solution1 {
        public List<String> buildArray(int[] target, int n) {
            int counter = 1;
            List<String> result = new ArrayList<>();
            for (int i = 0; i < target.length; ++i) {
                while (counter < target[i]) {
                    result.add("Push");
                    result.add("Pop");
                    ++counter;
                }
                result.add("Push");
                ++counter;
            }

            return result;
        }
    }
}
