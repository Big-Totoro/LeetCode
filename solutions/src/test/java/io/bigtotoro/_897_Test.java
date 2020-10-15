package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _897_Test {

    private static _897.Solution1 solution1;

    private static _897.TreeNode root;
    private static _897.TreeNode result;

    @BeforeClass
    public static void setup() {
        solution1 = new _897.Solution1();

        root = new _897.TreeNode(5,
                new _897.TreeNode(3,
                        new _897.TreeNode(2,
                                new _897.TreeNode(1),
                                null),
                        new _897.TreeNode(4)),
                new _897.TreeNode(6,
                        null,
                        new _897.TreeNode(8,
                                new _897.TreeNode(7),
                                new _897.TreeNode(9)
                        )
                )
        );

        result = new _897.TreeNode(1,
                null,
                new _897.TreeNode(2,
                        null,
                        new _897.TreeNode(3,
                                null,
                                new _897.TreeNode(4,
                                        null,
                                        new _897.TreeNode(5,
                                                null,
                                                new _897.TreeNode(6,
                                                        null,
                                                        new _897.TreeNode(7,
                                                                null,
                                                                new _897.TreeNode(8,
                                                                        null,
                                                                        new _897.TreeNode(9)
                                                                )
                                                        )
                                                )
                                        )
                                )
                        )
                )
        );
    }

    @Test
    public void test11() {
        assertThat(solution1.increasingBST(root))
                .isEqualTo(result);
    }
}
