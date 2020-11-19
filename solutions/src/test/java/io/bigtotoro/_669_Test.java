package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _669_Test {

    private static _669.Solution1 solution1;

    private static _669.TreeNode root1;
    private static _669.TreeNode root2;
    private static _669.TreeNode root3;
    private static _669.TreeNode root4;
    private static _669.TreeNode root5;

    private static _669.TreeNode expected1;
    private static _669.TreeNode expected2;
    private static _669.TreeNode expected3;
    private static _669.TreeNode expected4;
    private static _669.TreeNode expected5;

    @BeforeClass
    public static void setup() {
        solution1 = new _669.Solution1();

        root1 = new _669.TreeNode(
                1,
                new _669.TreeNode(0),
                new _669.TreeNode(2)
        );

        root2 = new _669.TreeNode(
                3,
                new _669.TreeNode(0,
                        null,
                        new _669.TreeNode(2,
                                new _669.TreeNode(1),
                                null
                        )
                ),
                new _669.TreeNode(4)
        );

        root3 = new _669.TreeNode(1);

        root4 = new _669.TreeNode(1,
                null,
                new _669.TreeNode(2)
        );

        root5 = new _669.TreeNode(1,
                null,
                new _669.TreeNode(2)
        );

        expected1 = new _669.TreeNode(1,
                null,
                new _669.TreeNode(2)
        );

        expected2 = new _669.TreeNode(
                3,
                new _669.TreeNode(
                        2,
                        new _669.TreeNode(1),
                        null
                ),
                null
        );

        expected3 = new _669.TreeNode(1);

        expected4 = new _669.TreeNode(1,
                null,
                new _669.TreeNode(2)
        );

        expected5 = new _669.TreeNode(2);
    }

    @Test
    public void test11() {
        assertThat(solution1.trimBST(root1, 1, 2)).isEqualTo(expected1);
    }

    @Test
    public void test12() {
        assertThat(solution1.trimBST(root2, 1, 3)).isEqualTo(expected2);
    }

    @Test
    public void test13() {
        assertThat(solution1.trimBST(root3, 1, 2)).isEqualTo(expected3);
    }

    @Test
    public void test14() {
        assertThat(solution1.trimBST(root4, 1, 3)).isEqualTo(expected4);
    }

    @Test
    public void test15() {
        assertThat(solution1.trimBST(root5, 2, 4)).isEqualTo(expected5);
    }
}
