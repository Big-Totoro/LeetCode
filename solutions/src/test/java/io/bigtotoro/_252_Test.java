package io.bigtotoro;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _252_Test {

    private static _252.Solution1 solution1 = new _252.Solution1();

    @Test
    public void test11() {
        assertThat(solution1.canAttendMeetings(new int[][]{{0, 30}, {5, 10}, {15, 20}})).isFalse();
    }

    @Test
    public void test12() {
        assertThat(solution1.canAttendMeetings(new int[][]{{7, 10}, {2, 4}})).isTrue();
    }

    @Test
    public void test13() {
        assertThat(solution1.canAttendMeetings(new int[][]{{13, 15}, {1, 13}})).isTrue();
    }

    @Test
    public void test14() {
        assertThat(solution1.canAttendMeetings(new int[][]{{9, 14}, {5, 6}, {3, 5}, {12, 19}})).isFalse();
    }
}