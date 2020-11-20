package io.bigtotoro;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _806_Test {

    private static _806.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _806.Solution1();
    }

    @Test
    public void test11() {
        assertThat(solution1.numberOfLines(
                new int[] {10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10},
                "abcdefghijklmnopqrstuvwxyz"
        )).isEqualTo(new int[] {3, 60});
    }

    @Test
    public void test12() {
        assertThat(solution1.numberOfLines(
                new int[] {4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10},
                "bbbcccdddaaa"
        )).isEqualTo(new int[] {2, 4});
    }

    @Test
    public void test13() {
        assertThat(solution1.numberOfLines(
                new int[] {7,5,4,7,10,7,9,4,8,9,6,5,4,2,3,10,9,9,3,7,5,2,9,4,8,9},
                "zlrovckbgjqofmdzqetflraziyvkvcxzahzuuveypqxmjbwrjvmpdxjuhqyktuwjvmbeswxuznumazgxvitdrzxmqzhaaudztgie"
        )).isEqualTo(new int[] {7, 69});
    }

    @Test
    public void test14() {
        assertThat(solution1.numberOfLines(
                new int[] {4,10,8,5,6,6,10,5,10,5,5,6,4,9,9,10,9,3,10,7,2,9,8,8,6,8},
                "hoahfwpxuamjiwhqlpgruyenhewsklnaxjeewkaygzrmehecqjdtlnazzsrumcaayqiliugomqamtjdgybqhzlzafypgverqsqcuvxmnhdfemgulvgnrgqniigzkzeupqqwwmclvjvynxtcqzgowzmbnghwsozmmznvftwqutvpjtpxhbyjynotndprhqdwjfnynqrdcmmngrfomlwewqfsluykorioqzbidrqdhghdhvmvozfqwnkkzejzymmmsxnynnnwziuleqqldweuzcflfukturawrkwnaikhwwczsiwwvvhnnjfkjfrifcfsraygrhacmlcysfecphyyabdgtkxhzforogktggkvgxrzgdgwhjervlhfzinrxltbwmbcbiyscimtiiiftkwqbnxsnhmgfcqdtmxmnatvungrbgsgnabtpafyvqmfmbuoieioarohsaduujsvtjwwwmhrlcjwmioxpcvjdwmrgvcicwgxmaabpzfzihwfelnghyxcvxkgimdrfsxrxbanamjijunggxsnxwvemcdlmdegaaqcnhpcfsrzfhxmocblhldxqgyxujauugtsicgcwbncjyuetbtkjkqhsnuwlnwqocmmrsvbkkpbmxizmcoucijakhrncugjhcbrrzgfryjejrjfurmctqerihanyqabqbclsyidnjswyywwoagchyicmuoibkchkkwylogbagcnlppvbahvftcffhzsgrmjkjviqbocbucacvqpyusupyguhokumfozxpaibxkaatewyikbiudqzufnlcyohoqfdxnrlkswpeftcvwsfiatahnzrbzjxueijllijdmizilplawlsuzuehopxqhvapnefwrtryivouyindzbsextroodelcpgkgbvdtahgocvmzzavlfftylsaiofudcjlgmvswrmwidawaxulpoeglkaksskkneyactcrbtwvzjuvxpvfjihgtdxemsjiwrd"
        )).isEqualTo(new int[] {73, 8});
    }
}
