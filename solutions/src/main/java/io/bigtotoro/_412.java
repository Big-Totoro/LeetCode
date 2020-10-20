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

    public static class Solution2 {
        public List<String> fizzBuzz(int n) {
            List<String> result = new ArrayList<>(n);
            boolean div3;
            boolean div5;

            for (int i = 1; i <= n; ++i) {
                String str = "";

                div3 = i % 3 == 0;
                div5 = i % 5 == 0;
                if (div3) {
                    str += "Fizz";
                }
                if (div5) {
                    str += "Buzz";
                }
                if (str.isEmpty()) {
                    str += String.valueOf(i);
                }
                result.add(str);
            }

            return result;
        }
    }
}
