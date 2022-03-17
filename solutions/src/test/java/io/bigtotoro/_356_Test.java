package io.bigtotoro;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class _356_Test {

    private _356.Solution1 solution1 = new _356.Solution1();

    @Test
    public void test11() {
        assertThat(solution1.isReflected(new int[][]{{1, 1}, {-1, 1}})).isTrue();
    }

    @Test
    public void test12() {
        assertThat(solution1.isReflected(new int[][]{{1, 1}, {-1, -1}})).isTrue();
    }
}

class I {

}