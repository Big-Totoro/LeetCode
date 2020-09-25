package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _359_Test {
    private static _359.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _359.Solution1();
    }

    @Test
    public void test1() {
        _359.Solution1.Logger obj = new _359.Solution1.Logger();

        assertThat(obj.shouldPrintMessage(1, "foo")).isEqualTo(true);
        assertThat(obj.shouldPrintMessage(2, "bar")).isEqualTo(true);
        assertThat(obj.shouldPrintMessage(3, "foo")).isEqualTo(false);
        assertThat(obj.shouldPrintMessage(8, "bar")).isEqualTo(false);
        assertThat(obj.shouldPrintMessage(10, "foo")).isEqualTo(false);
        assertThat(obj.shouldPrintMessage(11, "foo")).isEqualTo(true);
    }

}
