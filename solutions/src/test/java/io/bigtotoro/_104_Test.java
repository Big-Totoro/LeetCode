package io.bigtotoro;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _104_Test {

    private static _104.Solution1 solution1;
    private static _104.Solution2 solution2;

    private _104.TreeNode root;

    @BeforeClass
    public static void setup() {
        solution1 = new _104.Solution1();
        solution2 = new _104.Solution2();
    }

    @Before
    public void init() {
        root = new _104.TreeNode(3,
                new _104.TreeNode(9),
                new _104.TreeNode(20,
                        new _104.TreeNode(15),
                        new _104.TreeNode(7)));
    }

    @Test
    public void test11() {
        assertThat(solution1.maxDepth(root)).isEqualTo(3);
    }

    @Test
    public void test21() {
        assertThat(solution2.maxDepth(root)).isEqualTo(3);
    }
}
