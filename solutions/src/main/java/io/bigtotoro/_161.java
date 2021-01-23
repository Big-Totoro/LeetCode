package io.bigtotoro;

/**
 * <a href="https://leetcode.com/problems/one-edit-distance/">161. One Edit Distance</a>
 */

public class _161 {

    public static class Solution1 {
        public boolean isOneEditDistance(String s, String t) {
            if (s.length() == 0 && t.length() == 0) {
                return false;
            }

            if (s.equals(t)) {
                return false;
            }

            // We need to check the possibility of the one replace action
            // Or we need to check the possibility of the one insert action
            // Or we need to check the possibility of the one delete action
            if (s.length() == t.length()) {
                return matchOrReplace(s, t);
            } else if (s.length() == t.length() - 1) {
                return deleteOrInsert(t, s);
            } else if (s.length() == t.length() + 1) {
                return deleteOrInsert(s, t);
            }

            return false;
        }

        private boolean deleteOrInsert(String s, String t) {
            int candidate = s.length() - 1;
            /**
             * Look for the one character as a candidate for the removing
             */
            for (int i = 0; i < t.length(); ++i) {
                if (s.charAt(i) != t.charAt(i)) {
                    candidate = i;
                    break;
                }
            }

            // Construct new string without the candidate
            return (s.substring(0, candidate) + s.substring(candidate + 1)).equals(t);
        }

        private boolean matchOrReplace(String s, String t) {
            boolean needReplace = false;

            for (int i = 0; i < s.length(); ++i) {
                /**
                 * We allow only one replace
                 */
                if (s.charAt(i) != t.charAt(i)) {
                    if (needReplace == false) {
                        needReplace = true;
                    } else {
                        return false;
                    }
                }
            }

            return true;
        }
    }
}
