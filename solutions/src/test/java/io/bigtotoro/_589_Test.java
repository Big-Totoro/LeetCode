package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class _589_Test {

    private static _589.Solution1 solution1;
    private static _589.Solution2 solution2;

    private static _589.Node root = new _589.Node(1,
            List.of(
                    new _589.Node(3,
                            List.of(
                                    new _589.Node(5, List.of()),
                                    new _589.Node(6, List.of())
                            )
                    ),
                    new _589.Node(2, List.of()),
                    new _589.Node(4, List.of())
            )
    );

    @BeforeClass
    public static void setup() {
        solution1 = new _589.Solution1();
        solution2 = new _589.Solution2();
    }

    @Test
    public void test11() {
        assertThat(solution1.preorder(root)).isEqualTo(List.of(1, 3, 5, 6, 2, 4));
    }

    @Test
    public void test21() {
        assertThat(solution2.preorder(root)).isEqualTo(List.of(1, 3, 5, 6, 2, 4));
    }
}
