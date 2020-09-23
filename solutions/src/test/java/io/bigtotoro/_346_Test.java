package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _346_Test {
    private static _346.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _346.Solution1();
    }

    @Test
    public void test1() {
        _346.Solution1.MovingAverage obj = new _346.Solution1.MovingAverage(3);

        assertThat(obj.next(1)).isEqualTo(1);
        assertThat(obj.next(10)).isEqualTo((1.0 + 10.0) / 2.0);
        assertThat(obj.next(3)).isEqualTo((1.0 + 10.0 + 3.0) / 3.0);
        assertThat(obj.next(5)).isEqualTo((10.0 + 3.0 + 5.0) / 3.0);
    }
}
