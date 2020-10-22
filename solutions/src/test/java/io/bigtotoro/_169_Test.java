package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _169_Test {

    private static _169.Solution1 solution1;
    private static _169.Solution2 solution2;
    private static _169.Solution3 solution3;
    private static _169.Solution4 solution4;
    private static _169.Solution5 solution5;

    @BeforeClass
    public static void setup() {
        solution1 = new _169.Solution1();
        solution2 = new _169.Solution2();
        solution3 = new _169.Solution3();
        solution4 = new _169.Solution4();
        solution5 = new _169.Solution5();
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
        assertThat(solution2.majorityElement(new int[] {3, 2, 3})).isEqualTo(3);
    }

    @Test
    public void test22() {
        assertThat(solution2.majorityElement(new int[] {2, 2, 1, 1, 1, 2, 2})).isEqualTo(2);
    }

    @Test
    public void test23() {
        assertThat(solution2.majorityElement(new int[] {2, 2, 1, 1, 1, 2, 2, 2, 3, 4, 5})).isEqualTo(2);
    }

    @Test
    public void test31() {
        assertThat(solution3.majorityElement(new int[] {3, 2, 3})).isEqualTo(3);
    }

    @Test
    public void test32() {
        assertThat(solution3.majorityElement(new int[] {2, 2, 1, 1, 1, 2, 2})).isEqualTo(2);
    }

    @Test
    public void test41() {
        assertThat(solution4.majorityElement(new int[] {3, 2, 3})).isEqualTo(3);
    }

    @Test
    public void test42() {
        assertThat(solution4.majorityElement(new int[] {2, 2, 1, 1, 1, 2, 2})).isEqualTo(2);
    }

    @Test
    public void test51() {
        assertThat(solution5.majorityElement(new int[] {3, 2, 3})).isEqualTo(3);
    }

    @Test
    public void test52() {
        assertThat(solution5.majorityElement(new int[] {2, 2, 1, 1, 1, 2, 2})).isEqualTo(2);
    }
}