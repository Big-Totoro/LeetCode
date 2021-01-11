package io.bigtotoro;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/string-compression/">443. String Compression</a>
 */

public class _443 {

    public static class Solution1 {
        public int compress(char[] chars) {
            if (chars.length == 0) {
                return 0;
            } else if (chars.length == 1) {
                return 1;
            }

            List<Character> result = new ArrayList<>();
            int counter = 1;
            for (int i = 1; i < chars.length; ++i) {
                if (chars[i - 1] == chars[i]) {
                    counter++;
                } else {
                    result.add(chars[i - 1]);
                    if (counter > 1) {
                        for (char c : String.valueOf(counter).toCharArray()) {
                            result.add(c);
                        }
                    }
                    counter = 1;
                }
            }

            result.add(chars[chars.length - 1]);
            if (counter > 1) {
                for (char c : String.valueOf(counter).toCharArray()) {
                    result.add(c);
                }
            }

            for (int i = 0; i < result.size(); ++i) {
                chars[i] = result.get(i);
            }

            return result.size();
        }
    }

    public static class Solution2 {
        public int compress(char[] chars) {
            if (chars.length == 0) {
                return 0;
            } else if (chars.length == 1) {
                return 1;
            }

            int counter = 1;
            int index = 0;
            for (int i = 1; i < chars.length; ++i) {
                if (chars[i - 1] == chars[i]) {
                    counter++;
                } else {
                    chars[index++] = chars[i - 1];
                    if (counter > 1) {
                        for (char c : String.valueOf(counter).toCharArray()) {
                            chars[index++] = c;
                        }
                    }
                    counter = 1;
                }
            }

            chars[index++] = chars[chars.length - 1];
            if (counter > 1) {
                for (char c : String.valueOf(counter).toCharArray()) {
                    chars[index++] = c;
                }
            }

            return index;
        }
    }
}
