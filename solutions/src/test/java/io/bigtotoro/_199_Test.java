package io.bigtotoro;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class _199_Test {

    private static final _199.Solution1 SOLUTION_1 = new _199.Solution1();

    @Test
    public void test11() {
        _199.TreeNode root = new _199.TreeNode(
                1,
                new _199.TreeNode(2,
                        null,
                        new _199.TreeNode(5)),
                new _199.TreeNode(3,
                        null,
                        new _199.TreeNode(4))
        );
        assertThat(SOLUTION_1.rightSideView(root)).isEqualTo(List.of(1, 3, 4));
    }
}
