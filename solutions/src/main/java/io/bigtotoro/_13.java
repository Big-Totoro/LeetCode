package io.bigtotoro;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/roman-to-integer/">13. Roman to Integer</a>
 */

public class _13 {
    /**
     * T: O(N)
     * S: O(1)
     */
    public static class Solution1 {
        public int romanToInt(String s) {
            if (s.length() <= 0) {
                return 0;
            }

            int result = 0;

            for (int i = 0; i < s.length(); ++i) {
                if (s.charAt(i) == 'I') {
                    if (i < s.length() - 1) {
                        if (s.charAt(i + 1) == 'V') {
                            result += 4;
                            i++;
                        } else if (s.charAt(i + 1) == 'X') {
                            result += 9;
                            i++;
                        } else {
                            result += 1;
                        }
                    } else {
                        result += 1;
                    }
                } else if (s.charAt(i) == 'X') {
                    if (i < s.length() - 1) {
                        if (s.charAt(i + 1) == 'L') {
                            result += 40;
                            i++;
                        } else if (s.charAt(i + 1) == 'C') {
                            result += 90;
                            i++;
                        } else {
                            result += 10;
                        }
                    } else {
                        result += 10;
                    }
                } else if (s.charAt(i) == 'C') {
                    if (i < s.length() - 1) {
                        if (s.charAt(i + 1) == 'D') {
                            result += 400;
                            i++;
                        } else if (s.charAt(i + 1) == 'M') {
                            result += 900;
                            i++;
                        } else {
                            result += 100;
                        }
                    } else {
                        result += 100;
                    }
                } else if (s.charAt(i) == 'V') {
                    result += 5;
                } else if (s.charAt(i) == 'L') {
                    result += 50;
                } else if (s.charAt(i) == 'D') {
                    result += 500;
                } else if (s.charAt(i) == 'M') {
                    result += 1000;
                }
            }

            return result;
        }
    }

    /**
     * T: O(N)
     * S: O(1)
     */
    public static class Solution2 {
        private Map<String, Integer> roman = new HashMap<>();

        public Solution2() {

        }

        private int romanToInt() {
            return 0;
        }

        public int romanToInt(String s) {
            return 0;
        }


    }
}