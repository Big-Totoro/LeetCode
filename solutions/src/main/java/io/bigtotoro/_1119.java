package io.bigtotoro;

/**
 * <a href="https://leetcode.com/problems/remove-vowels-from-a-string/">1119. Remove Vowels from a String</a>
 */

public class _1119 {
    public static class Solution1 {
        /**
         * Time: O(n)
         * Space: O(2*n)
         */
        public String removeVowels(String S) {
            if ((S == null) || (S.length() == 0)) {
                return "";
            }

            StringBuilder builder = new StringBuilder(S.length());
            for (Character c : S.toCharArray()) {
                switch (c) {
                    case 'a' :
                    case 'e' :
                    case 'i' :
                    case 'o' :
                    case 'u' :
                        continue;
                }
                builder.append(c);
            }

            return builder.toString();
        }
    }

    public static class Solution2 {
        /**
         * Time: O(n)
         * Space: O(2*n)
         */
        public String removeVowels(String S) {
            if ((S == null) || (S.length() == 0)) {
                return "";
            }

            char[] result = new char[S.length()];

            int idx = 0;
            for (Character c : S.toCharArray()) {
                switch (c) {
                    case 'a' :
                    case 'e' :
                    case 'i' :
                    case 'o' :
                    case 'u' :
                        continue;
                }

                result[idx++] = c;
            }

            return new String(result, 0, idx);
        }
    }
}
