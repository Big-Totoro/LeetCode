package io.bigtotoro;

public class _849 {
    public static class Solution1 {
        public int maxDistToClosest(int[] seats) {
            if (seats == null || seats.length == 0) {
                return 0;
            }

            int result = 0;
            int val = 0;

            for (int i = 0; i < seats.length; i++) {
                if (seats[i] == 1) {
                    val = 0;
                } else {
                    ++val;
                    result = Math.max(result, (val + 1) / 2);
                }
            }

            for (int i = 0; i < seats.length; i++) {
                if (seats[i] == 1) {
                    result = Math.max(result, i);
                    break;
                }
            }

            for (int i = seats.length - 1; i >= 0; i--) {
                if (seats[i] == 1) {
                    result = Math.max(result, seats.length - 1 - i);
                    break;
                }
            }

            return result;
        }
    }
}
