package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _169_Test {

    private static _169.Solution1 solution1;
    private static _169.Solution2 solution2;
    private static _169.Solution3 solution3;
    private static _169.Solution4 solution4;

    @BeforeClass
    public static void setup() {
        solution1 = new _169.Solution1();
        solution2 = new _169.Solution2();
        solution3 = new _169.Solution3();
        solution4 = new _169.Solution4();
    }

    @Test
    public void test11() {
        assertThat(solution1.majorityElement(new int[] {3, 2, 3})).isEqualTo(3);
    }

    @Test
    public void test12() {
        assertThat(solution1.majorityElement(new int[] {2, 2, 1, 1, 1, 2, 2})).isEqualTo(2);
    }

    @Test
    public void test21() {
        assertThat(solution1.majorityElement(new int[] {3, 2, 3})).isEqualTo(3);
    }

    @Test
    public void test22() {
        assertThat(solution1.majorityElement(new int[] {2, 2, 1, 1, 1, 2, 2})).isEqualTo(2);
    }

    @Test
    public void test31() {
        assertThat(solution1.majorityElement(new int[] {3, 2, 3})).isEqualTo(3);
    }

    @Test
    public void test32() {
        assertThat(solution1.majorityElement(new int[] {2, 2, 1, 1, 1, 2, 2})).isEqualTo(2);
    }

    @Test
    public void test41() {
        assertThat(solution1.majorityElement(new int[] {3, 2, 3})).isEqualTo(3);
    }

    @Test
    public void test42() {
        assertThat(solution1.majorityElement(new int[] {2, 2, 1, 1, 1, 2, 2})).isEqualTo(2);
    }
}