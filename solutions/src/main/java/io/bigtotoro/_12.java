package io.bigtotoro;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/integer-to-roman/">12. Integer to Roman</a>
 */

public class _12 {

    public static class Solution1 {
        public String intToRoman(int num) {
            Map<Integer, String> mapping = new LinkedHashMap<>() {{
                put(1000, "M");
                put(900, "CM");
                put(500, "D");
                put(400, "CD");
                put(100, "C");
                put(90, "XC");
                put(50, "L");
                put(40, "XL");
                put(10, "X");
                put(9, "IX");
                put(5, "V");
                put(4, "IV");
                put(1, "I");
            }};

            StringBuilder builder = new StringBuilder();
            for (var e : mapping.entrySet()) {
                while (num >= e.getKey()) {
                    num -= e.getKey();
                    builder.append(e.getValue());
                }
            }

            return builder.toString();
        }
    }
}
