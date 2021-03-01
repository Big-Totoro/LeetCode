package io.bigtotoro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

/**
 * <a href="https://leetcode.com/problems/maximum-frequency-stack/">895. Maximum Frequency Stack</a>
 */

public class _895 {

    public static class FreqStack {

        List<Stack<Integer>> bucket;
        HashMap<Integer, Integer> map;

        public FreqStack() {
            bucket = new ArrayList<>();
            map = new HashMap<>();
        }

        public void push(int x) {
            map.put(x, map.getOrDefault(x, 0) + 1);
            int freq = map.get(x);
            if (freq - 1 >= bucket.size()) {
                bucket.add(new Stack<Integer>());
            }
            bucket.get(freq - 1).add(x);
        }

        public int pop() {
            int freq = bucket.size();
            int x = bucket.get(freq - 1).pop();
            if (bucket.get(freq - 1).isEmpty()) bucket.remove(bucket.size() - 1);

            map.put(x, map.get(x) - 1);
            if (map.get(x) == 0) map.remove(x);

            return x;
        }
    }

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 */
}
