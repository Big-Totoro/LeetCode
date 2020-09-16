package io.bigtotoro;

public class _1108 {
    public static class Solution1 {
        /**
         * Time: O(n)
         * Space: O(n)
         */
        public String defangIPaddr(String address) {
            if (address == null || address.isEmpty()) {
                return "";
            }

            StringBuilder builder = new StringBuilder(address.length() + 6);
            for (Character c : address.toCharArray()) {
                builder.append((c == '.') ? "[.]" : ".");
            }

            return builder.toString();
        }
    }
}
