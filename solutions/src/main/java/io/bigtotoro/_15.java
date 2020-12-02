package io.bigtotoro;

import java.util.*;

/**
 * <a href="https://leetcode.com/problems/3sum/">15. 3 Sum</a>
 */

public class _15 {
    public static class Solution1 {
        public List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> result = new ArrayList<>();

            Arrays.sort(nums);

            for (int i = 0; i < nums.length; i++) {
                if (i == 0 || nums[i - 1] != nums[i]) {
                    twoSum(nums, i, result);
                }
            }

            return result;
        }

        private void twoSum(int[] nums, int currentIndex, List<List<Integer>> result) {
            int h = currentIndex + 1;
            int t = nums.length - 1;
            while (h < t) {
                int sum = nums[h] + nums[t] + nums[currentIndex];
                if (sum > 0) {
                    t--;
                } else if (sum < 0) {
                    h++;
                } else if (sum == 0) {
                    result.add(List.of(nums[currentIndex], nums[h], nums[t]));
                    h++;
                    t--;
                    while (h < t && nums[h] == nums[h - 1]) {
                        h++;
                    }
                }
            }
        }
    }

    public static class Solution2 {
        public List<List<Integer>> threeSum(int[] nums) {
            Set<List<Integer>> result = new HashSet<>();
            Set<Integer> duplicates = new HashSet<>();
            Map<Integer, Integer> diffs = new HashMap<>();

            for (int i = 0; i < nums.length; i++) {
                if (duplicates.add(nums[i])) {
                    for (int j = i + 1; j < nums.length; ++j) {
                        int diff = -nums[i] - nums[j];
                        if (diffs.containsKey(diff) && diffs.get(diff) == i) {
                            List<Integer> integers = Arrays.asList(nums[i], nums[j], diff);
                            integers.sort(Comparator.naturalOrder());
                            result.add(integers);
                        }
                        diffs.put(nums[j], i);
                    }
                }
            }

            return new ArrayList<>(result);
        }
    }
}
