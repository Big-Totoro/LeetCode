package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class _1436_Test {

    private static _1436.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1436.Solution1();
    }

    @Test
    public void test11() {
        assertThat(solution1.destCity(
                List.of(
                        List.of("London", "New York"),
                        List.of("New York", "Lima"),
                        List.of("Lima", "Sao Paulo")
                ))
        ).isEqualTo("Sao Paulo");
    }

    @Test
    public void test12() {
        assertThat(solution1.destCity(
                List.of(
                        List.of("B", "C"),
                        List.of("D", "B"),
                        List.of("C", "A")
                ))
        ).isEqualTo("A");
    }

    @Test
    public void test13() {
        assertThat(solution1.destCity(
                List.of(
                        List.of("A", "Z")
                ))
        ).isEqualTo("Z");
    }
}
