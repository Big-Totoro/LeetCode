package io.bigtotoro;

import java.util.Iterator;

/**
 * <a href="https://leetcode.com/problems/peeking-iterator/">284. Peeking Iterator</a>
 */

public class _284 {

    public static class PeekingIterator implements Iterator<Integer> {

        private Integer value;
        private Iterator<Integer> iterator;

        public PeekingIterator(Iterator<Integer> iterator) {
            this.iterator = iterator;
            if (iterator.hasNext()) {
                value = iterator.next();
            }
        }

        // Returns the next element in the iteration without advancing the iterator.
        public Integer peek() {
            return value;
        }

        // hasNext() and next() should behave the same as in the Iterator interface.
        // Override them if needed.
        @Override
        public Integer next() {
            Integer temp = value;
            value = iterator.hasNext() ? iterator.next() : null;

            return temp;
        }

        @Override
        public boolean hasNext() {
            return value != null;
        }
    }
}
