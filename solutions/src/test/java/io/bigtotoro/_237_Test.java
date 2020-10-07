package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _237_Test {

    private static _237.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _237.Solution1();
    }

    @Test
    public void test1() {
        _237.ListNode n1 = new _237.ListNode(1);
        _237.ListNode n2 = new _237.ListNode(2);
        _237.ListNode n3 = new _237.ListNode(3);
        _237.ListNode n4 = new _237.ListNode(4);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        int counter = 0;
        _237.ListNode n = n1;
        while (n != null) {
            ++counter;
            n = n.next;
        }
        assertThat(counter).isEqualTo(4);

        solution1.deleteNode(n3);

        counter = 0;
        n = n1;
        while (n != null) {
            ++counter;
            n = n.next;
        }

        assertThat(counter).isEqualTo(3);
    }
}
