package io.bigtotoro;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _938_Test {

    private static _938.Solution1 solution1;
    private static _938.Solution2 solution2;

    private _938.TreeNode root;

    @BeforeClass
    public static void setup() {
        solution1 = new _938.Solution1();
        solution2 = new _938.Solution2();
    }

    @Before
    public void init() {
        root = new _938.TreeNode(10,
                new _938.TreeNode(5,
                        new _938.TreeNode(3),
                        new _938.TreeNode(7)),
                new _938.TreeNode(15,
                        null,
                        new _938.TreeNode(18))
        );
    }

    @Test
    public void test11() {
        assertThat(solution1.rangeSumBST(root, 7, 15))
                .isEqualTo(32);
    }

    @Test
    public void test21() {
        assertThat(solution2.rangeSumBST(root, 7, 15))
                .isEqualTo(32);
    }
}
