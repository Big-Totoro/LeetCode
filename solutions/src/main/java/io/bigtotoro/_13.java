package io.bigtotoro;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/roman-to-integer/">13. Roman to Integer</a>
 */

public class _13 {
    /**
     * T: O(1)
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
     * T: O(1)
     * S: O(1)
     */
    public static class Solution2 {
        private Map<Character, Integer> roman = new HashMap<>();

        public Solution2() {
            roman.put('I', 1);
            roman.put('V', 5);
            roman.put('X', 10);
            roman.put('L', 50);
            roman.put('C', 100);
            roman.put('D', 500);
            roman.put('M', 1000);
        }

        private int romanToInt(char roman) {
            return this.roman.get(roman);
        }

        public int romanToInt(String s) {
            int result = 0;

            for (int i = 0; i < s.length(); ++i) {
                int v = romanToInt(s.charAt(i));
                if (i > 0 && v > romanToInt(s.charAt(i - 1))) {
                    v = -2 * romanToInt(s.charAt(i - 1)) + v;
                }
                result += v;
            }

            return result;
        }
    }
}