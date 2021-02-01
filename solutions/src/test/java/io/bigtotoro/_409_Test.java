package io.bigtotoro;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _409_Test {

    private static final _409.Solution1 SOLUTION_1 = new _409.Solution1();

    @Test
    public void test11() {
        assertThat(SOLUTION_1.longestPalindrome("abccccdd")).isEqualTo(7);
    }

    @Test
    public void test12() {
        assertThat(SOLUTION_1.longestPalindrome("a")).isEqualTo(1);
    }

    @Test
    public void test13() {
        assertThat(SOLUTION_1.longestPalindrome("bb")).isEqualTo(2);
    }

    @Test
    public void test14() {
        assertThat(SOLUTION_1.longestPalindrome("ccc")).isEqualTo(3);
    }

    @Test
    public void test15() {
        assertThat(SOLUTION_1.longestPalindrome("civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth")).isEqualTo(983);
    }
}
