package io.bigtotoro;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _536_Test {

    private static final _536.Solution1 SOLUTION_1 = new _536.Solution1();

    @Test
    public void test11() {
        assertThat(SOLUTION_1.str2tree("4(2(3)(1))(6(5))")).isEqualTo(
                new _536.TreeNode(4,
                        new _536.TreeNode(2,
                                new _536.TreeNode(3),
                                new _536.TreeNode(1)),
                        new _536.TreeNode(6,
                                new _536.TreeNode(5),
                                null))
        );
    }
}
