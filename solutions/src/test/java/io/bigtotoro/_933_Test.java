package io.bigtotoro;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _933_Test {

    @Test
    public void test11() {
        _933.RecentCounter recentCounter = new _933.RecentCounter();
        assertThat(recentCounter.ping(1)).isEqualTo(1);
        assertThat(recentCounter.ping(100)).isEqualTo(2);
        assertThat(recentCounter.ping(3001)).isEqualTo(3);
        assertThat(recentCounter.ping(3002)).isEqualTo(3);
    }
}
