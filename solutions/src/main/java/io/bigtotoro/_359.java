package io.bigtotoro;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/logger-rate-limiter/">359. Logger Rate Limiter</a>
 */

public class _359 {
    public static class Solution1 {
        public static class Logger {

            private Map<String, Integer> map = new HashMap<>();

            /**
             * Initialize your data structure here.
             */
            public Logger() {

            }

            /**
             * Returns true if the message should be printed in the given timestamp, otherwise returns false.
             * If this method returns false, the message will not be printed.
             * The timestamp is in seconds granularity.
             */
            public boolean shouldPrintMessage(int timestamp, String message) {
                Integer t = map.get(message);
                if ((t == null) || (timestamp - t >= 10)) {
                    map.put(message, timestamp);
                    return true;
                }

                return false;
            }
        }
    }
}
