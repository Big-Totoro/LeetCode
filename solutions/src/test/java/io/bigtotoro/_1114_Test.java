package io.bigtotoro;

import org.junit.Test;

public class _1114_Test {

    @Test
    public void test11() throws InterruptedException {
        final _1114.Foo foo = new _1114.Foo();

        Thread thread1 = new Thread(() -> System.out.println("first"));
        foo.first(thread1);
        Thread thread2 = new Thread(() -> System.out.println("second"));
        foo.second(thread2);
        Thread thread3 = new Thread(() -> System.out.println("third"));
        foo.third(thread3);
    }

    @Test
    public void test12() throws InterruptedException {
        final _1114.Foo foo = new _1114.Foo();

        Thread thread1 = new Thread(() -> System.out.println("first"));
        foo.first(thread1);
        Thread thread3 = new Thread(() -> System.out.println("third"));
        foo.third(thread3);
        Thread thread2 = new Thread(() -> System.out.println("second"));
        foo.second(thread2);
    }
}