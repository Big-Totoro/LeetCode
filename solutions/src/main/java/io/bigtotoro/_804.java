package io.bigtotoro;

import java.util.HashSet;
import java.util.Set;

/**
 * <a href="https://leetcode.com/problems/unique-morse-code-words/">804. Unique Morse Code Words</a>
 */

public class _804 {
    public static class Solution1 {
        public int uniqueMorseRepresentations(String[] words) {
            String[] morse = new String[] {
                    ".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.",
                    "--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
            Set<String> set = new HashSet<>();

            for (String w : words) {
                String encoded = "";

                for (int i = 0; i < w.length(); i++) {
                    encoded += morse[w.charAt(i) - 'a'];
                }

                set.add(encoded);
            }

            return set.size();
        }
    }
}
