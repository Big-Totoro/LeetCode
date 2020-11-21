package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class _590_Test {

    private static _590.Solution1 solution1;
    private static _590.Solution2 solution2;

    private static _590.Node root = new _590.Node(1,
            List.of(
                    new _590.Node(3,
                            List.of(
                                    new _590.Node(5, List.of()),
                                    new _590.Node(6, List.of())
                            )
                    ),
                    new _590.Node(2, List.of()),
                    new _590.Node(4, List.of())
            )
    );

    @BeforeClass
    public static void setup() {
        solution1 = new _590.Solution1();
        solution2 = new _590.Solution2();
    }

    @Test
    public void test11() {
        assertThat(solution1.postorder(root)).isEqualTo(List.of(5, 6, 3, 2, 4, 1));
    }

    @Test
    public void test21() {
        assertThat(solution2.postorder(root)).isEqualTo(List.of(5, 6, 3, 2, 4, 1));
    }
}
