package io.bigtotoro;

/**
 * <a href="https://leetcode.com/problems/rotate-string/">796. Rotate String</a>
 */

public class _796 {

    public static class Solution1 {
        public boolean rotateString(String A, String B) {
            return (A.length() == B.length() && (A + A).contains(B));
        }
    }
}
