package io.bigtotoro;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _706_Test {

    @Test
    public void test11() {
        _706.MyHashMap hashMap = new _706.MyHashMap();

        hashMap.put(1, 1);
        hashMap.put(2, 2);
        assertThat(hashMap.get(1)).isEqualTo(1);
        assertThat(hashMap.get(3)).isEqualTo(-1);

        hashMap.put(2, 1);
        assertThat(hashMap.get(2)).isEqualTo(1);

        hashMap.remove(2);
        assertThat(hashMap.get(2)).isEqualTo(-1);
    }
}
