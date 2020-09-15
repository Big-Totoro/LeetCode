package io.bigtotoro;

import java.util.Set;
import java.util.TreeSet;

/**
 * <a href="https://leetcode.com/problems/jewels-and-stones/">771. Jewels and Stones</a>
 */

public class _771 {
    public static class Solution1 {
        public int numJewelsInStones(String J, String S) {
            Set<Character> jewels = new TreeSet<>();
            for (Character c : J.toCharArray()) {
                jewels.add(c);
            }

            int counter = 0;
            for (Character c : S.toCharArray()) {
                if (jewels.contains(c)) {
                    ++counter;
                }
            }
            return counter;
        }
    }
}
