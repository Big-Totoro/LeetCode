package io.bigtotoro;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _160_Test {

    private static final _160.Solution1 SOLUTION_1 = new _160.Solution1();

    @Test
    public void test11() {
        _160.ListNode intersection = new _160.ListNode(8, new _160.ListNode(4, new _160.ListNode(5)));
        _160.ListNode list1 = new _160.ListNode(4, new _160.ListNode(1, intersection));
        _160.ListNode list2 = new _160.ListNode(5, new _160.ListNode(6, new _160.ListNode(1, intersection)));
        assertThat(SOLUTION_1.getIntersectionNode(list1, list2)).isEqualTo(intersection);
    }

    @Test
    public void test12() {
        _160.ListNode intersection = new _160.ListNode(2, new _160.ListNode(4));
        _160.ListNode list1 = new _160.ListNode(1, new _160.ListNode(9, new _160.ListNode(1, intersection)));
        _160.ListNode list2 = new _160.ListNode(3, intersection);
        assertThat(SOLUTION_1.getIntersectionNode(list1, list2)).isEqualTo(intersection);
    }

    @Test
    public void test13() {
        _160.ListNode list1 = new _160.ListNode(2, new _160.ListNode(6, new _160.ListNode(4)));
        _160.ListNode list2 = new _160.ListNode(1, new _160.ListNode(5));
        assertThat(SOLUTION_1.getIntersectionNode(list1, list2)).isEqualTo(null);
    }

    @Test
    public void test14() {
        _160.ListNode intersection = new _160.ListNode(4, new _160.ListNode(5, new _160.ListNode(4)));
        _160.ListNode list1 = new _160.ListNode(2, new _160.ListNode(2, intersection));
        _160.ListNode list2 = new _160.ListNode(2, new _160.ListNode(2, intersection));
        assertThat(SOLUTION_1.getIntersectionNode(list1, list2)).isEqualTo(intersection);
    }
}
