package io.bigtotoro;

import java.util.HashSet;
import java.util.Set;

/**
 * <a href="https://leetcode.com/problems/unique-email-addresses/">229. Unique Email Addresses</a>
 */

public class _929 {
    public static class Solution1 {
        public int numUniqueEmails(String[] emails) {
            if (emails.length == 0) {
                return 0;
            }

            Set<String> result = new HashSet<>();

            for (String email : emails) {
                String[] parts = email.split("@");
                StringBuilder builder = new StringBuilder();
                for (int i = 0; i < parts[0].length(); ++i) {
                    if (parts[0].charAt(i) == '.') {
                        continue;
                    } else if (parts[0].charAt(i) == '+') {
                        break;
                    }
                    builder.append(parts[0].charAt(i));
                }
                result.add(builder.append("@").append(parts[1]).toString());
            }

            return result.size();
        }
    }
}
