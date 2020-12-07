package io.bigtotoro;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _200_Test {

    private static _200.Solution1 solution1 = new _200.Solution1();

    @Test
    public void test11() {
        assertThat(solution1.numIslands(new char[][] {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        })).isEqualTo(1);
    }

    @Test
    public void test12() {
        assertThat(solution1.numIslands(new char[][] {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        })).isEqualTo(3);
    }

    @Test
    public void test13() {
        assertThat(solution1.numIslands(new char[][] {
                {'1', '1', '1'},
                {'0', '1', '0'},
                {'1', '1', '1'}
        })).isEqualTo(1);
    }
}
