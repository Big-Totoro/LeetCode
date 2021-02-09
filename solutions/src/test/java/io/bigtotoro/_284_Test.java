package io.bigtotoro;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class _284_Test {

    @Test
    public void test11() {
        List<Integer> array = new ArrayList<>() {{ add(1); add(2); add(3); add(4); add(5); }};
        _284.PeekingIterator iterator = new _284.PeekingIterator(array.listIterator());
        while (iterator.hasNext()) {
            System.out.println(iterator.peek());
            System.out.println(iterator.next());
        }
    }
}
