package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _1022_Test {

    private static _1022.Solution1 solution1;
    private static _1022.Solution2 solution2;

    private static _1022.TreeNode root1;
    private static _1022.TreeNode root2;
    private static _1022.TreeNode root3;
    private static _1022.TreeNode root4;

    @BeforeClass
    public static void setup() {
        solution1 = new _1022.Solution1();
        solution2 = new _1022.Solution2();

        root1 = new _1022.TreeNode(1,
                new _1022.TreeNode(0,
                        new _1022.TreeNode(0),
                        new _1022.TreeNode(1)),
                new _1022.TreeNode(1,
                        new _1022.TreeNode(0),
                        new _1022.TreeNode(1))
        );
        root2 = new _1022.TreeNode(0);
        root3 = new _1022.TreeNode(1);
        root4 = new _1022.TreeNode(1,
                    new _1022.TreeNode(1),
                    null
                );
    }

    @Test
    public void test11() {
        assertThat(solution1.sumRootToLeaf(root1)).isEqualTo(22);
    }

    @Test
    public void test12() {
        assertThat(solution1.sumRootToLeaf(root2)).isEqualTo(0);
    }

    @Test
    public void test13() {
        assertThat(solution1.sumRootToLeaf(root3)).isEqualTo(1);
    }

    @Test
    public void test14() {
        assertThat(solution1.sumRootToLeaf(root4)).isEqualTo(3);
    }

    @Test
    public void test21() {
        assertThat(solution2.sumRootToLeaf(root1)).isEqualTo(22);
    }

    @Test
    public void test22() {
        assertThat(solution2.sumRootToLeaf(root2)).isEqualTo(0);
    }

    @Test
    public void test23() {
        assertThat(solution2.sumRootToLeaf(root3)).isEqualTo(1);
    }

    @Test
    public void test24() {
        assertThat(solution2.sumRootToLeaf(root4)).isEqualTo(3);
    }
}