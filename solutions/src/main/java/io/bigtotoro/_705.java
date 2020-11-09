package io.bigtotoro;

public class _705 {
    public static class MyHashSet {
        private final int BUCKET_SIZE = 32;
        private final int MAX_SET_SIZE = 1_000_001;
        private final int SET_SIZE = MAX_SET_SIZE / BUCKET_SIZE;
        private int[] set = new int[SET_SIZE];

        /** Initialize your data structure here. */
        public MyHashSet() {
        }

        public void add(int key) {
            int bank = key / BUCKET_SIZE;
            if (bank >= set.length) {
                return;
            }
            set[bank] |= 1 << (key % BUCKET_SIZE);
        }

        public void remove(int key) {
            int bank = key / BUCKET_SIZE;
            if (bank >= set.length) {
                return;
            }
            set[bank] &= ~(1 << (key % BUCKET_SIZE));
        }

        /** Returns true if this set contains the specified element */
        public boolean contains(int key) {
            int bank = key / BUCKET_SIZE;
            if (bank >= set.length) {
                return false;
            }
            return (set[bank] & (1 << (key % BUCKET_SIZE))) != 0;
        }
    }
}
