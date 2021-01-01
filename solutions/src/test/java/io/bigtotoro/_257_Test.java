package io.bigtotoro;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class _257_Test {

    private static final _257.Solution1 SOLUTION_1 = new _257.Solution1();
    private static final _257.Solution2 SOLUTION_2 = new _257.Solution2();

    @Test
    public void test11() {
        assertThat(SOLUTION_1.binaryTreePaths(
                new _257.TreeNode(1,
                        new _257.TreeNode(2,
                                null,
                                new _257.TreeNode(5)
                        ),
                        new _257.TreeNode(3))
            )
        ).isEqualTo(List.of("1->2->5", "1->3"));
    }

    @Test
    public void test21() {
        assertThat(SOLUTION_2.binaryTreePaths(
                new _257.TreeNode(1,
                        new _257.TreeNode(2,
                                null,
                                new _257.TreeNode(5)
                        ),
                        new _257.TreeNode(3))
            )
        ).isEqualTo(List.of("1->2->5", "1->3"));
    }
}
