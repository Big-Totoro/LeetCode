package io.bigtotoro;

/**
 * <a href="https://leetcode.com/problems/permutation-in-string/">567. Permutation in String</a>
 */

public class _567 {

    public static class Solution1 {
        public boolean checkInclusion(String s1, String s2) {
            if (s1.length() > s2.length()) {
                return false;
            }
            int[] freq1 = new int[26];
            int[] freq2 = new int[26];

            for (int i = 0; i < s1.length(); ++i) {
                freq1[s1.charAt(i) - 'a']++;
                freq2[s2.charAt(i) - 'a']++;
            }

            int l = 0;
            int r = s1.length() - 1;
            while (l < s2.length() - s1.length()) {
                if (isEquals(freq1, freq2)) return true;
                freq2[s2.charAt(l) - 'a']--;
                l++;
                r++;
                freq2[s2.charAt(r) - 'a']++;
            }

            return isEquals(freq1, freq2);
        }

        private boolean isEquals(int[] freq1, int[] freq2) {
            for (int i = 0; i < 26; ++i) {
                if (freq1[i] != freq2[i]) {
                    return false;
                }
            }
            return true;
        }
    }
}
