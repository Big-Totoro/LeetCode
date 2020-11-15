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
                String e = parts[0].replace(".", "");
                if (e.contains("+")) {
                    e = e.substring(0, e.indexOf("+"));
                }
                result.add(e + "@" + parts[1]);
            }

            return result.size();
        }
    }
}
