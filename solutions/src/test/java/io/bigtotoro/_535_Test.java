package io.bigtotoro;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _535_Test {

    @Test
    public void test11() {
        final String originalUrl = "https://leetcode.com/problems/design-tinyurl";
        _535.Codec codec = new _535.Codec();
        String tinyUrl = codec.encode(originalUrl);
        assertThat(codec.decode(tinyUrl)).isEqualTo(originalUrl);
    }
}
