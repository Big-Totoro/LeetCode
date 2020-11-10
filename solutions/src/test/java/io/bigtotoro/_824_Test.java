package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _824_Test {

    private static _824.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _824.Solution1();
    }

    @Test
    public void test11() {
        assertThat(solution1.toGoatLatin("I speak Goat Latin"))
                .isEqualTo("Imaa peaksmaaa oatGmaaaa atinLmaaaaa");
    }

    @Test
    public void test12() {
        assertThat(solution1.toGoatLatin("The quick brown fox jumped over the lazy dog"))
                .isEqualTo("heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa " +
                        "azylmaaaaaaaaa ogdmaaaaaaaaaa");
    }
}
