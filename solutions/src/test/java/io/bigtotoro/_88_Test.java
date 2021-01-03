package io.bigtotoro;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _88_Test {

    private static final _88.Solution1 SOLUTION_1 = new _88.Solution1();
    private static final _88.Solution2 SOLUTION_2 = new _88.Solution2();
    private static final _88.Solution3 SOLUTION_3 = new _88.Solution3();

    @Test
    public void test11() {
        int[] array1 = new int[] {1, 2, 3, 0, 0, 0};
        int[] array2 = new int[] {2 ,5, 6};
        SOLUTION_1.merge(array1, 3, array2, 3);
        assertThat(array1).isEqualTo(new int[] {1, 2, 2, 3, 5, 6});
    }

    @Test
    public void test12() {
        int[] array1 = new int[] {1};
        int[] array2 = new int[0];
        SOLUTION_1.merge(array1, 1, array2, 0);
        assertThat(array1).isEqualTo(new int[] {1});
    }

    @Test
    public void test21() {
        int[] array1 = new int[] {1, 2, 3, 0, 0, 0};
        int[] array2 = new int[] {2 ,5, 6};
        SOLUTION_2.merge(array1, 3, array2, 3);
        assertThat(array1).isEqualTo(new int[] {1, 2, 2, 3, 5, 6});
    }

    @Test
    public void test22() {
        int[] array1 = new int[] {1};
        int[] array2 = new int[0];
        SOLUTION_2.merge(array1, 1, array2, 0);
        assertThat(array1).isEqualTo(new int[] {1});
    }

    @Test
    public void test23() {
        int[] array1 = new int[] {4, 0, 0, 0, 0, 0};
        int[] array2 = new int[] {1, 2, 3, 5, 6};
        SOLUTION_2.merge(array1, 1, array2, 5);
        assertThat(array1).isEqualTo(new int[] {1, 2, 3, 4, 5, 6});
    }

    @Test
    public void test31() {
        int[] array1 = new int[] {1, 2, 3, 0, 0, 0};
        int[] array2 = new int[] {2 ,5, 6};
        SOLUTION_3.merge(array1, 3, array2, 3);
        assertThat(array1).isEqualTo(new int[] {1, 2, 2, 3, 5, 6});
    }

    @Test
    public void test32() {
        int[] array1 = new int[] {1};
        int[] array2 = new int[0];
        SOLUTION_3.merge(array1, 1, array2, 0);
        assertThat(array1).isEqualTo(new int[] {1});
    }

    @Test
    public void test33() {
        int[] array1 = new int[0];
        int[] array2 = new int[] {1};
        SOLUTION_3.merge(array1, 0, array2, 1);
        assertThat(array1).isEqualTo(new int[] {1});
    }
}
