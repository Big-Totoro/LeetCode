package io.bigtotoro;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * <a href="https://leetcode.com/problems/subdomain-visit-count/">811. Subdomain Visit Count</a>
 */

public class _811 {
    public static class Solution1 {
        public List<String> subdomainVisits(String[] cpdomains) {
            Map<String, Integer> domainsMap = new HashMap<>();

            Arrays.stream(cpdomains).forEach(domain -> {
                int spaceDiv = domain.indexOf(" ");
                Integer cp = Integer.valueOf(domain.substring(0, spaceDiv));
                String[] subdomains = domain.substring(spaceDiv + 1).split("\\.");
                String subdomain = "";

                for (int i = subdomains.length - 1; i >= 0; --i) {
                    if (i == subdomains.length - 1) {
                        subdomain = subdomains[i];
                    } else {
                        subdomain = subdomains[i] + "." + subdomain;
                    }

                    domainsMap.compute(subdomain, (k, v) -> (v == null) ? cp : v + cp);
                }
            });

            List<String> result = domainsMap
                    .entrySet()
                    .stream()
                    .map(e -> "" + e.getValue() + " " + e.getKey())
                    .collect(Collectors.toList());

            return result;
        }
    }
}
