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

    public static class Solution2 {
        public boolean isOneEditDistance(String s, String t) {
            if (s.length() == 0 && t.length() == 0) {
                return false;
            }

            final int N = s.length();
            final int M = t.length();
            int[][] d = new int[N + 1][M + 1];

            for (int i = 0; i <= N; ++i) {
                d[i][0] = i;
            }

            for (int i = 0; i <= M; ++i) {
                d[0][i] = i;
            }

            for (int i = 1; i <= N; ++i) {
                for (int j = 1; j <= M; ++j) {
                    int insert = 1 + d[i - 1][j];
                    int delete = 1 + d[i][j - 1];
                    int matchOrReplace = d[i - 1][j - 1] + (s.charAt(i - 1) == t.charAt(j - 1) ? 0 : 1);

                    d[i][j] = Math.min(insert, Math.min(delete, matchOrReplace));
                }
            }

            return d[N][M] == 1;
        }
    }
}
