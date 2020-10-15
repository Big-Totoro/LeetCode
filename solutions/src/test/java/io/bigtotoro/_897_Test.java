package io.bigtotoro;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _897_Test {

    private static _897.Solution1 solution1;
    private static _897.Solution2 solution2;

    private _897.TreeNode root;
    private _897.TreeNode result;

    @Before
    public void setup() {
        solution1 = new _897.Solution1();
        solution2 = new _897.Solution2();

        /**
         * Prepare the input tree
         */
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

        /**
         * Prepare the result tree
         */
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

    @Test
    public void test21() {
        assertThat(solution2.increasingBST(root))
                .isEqualTo(result);
    }
}
