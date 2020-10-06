package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _1290_Test {

    private static _1290.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1290.Solution1();
    }

    @Test
    public void test11() {
        _1290.Solution1.ListNode l1 = new _1290.Solution1.ListNode(1);
        _1290.Solution1.ListNode l2 = new _1290.Solution1.ListNode(0, l1);
        _1290.Solution1.ListNode head = new _1290.Solution1.ListNode(1, l2);
        assertThat(solution1.getDecimalValue(head)).isEqualTo(5);
    }

    @Test
    public void test12() {
        _1290.Solution1.ListNode head = new _1290.Solution1.ListNode(0);
        assertThat(solution1.getDecimalValue(head)).isEqualTo(0);
    }

    @Test
    public void test13() {
        _1290.Solution1.ListNode head = new _1290.Solution1.ListNode(1);
        assertThat(solution1.getDecimalValue(head)).isEqualTo(1);
    }

    @Test
    public void test14() {
        _1290.Solution1.ListNode l1 = new _1290.Solution1.ListNode(0);
        _1290.Solution1.ListNode l2 = new _1290.Solution1.ListNode(0, l1);
        _1290.Solution1.ListNode l3 = new _1290.Solution1.ListNode(0, l2);
        _1290.Solution1.ListNode l4 = new _1290.Solution1.ListNode(0, l3);
        _1290.Solution1.ListNode l5 = new _1290.Solution1.ListNode(0, l4);
        _1290.Solution1.ListNode l6 = new _1290.Solution1.ListNode(0, l5);

        _1290.Solution1.ListNode l7 = new _1290.Solution1.ListNode(1, l6);
        _1290.Solution1.ListNode l8 = new _1290.Solution1.ListNode(1, l7);
        _1290.Solution1.ListNode l9 = new _1290.Solution1.ListNode(1, l8);

        _1290.Solution1.ListNode l10 = new _1290.Solution1.ListNode(0, l9);
        _1290.Solution1.ListNode l11 = new _1290.Solution1.ListNode(0, l10);

        _1290.Solution1.ListNode l12 = new _1290.Solution1.ListNode(1, l11);

        _1290.Solution1.ListNode l13 = new _1290.Solution1.ListNode(0, l12);
        _1290.Solution1.ListNode l14 = new _1290.Solution1.ListNode(0, l13);

        _1290.Solution1.ListNode head = new _1290.Solution1.ListNode(1, l14);

        assertThat(solution1.getDecimalValue(head)).isEqualTo(18880);
    }

}
