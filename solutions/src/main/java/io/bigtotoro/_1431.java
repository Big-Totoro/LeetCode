package io.bigtotoro;

import java.util.ArrayList;
import java.util.List;

public class _1431 {
    public static class Solution1 {
        public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
            List<Boolean> result = new ArrayList<>(candies.length);

            int max = candies[0];
            for (int c : candies) {
                if (c >= max) {
                    max = c;
                }
            }

            for (int c : candies) {
                if (c + extraCandies >= max) {
                    result.add(true);
                } else {
                    result.add(false);
                }
            }

            return result;
        }
    }
}
