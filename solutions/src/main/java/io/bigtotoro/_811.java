package io.bigtotoro;

import java.util.*;
import java.util.stream.Collectors;

/**
 * <a href="https://leetcode.com/problems/subdomain-visit-count/">811. Subdomain Visit Count</a>
 */
public class _811 {
    public static class Solution1 {
        public List<String> subdomainVisits(String[] cpdomains) {
            Map<String, Integer> map = new HashMap<>();

            Arrays.stream(cpdomains).forEach(domain -> {
                String[] d = domain.split(" ");
                int count = Integer.valueOf(d[0]);
                final String subdomain = "";
                Arrays.stream(d[1].split("\\.")).forEach(subdomains -> {
                    map.compute(subdomains + subdomain, (k, v) -> v == null ? count : count + v);
                });

            });

            List<String> result = new ArrayList<>();
            for (Map.Entry<String, Integer> e : map.entrySet()) {
                result.add(String.format("%d %s", e.getValue(), e.getKey()));
            }

            return result;
        }
    }
}
