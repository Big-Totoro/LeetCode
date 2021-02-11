package io.bigtotoro;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _138_Test {

    private static final _138.Solution1 SOLUTION_1 = new _138.Solution1();

    @Test
    public void test11() {
        _138.Node node4 = new _138.Node(1);
        _138.Node node3 = new _138.Node(10, node4);
        _138.Node node2 = new _138.Node(11, node3);
        _138.Node node1 = new _138.Node(13, node2);
        _138.Node head = new _138.Node(7, node1);

        head.random = null;
        node1.random = head;
        node2.random = node4;
        node3.random = node2;
        node4.random = head;

        assertThat(SOLUTION_1.copyRandomList(head));
    }
}
