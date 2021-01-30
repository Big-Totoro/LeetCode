package io.bigtotoro;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class _987_Test {

    private static final _987.Solution1 SOLUTION_1 = new _987.Solution1();

    @Test
    public void test11() {
        _987.TreeNode root = new _987.TreeNode(
                3,
                new _987.TreeNode(9),
                new _987.TreeNode(20,
                        new _987.TreeNode(15),
                        new _987.TreeNode(7))
        );
        assertThat(SOLUTION_1.verticalTraversal(root)).isEqualTo(List.of(
                List.of(9), List.of(3, 15), List.of(20), List.of(7))
        );
    }

    @Test
    public void test12() {
        _987.TreeNode root = new _987.TreeNode(
                1,
                new _987.TreeNode(2,
                        new _987.TreeNode(4),
                        new _987.TreeNode(5)),
                new _987.TreeNode(3,
                        new _987.TreeNode(6),
                        new _987.TreeNode(7))
        );
        assertThat(SOLUTION_1.verticalTraversal(root)).isEqualTo(List.of(
                List.of(4), List.of(2), List.of(1, 5, 6), List.of(3), List.of(7))
        );
    }

    @Test
    public void test13() {
        _987.TreeNode root = new _987.TreeNode(
                3,
                new _987.TreeNode(1,
                        new _987.TreeNode(0),
                        new _987.TreeNode(2)),
                new _987.TreeNode(4,
                        new _987.TreeNode(2),
                        null)
        );
        assertThat(SOLUTION_1.verticalTraversal(root)).isEqualTo(List.of(
                List.of(0), List.of(1), List.of(3, 2, 2), List.of(4))
        );
    }
}
