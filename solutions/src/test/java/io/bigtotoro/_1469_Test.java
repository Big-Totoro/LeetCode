package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class _1469_Test {

    private static _1469.Solution1 solution1;
    private static _1469.Solution2 solution2;

    @BeforeClass
    public static void setup() {
        solution1 = new _1469.Solution1();
        solution2 = new _1469.Solution2();
    }

    @Test
    public void test11() {
        _1469.TreeNode root = new _1469.TreeNode(1,
                new _1469.TreeNode(2,
                        null,
                        new _1469.TreeNode(4)
                ),
                new _1469.TreeNode(3)
        );

        assertThat(solution1.getLonelyNodes(root)).isEqualTo(List.of(4));
    }

    @Test
    public void test12() {
        _1469.TreeNode root = new _1469.TreeNode(7,
                new _1469.TreeNode(1,
                        new _1469.TreeNode(6),
                        null
                ),
                new _1469.TreeNode(4,
                        new _1469.TreeNode(5),
                        new _1469.TreeNode(3,
                                null,
                                new _1469.TreeNode(2)))
        );

        assertThat(solution1.getLonelyNodes(root)).isEqualTo(List.of(6, 2));
    }

    @Test
    public void test13() {
        _1469.TreeNode root = new _1469.TreeNode(11,
                new _1469.TreeNode(99,
                        new _1469.TreeNode(77,
                                new _1469.TreeNode(55,
                                        new _1469.TreeNode(33),
                                        null),
                                null),
                        null
                ),
                new _1469.TreeNode(88,
                        null,
                        new _1469.TreeNode(66,
                                null,
                                new _1469.TreeNode(44,
                                        null,
                                        new _1469.TreeNode(22)
                                )
                        )
                )
        );

        assertThat(solution1.getLonelyNodes(root)).isEqualTo(List.of(33, 55, 77, 22, 44, 66));
    }

    @Test
    public void test14() {
        _1469.TreeNode root = new _1469.TreeNode(197);

        assertThat(solution1.getLonelyNodes(root)).isEmpty();
    }

    @Test
    public void test21() {
        _1469.TreeNode root = new _1469.TreeNode(1,
                new _1469.TreeNode(2,
                        null,
                        new _1469.TreeNode(4)
                ),
                new _1469.TreeNode(3)
        );

        assertThat(solution2.getLonelyNodes(root)).isEqualTo(List.of(4));
    }

    @Test
    public void test22() {
        _1469.TreeNode root = new _1469.TreeNode(7,
                new _1469.TreeNode(1,
                        new _1469.TreeNode(6),
                        null
                ),
                new _1469.TreeNode(4,
                        new _1469.TreeNode(5),
                        new _1469.TreeNode(3,
                                null,
                                new _1469.TreeNode(2)))
        );

        assertThat(solution2.getLonelyNodes(root)).isEqualTo(List.of(2, 6));
    }

    @Test
    public void test23() {
        _1469.TreeNode root = new _1469.TreeNode(11,
                new _1469.TreeNode(99,
                        new _1469.TreeNode(77,
                                new _1469.TreeNode(55,
                                        new _1469.TreeNode(33),
                                        null),
                                null),
                        null
                ),
                new _1469.TreeNode(88,
                        null,
                        new _1469.TreeNode(66,
                                null,
                                new _1469.TreeNode(44,
                                        null,
                                        new _1469.TreeNode(22)
                                )
                        )
                )
        );

        assertThat(solution2.getLonelyNodes(root)).isEqualTo(List.of(66, 44, 22, 77, 55, 33));
    }

    @Test
    public void test24() {
        _1469.TreeNode root = new _1469.TreeNode(197);

        assertThat(solution2.getLonelyNodes(root)).isEmpty();
    }
}
