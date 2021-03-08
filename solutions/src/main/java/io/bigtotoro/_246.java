package io.bigtotoro;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/strobogrammatic-number/">246. Strobogrammatic Number</a>
 */

public class _246 {

    public static class Solution1 {
        public boolean isStrobogrammatic(String num) {
            Map<Character, Character> mapping = new HashMap<>() {{
                put('1', '1');
                put('6', '9');
                put('8', '8');
                put('9', '6');
                put('0', '0');
            }};

            if (num.length() == 1) {
                return num.charAt(0) != '6' && num.charAt(0) != '9' && mapping.containsKey(num.charAt(0));
            }

            int l = 0;
            int r = num.length() - 1;
            while (l <= r) {
                if (num.charAt(r) != mapping.getOrDefault(num.charAt(l), 'A')) {
                    return false;
                }
                ++l;
                --r;
            }

            return true;
        }
    }
}
