package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _965_Test {

    private static _965.Solution1 solution1;

    private static _965.TreeNode root1;
    private static _965.TreeNode root2;

    @BeforeClass
    public static void setup() {
        solution1 = new _965.Solution1();

        root1 = new _965.TreeNode(1,
                new _965.TreeNode(1,
                        new _965.TreeNode(1),
                        new _965.TreeNode(1)
                ),
                new _965.TreeNode(1,
                        null,
                        new _965.TreeNode(1)
                )
        );

        root2 = new _965.TreeNode(
                2,
                new _965.TreeNode(2,
                        new _965.TreeNode(5),
                        new _965.TreeNode(2)),
                new _965.TreeNode(2)
        );
    }

    @Test
    public void test11() {
        assertThat(solution1.isUnivalTree(root1))
                .isEqualTo(true);
    }

    @Test
    public void test12() {
        assertThat(solution1.isUnivalTree(root2))
                .isEqualTo(false);
    }
}
