package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _872_Test {

    private static _872.Solution1 solution1 = new _872.Solution1();

    private static _872.TreeNode root11;
    private static _872.TreeNode root12;
    private static _872.TreeNode root21;
    private static _872.TreeNode root22;
    private static _872.TreeNode root31;
    private static _872.TreeNode root32;
    private static _872.TreeNode root41;
    private static _872.TreeNode root42;
    private static _872.TreeNode root51;
    private static _872.TreeNode root52;

    @BeforeClass
    public static void setup() {
        root11 = new _872.TreeNode(3,
            new _872.TreeNode(5,
                new _872.TreeNode(6),
                new _872.TreeNode(2,
                    new _872.TreeNode(7),
                    new _872.TreeNode(4)
                )
            ),
            new _872.TreeNode(1,
                new _872.TreeNode(9),
                new _872.TreeNode(8)
            )
        );
        root12 = new _872.TreeNode(3,
            new _872.TreeNode(5,
                new _872.TreeNode(6),
                new _872.TreeNode(7)
            ),
            new _872.TreeNode(1,
                new _872.TreeNode(4),
                new _872.TreeNode(2,
                    new _872.TreeNode(9),
                    new _872.TreeNode(8)
                )
            )
        );

        root21 = new _872.TreeNode(1);
        root22 = new _872.TreeNode(1);

        root31 = new _872.TreeNode(1);
        root32 = new _872.TreeNode(2);

        root41 = new _872.TreeNode(1, new _872.TreeNode(2), null);
        root42 = new _872.TreeNode(2, new _872.TreeNode(2), null);

        root51 = new _872.TreeNode(1, new _872.TreeNode(2), new _872.TreeNode(3));
        root52 = new _872.TreeNode(2, new _872.TreeNode(3), new _872.TreeNode(2));
    }

    @Test
    public void test11() {
        assertThat(solution1.leafSimilar(root11, root12)).isEqualTo(true);
    }

    @Test
    public void test12() {
        assertThat(solution1.leafSimilar(root21, root22)).isEqualTo(true);
    }

    @Test
    public void test13() {
        assertThat(solution1.leafSimilar(root31, root32)).isEqualTo(false);
    }

    @Test
    public void test14() {
        assertThat(solution1.leafSimilar(root41, root42)).isEqualTo(true);
    }

    @Test
    public void test15() {
        assertThat(solution1.leafSimilar(root51, root52)).isEqualTo(false);
    }
}
