package io.bigtotoro;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * <a href="https://leetcode.com/problems/decompress-run-length-encoded-list/">1313. Decompress Run-Length Encoded List</a>
 */

public class _1313 {
    public static class Solution1 {
        public int[] decompressRLElist(int[] nums) {
            List<Integer> result = new ArrayList<>();

            for (int i = 0; i < nums.length; i += 2) {
                final int value = nums[i + 1];
                result.addAll(Stream.generate(() -> value).limit(nums[i]).collect(Collectors.toList()));
            }

            int[] temp = new int[result.size()];
            for (int i = 0; i < result.size(); i++) {
                temp[i] = result.get(i);
            }

            return temp;
        }
    }

    public static class Solution2 {
        public int[] decompressRLElist(int[] nums) {
            int size = 0;

            for (int i = 0; i < nums.length; i += 2) {
                size += nums[i];
            }

            int[] result = new int[size];
            int index = 0;

            for (int i = 0; i < nums.length; i += 2) {
                for (int j = 0; j < nums[i]; j++) {
                    result[index++] = nums[i + 1];
                }
            }

            return result;
        }
    }

}
