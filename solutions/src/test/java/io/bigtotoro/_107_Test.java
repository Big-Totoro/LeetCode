package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class _107_Test {

    private static _107.Solution1 solution1;

    private static _107.TreeNode root1;
    private static _107.TreeNode root2;

    @BeforeClass
    public static void setup() {
        solution1 = new _107.Solution1();

        root1 = new _107.TreeNode(3,
                new _107.TreeNode(9),
                new _107.TreeNode(20,
                        new _107.TreeNode(15),
                        new _107.TreeNode(7)
                )
        );

        root2 = new _107.TreeNode(1,
                    new _107.TreeNode(2,
                            new _107.TreeNode(4),
                            null),
                    new _107.TreeNode(3,
                            null,
                            new _107.TreeNode(5)
                    )
                );
    }

    @Test
    public void test11() {
        assertThat(solution1.levelOrderBottom(root1))
                .isEqualTo(List.of(List.of(15, 7), List.of(9, 20), List.of(3)));
    }

    @Test
    public void test12() {
        assertThat(solution1.levelOrderBottom(root2))
                .isEqualTo(List.of(List.of(4, 5), List.of(2, 3), List.of(1)));
    }
}
