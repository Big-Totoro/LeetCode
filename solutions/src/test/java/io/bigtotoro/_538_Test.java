package io.bigtotoro;

import org.junit.Test;

public class _538_Test {

    private static final _538.Solution1 SOLUTION_1 = new _538.Solution1();

    @Test
    public void test11() {
        _538.TreeNode root = new _538.TreeNode(
                4,
                new _538.TreeNode(1,
                        new _538.TreeNode(0),
                        new _538.TreeNode(2,
                                null,
                                new _538.TreeNode(3))),
                new _538.TreeNode(6,
                        new _538.TreeNode(5),
                        new _538.TreeNode(7,
                                null,
                                new _538.TreeNode(8)))
        );
        SOLUTION_1.convertBST(root);
    }
}
