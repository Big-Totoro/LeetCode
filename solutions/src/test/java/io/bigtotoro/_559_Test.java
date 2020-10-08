package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class _559_Test {

    private static _559.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _559.Solution1();
    }

    @Test
    public void test11() {
        _559.Node root = new _559.Node(1);

        _559.Node n2 = new _559.Node(2);
        _559.Node n3 = new _559.Node(3);
        _559.Node n4 = new _559.Node(4);
        _559.Node n5 = new _559.Node(5);
        root.children = List.of(n2, n3, n4, n5);

        _559.Node n6 = new _559.Node(6);
        _559.Node n7 = new _559.Node(7);
        n3.children = List.of(n6, n7);

        _559.Node n8 = new _559.Node(8);
        n4.children = List.of(n8);

        _559.Node n9 = new _559.Node(9);
        _559.Node n10 = new _559.Node(10);
        n5.children = List.of(n9, n10);

        _559.Node n11 = new _559.Node(11);
        n7.children = List.of(n11);

        _559.Node n12 = new _559.Node(12);
        n8.children = List.of(n12);

        _559.Node n13 = new _559.Node(13);
        n9.children = List.of(n13);

        _559.Node n14 = new _559.Node(14);
        n11.children = List.of(n14);

        assertThat(solution1.maxDepth(root)).isEqualTo(5);
    }
}
