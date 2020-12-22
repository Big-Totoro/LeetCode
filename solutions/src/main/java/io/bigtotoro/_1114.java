package io.bigtotoro;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * <a href="https://leetcode.com/problems/print-in-order/">1114. Print In Order</a>
 */
public class _1114 {

    public static class Foo {

        private final ReentrantLock reentrantLock = new ReentrantLock();
        private final Condition condition2 = reentrantLock.newCondition();
        private final Condition condition3 = reentrantLock.newCondition();
        private int counter = 1;

        public Foo() {
        }

        public void first(Runnable printFirst) throws InterruptedException {
            try {
                reentrantLock.lock();
                // printFirst.run() outputs "first". Do not change or remove this line.
                printFirst.run();
                ++counter;
                condition2.signal();
            } finally {
                reentrantLock.unlock();
            }
        }

        public void second(Runnable printSecond) throws InterruptedException {
            try {
                reentrantLock.lock();

                // Wait for the "first" Thread
                while (counter != 2) {
                    condition2.await();
                }

                // printSecond.run() outputs "second". Do not change or remove this line.
                printSecond.run();
                ++counter;
                condition3.signal();
            } finally {
                reentrantLock.unlock();
            }
        }

        public void third(Runnable printThird) throws InterruptedException {
            try {
                reentrantLock.lock();

                while (counter != 3) {
                    condition3.await();
                }

                // printThird.run() outputs "third". Do not change or remove this line.
                printThird.run();
            } finally {
                reentrantLock.unlock();
            }
        }
    }
}
