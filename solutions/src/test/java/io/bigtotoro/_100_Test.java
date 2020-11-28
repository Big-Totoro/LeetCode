package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _100_Test {

    private static _100.Solution1 solution1;

    private static _100.TreeNode root11;
    private static _100.TreeNode root12;
    private static _100.TreeNode root21;
    private static _100.TreeNode root22;
    private static _100.TreeNode root31;
    private static _100.TreeNode root32;

    @BeforeClass
    public static void setup() {
        solution1 = new _100.Solution1();

        root11 = new _100.TreeNode(1,
                new _100.TreeNode(2),
                new _100.TreeNode(3));
        root12 = new _100.TreeNode(1,
                new _100.TreeNode(2),
                new _100.TreeNode(3));

        root21 = new _100.TreeNode(1,
                new _100.TreeNode(2),
                null);
        root22 = new _100.TreeNode(1,
                null,
                new _100.TreeNode(2));

        root31 = new _100.TreeNode(1,
                new _100.TreeNode(2),
                new _100.TreeNode(1));
        root32 = new _100.TreeNode(1,
                new _100.TreeNode(1),
                new _100.TreeNode(2));
    }

    @Test
    public void test11() {
        assertThat(solution1.isSameTree(root11, root12)).isEqualTo(true);
    }

    @Test
    public void test12() {
        assertThat(solution1.isSameTree(root21, root22)).isEqualTo(false);
    }

    @Test
    public void test13() {
        assertThat(solution1.isSameTree(root31, root32)).isEqualTo(false);
    }
}
