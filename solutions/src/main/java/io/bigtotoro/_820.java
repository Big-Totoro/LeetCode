package io.bigtotoro;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/short-encoding-of-words/">820. Short Encoding of Words</a>
 */

public class _820 {

    public static class Solution1 {
        public int minimumLengthEncoding(String[] words) {
            class Trie {
                private Map<Character, Trie> next = new HashMap<>();
            }

            int result = 0;
            Trie root = new Trie();
            Arrays.sort(words, (u, v) -> v.length() - u.length());

            for (String word : words) {
                Trie current = root;
                boolean wasAdded = false;

                for (int i = word.length() - 1; i >= 0; --i) {
                    Character ch = word.charAt(i);
                    if (!current.next.containsKey(ch)) {
                        current.next.put(ch, new Trie());
                        wasAdded = true;
                    }
                    current = current.next.get(ch);
                }

                if (wasAdded) {
                    result += word.length() + 1;
                }
            }

            return result;
        }
    }
}
