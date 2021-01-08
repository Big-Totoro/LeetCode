package io.bigtotoro;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _27_Test {

    private static final _27.Solution1 SOLUTION_1 = new _27.Solution1();
    private static final _27.Solution2 SOLUTION_2 = new _27.Solution2();

    @Test
    public void test11() {
        int[] array = new int[] {3, 2, 2, 3};
        assertThat(SOLUTION_1.removeElement(array, 3)).isEqualTo(2);
        assertThat(array).isEqualTo(new int[] {2, 2, 2, 3});
    }

    @Test
    public void test12() {
        int[] array = new int[] {0, 1, 2, 2, 3, 0, 4, 2};
        assertThat(SOLUTION_1.removeElement(array, 2)).isEqualTo(5);
        assertThat(array).isEqualTo(new int[] {0, 1, 4, 0, 3, 0, 4, 2});
    }

    @Test
    public void test13() {
        int[] array = new int[] {1};
        assertThat(SOLUTION_1.removeElement(array, 1)).isEqualTo(0);
        assertThat(array).isEqualTo(new int[] {1});
    }

    @Test
    public void test14() {
        int[] array = new int[] {4, 5};
        assertThat(SOLUTION_1.removeElement(array, 4)).isEqualTo(1);
        assertThat(array).isEqualTo(new int[] {5, 5});
    }

    @Test
    public void test21() {
        int[] array = new int[] {3, 2, 2, 3};
        assertThat(SOLUTION_2.removeElement(array, 3)).isEqualTo(2);
        assertThat(array).isEqualTo(new int[] {2, 2, 2, 3});
    }

    @Test
    public void test22() {
        int[] array = new int[] {0, 1, 2, 2, 3, 0, 4, 2};
        assertThat(SOLUTION_2.removeElement(array, 2)).isEqualTo(5);
        assertThat(array).isEqualTo(new int[] {0, 1, 3, 0, 4, 0, 4, 2});
    }

    @Test
    public void test23() {
        int[] array = new int[] {1};
        assertThat(SOLUTION_2.removeElement(array, 1)).isEqualTo(0);
        assertThat(array).isEqualTo(new int[] {1});
    }

    @Test
    public void test24() {
        int[] array = new int[] {4, 5};
        assertThat(SOLUTION_2.removeElement(array, 4)).isEqualTo(1);
        assertThat(array).isEqualTo(new int[] {5, 5});
    }
}
