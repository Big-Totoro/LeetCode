package io.bigtotoro;

/**
 * <a href="https://leetcode.com/problems/robot-return-to-origin/">657. Robot Return to Origin</a>
 */

public class _657 {
    public static class Solution1 {
        public boolean judgeCircle(String moves) {
            int vertical = 0;
            int horizontal = 0;
            for (int i = 0; i < moves.length(); ++i) {
                switch (moves.charAt(i)) {
                    case 'U' :
                        ++vertical;
                        break;
                    case 'D' :
                        --vertical;
                        break;
                    case 'L' :
                        ++horizontal;
                        break;
                    case 'R' :
                        --horizontal;
                        break;
                }
            }
            return (vertical == 0) && (horizontal == 0);
        }
    }

    public static class Solution2 {
        public boolean judgeCircle(String moves) {
            long u = moves.chars().filter(c -> c == 'U').count();
            long d = moves.chars().filter(c -> c == 'D').count();
            long r = moves.chars().filter(c -> c == 'R').count();
            long l = moves.chars().filter(c -> c == 'L').count();
            return (u == d) && (r == l);
        }
    }

}
