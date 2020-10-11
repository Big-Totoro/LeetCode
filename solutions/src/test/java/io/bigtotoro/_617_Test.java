package io.bigtotoro;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _617_Test {

    private static _617.Solution1 solution1;
    private static _617.Solution2 solution2;
    private _617.TreeNode root1;
    private _617.TreeNode root2;
    private _617.TreeNode root3;

    @BeforeClass
    public static void setup() {
        solution1 = new _617.Solution1();
        solution2 = new _617.Solution2();
    }

    @Before
    public void init() {
        root1 = new _617.TreeNode(1,
                new _617.TreeNode(3,
                        new _617.TreeNode(5),
                        null),
                new _617.TreeNode(2));
        root2 = new _617.TreeNode(2,
                new _617.TreeNode(1,
                        null,
                        new _617.TreeNode(1)),
                new _617.TreeNode(3,
                        null,
                        new _617.TreeNode(7)));
        root3 = new _617.TreeNode(3,
                new _617.TreeNode(4,
                        new _617.TreeNode(5),
                        new _617.TreeNode(4)),
                new _617.TreeNode(5,
                        null,
                        new _617.TreeNode(7)));
    }

    @Test
    public void test11() {
        assertThat(solution1.mergeTrees(root1, root2)).isEqualTo(root3);
    }

    @Test
    public void test21() {
        assertThat(solution2.mergeTrees(root1, root2)).isEqualTo(root3);
    }
}
