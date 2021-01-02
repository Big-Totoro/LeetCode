package io.bigtotoro;

/**
 * <a href="https://leetcode.com/problems/verifying-an-alien-dictionary/">953. Verifying an Alien Dictionary</a>
 */

public class _953 {

    public static class Solution1 {
        public boolean isAlienSorted(String[] words, String order) {
            int[] alphabet = new int[26];
            for (int i = 0; i < order.length(); ++i) {
                alphabet[order.charAt(i) - 'a'] = i;
            }

            next: for (int i = 0; i < words.length - 1; ++i) {
                int l = 0;
                int r = 0;
                while (l < words[i].length() && r < words[i + 1].length()) {
                    if (words[i].charAt(l) != words[i + 1].charAt(r)) {
                        if (alphabet[words[i].charAt(l) - 'a'] > alphabet[words[i + 1].charAt(r) - 'a']) {
                            return false;
                        } else {
                            continue next;
                        }
                    }

                    l++;
                    r++;
                }
                if (words[i].length() > words[i + 1].length()) {
                    return false;
                }
            }

            return true;
        }
    }
}
