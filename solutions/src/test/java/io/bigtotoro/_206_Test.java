package io.bigtotoro;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _206_Test {

    private static _206.Solution1 solution1;
    private static _206.Solution2 solution2;

    private _206.ListNode n1 = new _206.ListNode(1);
    private _206.ListNode n2 = new _206.ListNode(2);
    private _206.ListNode n3 = new _206.ListNode(3);
    private _206.ListNode n4 = new _206.ListNode(4);
    private _206.ListNode n5 = new _206.ListNode(5);

    @BeforeClass
    public static void setup() {
        solution1 = new _206.Solution1();
        solution2 = new _206.Solution2();
    }

    @Before
    public void init() {
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
    }

    @Test
    public void test11() {
        assertThat(n1.val).isEqualTo(1);
        assertThat(n1.next.val).isEqualTo(2);
        assertThat(n2.next.val).isEqualTo(3);
        assertThat(n3.next.val).isEqualTo(4);
        assertThat(n4.next.val).isEqualTo(5);

        n5 = solution1.reverseList(n1);

        assertThat(n5.val).isEqualTo(5);
        assertThat(n5.next.val).isEqualTo(4);
        assertThat(n4.next.val).isEqualTo(3);
        assertThat(n3.next.val).isEqualTo(2);
        assertThat(n2.next.val).isEqualTo(1);
    }

    @Test
    public void test21() {
        assertThat(n1.val).isEqualTo(1);
        assertThat(n1.next.val).isEqualTo(2);
        assertThat(n2.next.val).isEqualTo(3);
        assertThat(n3.next.val).isEqualTo(4);
        assertThat(n4.next.val).isEqualTo(5);

        n5 = solution2.reverseList(n1);

        assertThat(n5.val).isEqualTo(5);
        assertThat(n5.next.val).isEqualTo(4);
        assertThat(n4.next.val).isEqualTo(3);
        assertThat(n3.next.val).isEqualTo(2);
        assertThat(n2.next.val).isEqualTo(1);
    }
}
