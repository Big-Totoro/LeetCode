package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _21_Test {

    private static _21.Solution1 solution1;
    private static _21.Solution2 solution2;
    private static _21.ListNode list1;
    private static _21.ListNode list2;
    private static _21.ListNode result;

    @BeforeClass
    public static void setup() {
        solution1 = new _21.Solution1();
        solution2 = new _21.Solution2();

        list1 = new _21.ListNode(1,
                new _21.ListNode(2,
                        new _21.ListNode(4)
                )
        );
        list2 = new _21.ListNode(1,
                new _21.ListNode(3,
                        new _21.ListNode(4)
                )
        );
        result = new _21.ListNode(1,
                new _21.ListNode(1,
                        new _21.ListNode(2,
                                new _21.ListNode(3,
                                        new _21.ListNode(4,
                                                new _21.ListNode(4)
                                        )
                                )
                        )
                )
        );
    }

    @Test
    public void test11() {
        assertThat(solution1.mergeTwoLists(list1, list2)).isEqualTo(result);
    }

    @Test
    public void test21() {
        assertThat(solution2.mergeTwoLists(list1, list2)).isEqualTo(result);
    }

}
