package io.bigtotoro;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/fizz-buzz/">412. Fizz Buzz</a>
 */

public class _412 {
    public static class Solution1 {
        public List<String> fizzBuzz(int n) {
            List<String> result = new ArrayList<>(n);

            for (int i = 1; i <= n; ++i) {
                if ((i % 3 == 0) && (i % 5 == 0)) {
                    result.add("FizzBuzz");
                } else if (i % 3 == 0) {
                    result.add("Fizz");
                } else if (i % 5 == 0) {
                    result.add("Buzz");
                } else {
                    result.add(String.valueOf(i));
                }
            }

            return result;
        }
    }
}
